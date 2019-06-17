package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import Model.ResultMsg;
import Model.Singer;
import Service.SingerService;

@Controller
public class SingerController {
@Autowired
private SingerService singerService;

	@RequestMapping("/add_singer")
	public ModelAndView add_singer() {
		ModelAndView mView=new ModelAndView("add_singer");
		return mView;
	}
	
	
	 @ResponseBody
	    @RequestMapping("/add_singer_submit")
	    public ResultMsg add_singer_Submit(String singer_name) {
	        //新增歌手
	        Singer singer = new Singer();
	        singer.setSinger_name(singer_name);
	  
	        int i = singerService.addSinger(singer);
	        System.out.println(i);
	        
	        
	        if(i>0){
	            return new ResultMsg(1,"新增歌手成功！");
	        }else{
	            return new ResultMsg(0,"新增歌手失败！");
	        }
	    }
	
	
	@RequestMapping("/singer_list")
	public ModelAndView singer_list() {
		ModelAndView mView=new ModelAndView("singer_list");
		return mView;
	}
	
}
