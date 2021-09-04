package in.happycoding.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DataValidation implements Filter
{	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		
		System.out.println("Data validation called");
		
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		String username = servletRequest.getParameter("username");
		if(username == null)
		{
			System.out.println("Username not found, please enter valid data...");
			HttpServletResponse servletResponse = (HttpServletResponse) response;
			servletResponse.sendRedirect("input.html");
		}
		
		
		chain.doFilter(request, response);
	}

	
}
