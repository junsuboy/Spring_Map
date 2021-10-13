package com.junsu.map;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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


	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String getMap(Model model) {
		// model.addAttribute("serverTime", formattedDate );
		return "/map";
	}
	@RequestMapping(value = "/map", method = RequestMethod.POST)
	public String postMap(Model model) {
		// model.addAttribute("serverTime", formattedDate );
		return "/map";
	}


	@RequestMapping(value = "/popup/jusoPopup", method = RequestMethod.GET)
	public String getPopup(Model model) {
		// model.addAttribute("serverTime", formattedDate );
		return "popup/jusoPopup";
	}

	@RequestMapping(value = "/popup/jusoPopup", method = RequestMethod.POST)
	public void postPopup(Model model) {
	}

	@RequestMapping(value = "/showMap", method = RequestMethod.GET)
	public String getShowMap(Model model) {
		// model.addAttribute("serverTime", formattedDate );
		return "/showMap";
	}

	@RequestMapping(value = "/showMap", method = RequestMethod.POST)
	public String postShowMap(Model model) {
		// model.addAttribute("serverTime", formattedDate );
		return "/showMap";
	}


	@RequestMapping(value = "/1", method = RequestMethod.GET)
	public String get1(Model model) {
		// model.addAttribute("serverTime", formattedDate );
		return "/1";
	}


	@RequestMapping(value = "/2", method = RequestMethod.GET)
	public String get2(Model model) {
		// model.addAttribute("serverTime", formattedDate );
		return "/2";
	}

	@RequestMapping(value = "/2", method = RequestMethod.POST)
	public String post2(Model model) {
		// model.addAttribute("serverTime", formattedDate );
		return "/2";
	}

}
