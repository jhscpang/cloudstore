package cn.edu.bjtu.controller;

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
public class RegisterController {

	/**
	 * @Description:重定向默认情况下去欢迎页
	 * @exception:
	 */
	@RequestMapping("/register.do")
	public String register(HttpServletResponse response, HttpServletRequest request) throws Exception {
		return "WEB-INF/jsp/register";
	}

	@RequestMapping("/EmailRegister.do")
	public String EmailRegister(HttpServletResponse response, HttpServletRequest request, String username,
			String password, String passwordAgain, String email) throws Exception {
		//数据传过来之前， 前台应该做了数据校验, 字段不能为空
		if("".equals(email) || "".equals(username) || "".equals(password) || "".equals(passwordAgain)) {
			request.setAttribute("fieldError", "所填每个字段都不能为空！");
			return "WEB-INF/jsp/register";
		}
		//交给服务层处理
		
		return "WEB-INF/jsp/register";
	}

}
