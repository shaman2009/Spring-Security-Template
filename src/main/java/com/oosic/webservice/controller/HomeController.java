package com.oosic.webservice.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.oosic.webservice.model.vo.Greeting;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hello, %s!";
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
    @RequestMapping("/Greeting")
    public ResponseEntity<Greeting> greeting(@RequestParam(value="name", required=false, defaultValue="World") String name  , WebRequest request) {
    	System.out.println(request.getHeader("Authorization"));
    	System.out.println(request.getParameter("account"));
    	List<String> string = new ArrayList<String>();
    	string.add("1");
    	string.add("2");
    	string.add("3");
    	string.add("4");
    	Greeting greeting = new Greeting(counter.incrementAndGet(), "x", string);
    	HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Greeting>(greeting, headers, HttpStatus.OK);
    }
    
    @RequestMapping("/greeting")
    public @ResponseBody Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
}
