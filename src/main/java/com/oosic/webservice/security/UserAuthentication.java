package com.oosic.webservice.security;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.oosic.webservice.model.po.Account;

@Component
public class UserAuthentication {
	public UserAuthentication() {
	}

	public void authorize(Account user) {
		RequestContextHolder.currentRequestAttributes().setAttribute("user",
				user, RequestAttributes.SCOPE_SESSION);
	}

	public Account getCurrentUser() {
		Account s =  (Account) RequestContextHolder.currentRequestAttributes().getAttribute("user",
				RequestAttributes.SCOPE_SESSION);
		return s;
	}
}
