package com.dagurasu.patterns.interceptingfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class UserAgentFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String userAgent = ((HttpServletRequest) request).getHeader("User-Agent");
		System.out.println(userAgent);
		
		if (userAgent.contains("Chrome")) {
			chain.doFilter(request, response);
		} else {
			request.getRequestDispatcher("badBrowser.jsp");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
