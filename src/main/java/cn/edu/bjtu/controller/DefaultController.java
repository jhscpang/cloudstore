package cn.edu.bjtu.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * springmvc的控制类,处理所有默认情况下的跳转
 * 
 * @author 庞超
 *
 */
@Controller
public class DefaultController {

	/**
	 * @Description:重定向默认情况下去欢迎页
	 * @exception:
	 */
	@RequestMapping("/index.do")
	public String index(HttpServletResponse response, HttpServletRequest request) throws Exception{
		return "WEB-INF/jsp/login";
	}
}
