package ua.dev.workshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorldControllerTest")
	public String showTestPage() {
		return "helloWorld";
	}
}
