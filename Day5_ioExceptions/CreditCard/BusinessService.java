package com.training;

import java.io.*;

public class BusinessService { 
	
	public boolean writeFile(int choice,CreditCard[] holderList)
	{
		boolean result = false;
		switch (choice) {
		case 1:
			 result = writeObject(holderList);
			 break;
		case 2: 
            try{
			result = writeFile(new File("card.txt"),holderList);
            } 
            catch(IOException e)
            {
            	e.getMessage();
            } 
            break;
			
		default:
			break;
			
		}
		return result;
	}

	public boolean writeObject(CreditCard[] holderList)
	{
		boolean persisted = false;
		ObjectOutputStream outstream = null;
		try{
		outstream = new ObjectOutputStream(new FileOutputStream(new File("card.ser")));
		for(int j=0;j<holderList.length;j++)
		{
			outstream.writeObject(holderList[j]);
		}
		
		
		persisted = true; 
		}   
		catch(IOException e){
			System.err.println(e.getMessage());
		}
		finally{
			try{
				outstream.close();
			}catch(IOException e){
				e.printStackTrace();
				
			}
		}
		return persisted;
	} 
		
		public CreditCard[] readObject()
		{
			CreditCard holderList[] = new CreditCard[5];
			ObjectInputStream input = null;
			int j=0;
			try{
				  input =new ObjectInputStream(new FileInputStream("card.ser")); 
				  while(j<3)
				  {
				  holderList[j] = (CreditCard)input.readObject();
				  j++;
				  }
			} 
			catch(IOException e)
			{
				System.err.println(e.getMessage());
			} 
			catch(ClassNotFoundException e)
			{
				System.err.println(e.getMessage());
			} 
			
			finally{
				try{
					input.close();
				}catch(IOException e){
					e.printStackTrace();
					
				}
			}
			return holderList;
		} 
		
		public boolean writeFile(File file,CreditCard[] holderList) throws IOException {
			
			PrintWriter writer=null;
			boolean result = false;
			try {
				 writer=new PrintWriter(new FileWriter(file,true));
				 
				 for(int j=0;j<holderList.length;j++)
					{
					 writer.println(holderList[j].toString());
					} 
				 result = true;
				 
				 
				 
				
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			finally {
				writer.close();
			} 
			return result;
		}
		
	public CreditCard[] readfile(File file) throws IOException {
			
		BufferedReader reader = null;
		int i =0;
		CreditCard cardList[] = new CreditCard[3];
		
			try {
				reader= new BufferedReader(new FileReader(file));
				
				String line=null;
				while((line=reader.readLine())!=null)
				{   
					String[] result = line.split("[,]",0);
					CreditCard card = new CreditCard();
					card.setCustomerName(result[0]);
					
					card.setExpiryDate(result[1]);
					card.setCardLimit(Double.parseDouble(result[2]));
					cardList[i] = card;
					i++;
				}
					
				}
			
			 catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			finally {
				reader.close();
			} 
			return cardList;
	}
	public CreditCard[] deleteFromFile(CreditCard[] holderList,String customerName)	
	{
		int position = 0;
		int length = holderList.length;
		CreditCard newList[] = new CreditCard[length];
		for(int i=0;i<length;i++)
		{
			if(holderList[i].getCustomerName().equals(customerName))
			{
				position = i;
				position++;
				break;
			} 
			
			
		}  
		System.out.println("positon" + position);
		
		
		//System.arraycopy(holderList,0, newList,0,position-1);
		System.arraycopy(holderList,position, holderList,position-1,length-position);
		
		return holderList;
	}
	
}
