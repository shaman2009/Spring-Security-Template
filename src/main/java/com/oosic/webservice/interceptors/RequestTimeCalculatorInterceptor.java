package com.oosic.webservice.interceptors;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestTimeCalculatorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Date now = new Date();
		request.setAttribute("inTime", now.getTime());
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		Date now = new Date();
		long span = now.getTime() - (Long) request.getAttribute("inTime");
		logger.info("Request time: " + span + "ms");
	};

	private static Logger logger = Logger
			.getLogger(RequestTimeCalculatorInterceptor.class);
}
