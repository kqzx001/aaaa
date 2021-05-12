package com.multi.exam4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value = "/test1" , method =RequestMethod.GET)
	public String loginform() {
		return "/test1";
	}
	
	@RequestMapping(value = "/test1" , method =RequestMethod.POST ,
	produces ={"application/json;charset=utf-8"} )
	@ResponseBody
	public String loginresult(String id , String pw) {
		String result;
		if(id.equals("a") && pw.equals("b")) {
			result = "{\"process\":\"a b\" ,\"process1\":\"Data: " + id + " 님 login ok \\nStatus:success\"}"  ;
			//result = "{\"process\":\" "+id+" 로그인 \"}" ; 
			
		}
		else {
			result = "{\"process\":\"비정상로그인\"}";
			
		}
		
			
		return result;
		}
}
	

	