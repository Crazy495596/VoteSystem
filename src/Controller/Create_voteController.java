package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Create_voteController {
	@RequestMapping("/create_vote")
	public ModelAndView create_vote() {
		ModelAndView mView=new ModelAndView("create_vote");
		return mView;
	}
}
