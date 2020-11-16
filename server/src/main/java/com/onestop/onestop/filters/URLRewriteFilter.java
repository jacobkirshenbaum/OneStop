package com.onestop.onestop.filters;

import org.springframework.stereotype.Component;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class URLRewriteFilter implements Filter {
    private final String USER_PATTERN = "^\\/users\\/(.+)$";
    private final String BOOKMARK_PATTERN = "^\\/bookmarks\\/(.+)$";
    private final String POINT_EXCLUSION_PATTERN = "^([^.]+)$";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest servletRequest = (HttpServletRequest) request;
        String requestURI = servletRequest.getRequestURI();
        String contextPath = servletRequest.getContextPath();
        if (!requestURI.equals(contextPath) && (!requestURI.matches(USER_PATTERN) || !requestURI.matches(BOOKMARK_PATTERN)) &&
            requestURI.matches(POINT_EXCLUSION_PATTERN)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/");
            dispatcher.forward(request, response);
            return;
        }
        chain.doFilter(request, response);
    }
}
