package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MusicController {
	
	@RequestMapping("/music_list")
	public ModelAndView music_list() {
		ModelAndView mView=new ModelAndView("music_list");
		return mView;
	}	
	
	@RequestMapping("/add_music")
	public ModelAndView add_music() {
		ModelAndView mView=new ModelAndView("add_music");
		return mView;
	}

}
