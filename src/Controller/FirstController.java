package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import Service.GetIpService;

@Controller
public class FirstController {
	@Autowired
	private GetIpService getIpService;
	
	@ResponseBody
	@RequestMapping("/index//")
	public String sd(HttpServletRequest request) {
		String ip=getIpService.get(request);
		//ModelAndView mView=new ModelAndView("index");	
		return ip;
	}

}
