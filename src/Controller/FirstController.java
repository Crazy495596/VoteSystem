package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	@RequestMapping("/index")
	public ModelAndView sd() {
		ModelAndView mView=new ModelAndView("index");
		return mView;
	}

}
