package com.oosic.webservice.exception.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.oosic.webservice.errors.SpringTemplateErrors;
import com.oosic.webservice.errors.SpringTemplateException;
import com.oosic.webservice.utilities.JSONUtilities;

public class SpringTemplateErrorResolver implements HandlerExceptionResolver {

	private static final int Internal_Server_Error_CODE = 500;

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3) {
		if (!enable)
			return null;
		SpringTemplateException exception;
		if (arg3.getClass() == SpringTemplateException.class) {
			exception = (SpringTemplateException) arg3;
		} else if(arg3.getClass().equals(JSONException.class)){
			exception = new SpringTemplateException(SpringTemplateErrors.ILLEGAL_PARAMETER_ERROR_CODE, 
					SpringTemplateErrors.ILLEGAL_PARAMETER_ERROR_MESSAGE, arg3);
		}else {
			exception = new SpringTemplateException(
					SpringTemplateErrors.SERVER_INTERNAL_ERROR_CODE,
					SpringTemplateErrors.SERVER_INTERNAL_ERROR_MESSAGE, arg3);
		}
		logger.error("Error catched by OoPassErrorResolver: ", exception);
		JSONObject json = JSONUtilities.getErrorJSON(exception);
		arg1.setStatus(Internal_Server_Error_CODE);
		return new ModelAndView("json", "j", json.toString());
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	private boolean enable;
	private Logger logger = Logger.getLogger(SpringTemplateErrorResolver.class);
}
