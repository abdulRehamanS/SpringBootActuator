package In.Abdul.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String WelcomeMsg() {

		return "this is spring boot actuator";

	}

}
