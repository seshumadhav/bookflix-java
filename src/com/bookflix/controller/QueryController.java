package com.bookflix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author seshu
 *
 */
@Controller
public class QueryController {

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		System.out.println("adsfasdfdsa");
		String queryResponse = "I received. U stay cool";
		return new ModelAndView("response", "queryResponse", queryResponse);
	}
}
