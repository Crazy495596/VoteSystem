package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SingerController {

	@RequestMapping("/add_singer")
	public ModelAndView add_singer() {
		ModelAndView mView=new ModelAndView("add_singer");
		return mView;
	}
	
	@RequestMapping("/singer_list")
	public ModelAndView singer_list() {
		ModelAndView mView=new ModelAndView("singer_list");
		return mView;
	}
	
}
