package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
		@RequestMapping("/login")
		public ModelAndView Login() {
			ModelAndView mView=new ModelAndView("login");
			return mView;
		}
		
		@RequestMapping("/welcome")
		public ModelAndView welcome() {
			ModelAndView mView=new ModelAndView("welcome");
			return mView;
		}
		
		@RequestMapping("/role_list")
		public ModelAndView role_list() {
			ModelAndView mView=new ModelAndView("role_list");
			return mView;
		}
		
		@RequestMapping("/singer_list")
		public ModelAndView singer_list() {
			ModelAndView mView=new ModelAndView("singer_list");
			return mView;
		}
		
		@RequestMapping("/music_list")
		public ModelAndView music_list() {
			ModelAndView mView=new ModelAndView("music_list");
			return mView;
		}
		
		@RequestMapping("/add_singer")
		public ModelAndView add_singer() {
			ModelAndView mView=new ModelAndView("add_singer");
			return mView;
		}
		
		@RequestMapping("/add_music")
		public ModelAndView add_music() {
			ModelAndView mView=new ModelAndView("add_music");
			return mView;
		}
		
		@RequestMapping("/create_vote")
		public ModelAndView create_vote() {
			ModelAndView mView=new ModelAndView("create_vote");
			return mView;
		}
}
