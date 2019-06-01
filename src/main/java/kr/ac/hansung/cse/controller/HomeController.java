package kr.ac.hansung.cse.controller;	
//app.properties 에 kr~.cse 아래는 다 디버그 되게 설정되어잇음

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	static Logger logger = LoggerFactory.getLogger(HomeController.class);

	// @RequestMapping(value="/", method = RequestMethod.GET). 이거랑 아래랑 같은의미
	@GetMapping("/")
	public String home(Model model) {

		logger.debug("Calling home( )");

		model.addAttribute("message", "hello world");
		return "index";

	}
}
