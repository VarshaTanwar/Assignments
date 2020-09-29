

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FooterServlet
 */
@WebServlet(description = "FooterServlet", urlPatterns = { "/FooterServlet" }, initParams = {
        @WebInitParam (name = "adminId", value = "admin@abc.com")
} )
public class FooterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String adminId = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FooterServlet() {
        super();
        // TODO Auto-generated constructor stub
    } 
    
    
    

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}




	@Override
	public String getInitParameter(String name) {
		// TODO Auto-generated method stub
		return super.getInitParameter(name);
	}




	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return super.getInitParameterNames();
	}




	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return super.getServletConfig();
	}




	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return super.getServletContext();
	}




	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return super.getServletInfo();
	}




	@Override
	public String getServletName() {
		// TODO Auto-generated method stub
		return super.getServletName();
	}




	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}




	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		adminId = config.getInitParameter("adminId");
		super.init(config);
	}




	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		super.log(message);
	}




	@Override
	public void log(String message, Throwable t) {
		// TODO Auto-generated method stub
		super.log(message, t);
	}




	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name = request.getParameter("DesignerName");
		
		request.setAttribute("name",name);
		request.setAttribute("email", this.adminId);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/footer.jsp");
		dispatcher.forward(request,response);
		
	}

}
