package com.oosic.webservice.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DebugDumpInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if (!enable)
			return true;
		logger.info("<<<<<<<<<<<< Start Request: " + request.getRequestURI()
				+ " >>>>>>>>>>>>");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, org.springframework.web.servlet.ModelAndView modelAndView)
			throws Exception {
		if (!enable)
			return;
		logger.info(">>>>>>>>>>>>End Request: " + request.getRequestURI() + " ");
		logger.info("<<<<<<<<<<<< Response: " + response.toString());
		return;
	};


	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	private boolean enable;

	private static Logger logger = Logger.getLogger(DebugDumpInterceptor.class);
}
