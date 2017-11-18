package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entidades.Usuario;


@WebFilter("/*")
public class LoginFilter implements Filter {


    public LoginFilter() {

    }


	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		HttpSession session = req.getSession();
		String path = req.getContextPath();
		String uri = req.getRequestURI();
		
		Usuario logado = (Usuario)session.getAttribute(Usuario.LOGADO);
		
		
	String command = req.getParameter("command");
	if(command == null)
	{
		command = "";
	}
		
		if(logado != null || uri.equals(path+"/Login.jsp")
		|| command.equals("FazerLogin")
		|| (uri.endsWith(".js")
		|| uri.endsWith(".css")))
		{
			chain.doFilter(request, response);
		} 
		else
		{
			res.sendRedirect("Login.jsp");
		}
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
