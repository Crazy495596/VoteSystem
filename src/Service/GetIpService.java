package Service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class GetIpService {
	
	public String get(HttpServletRequest request) {
	
	 String referrer = request.getHeader("Referer");
     System.out.println(referrer);
     String remoteAddr = request.getRemoteAddr();
     if(remoteAddr.equals("0:0:0:0:0:0:0:1")){
         System.out.println("您的ip地址为：127.0.0.1");
     }else{
         System.out.println("您的ip地址为：" + remoteAddr);
     }
     String requestHeader = request.getHeader("User-Agent");
     int index_one = requestHeader.indexOf("(");
     String requestBody = requestHeader.substring(index_one+1);
     String userInfo = requestBody.substring(0, requestBody.indexOf(")"));
     String[] userInfoList = userInfo.split(";");
     int length = userInfoList.length;
     String os = userInfoList[0];
     String mobileInfo = userInfoList[length - 1];
     if(os.equals("Windows NT 6.1")){
         System.out.println("您的操作系统为：windows7");
     }else{
         System.out.println("您的操作系统为：" + os);
     }
     int index = mobileInfo.indexOf("/");
     if(index > 0){
         mobileInfo = mobileInfo.substring(0, mobileInfo.indexOf("/") - 5);
         System.out.println("您的手机型号为：" + mobileInfo);
     }
     
     return remoteAddr;
     
	}



}
