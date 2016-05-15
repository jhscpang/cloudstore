package cn.edu.bjtu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.bjtu.model.UserDetailInfo;
import cn.edu.bjtu.service.IAboutMeService;

/**
 * springmvc的控制类,处理所有默认情况下的跳转
 * 
 * @author 庞超
 *
 */
@Controller
public class AboutMeController {

	private IAboutMeService aboutMeService;

	public IAboutMeService getAboutMeService() {
		return aboutMeService;
	}

	@Resource
	public void setAboutMeService(IAboutMeService aboutMeService) {
		this.aboutMeService = aboutMeService;
	}

	/**
	 * @Description:个人资料页
	 * @exception:
	 */
	@RequestMapping("/pricing.do")
	public String login(HttpServletResponse response, HttpServletRequest request) throws Exception {
		Integer userInfoId = (Integer) request.getSession().getAttribute("userInfoId");
		// 用户未登录的话， 直接返回空信息
		if (userInfoId == null)
			return "WEB-INF/jsp/pricing";
		// 用户已经登录， 查找该用户的信息并展示
		UserDetailInfo userDetailInfo = aboutMeService.getUserDetailInfo(userInfoId);
		request.setAttribute("userDetailInfo", userDetailInfo);
		return "WEB-INF/jsp/pricing";
	}
	
	@RequestMapping("/updateUserDetailInfo.do")
	public String updateUserDetailInfo(HttpServletResponse response, HttpServletRequest request, String country, String address, String phone) throws Exception {
		Integer userInfoId = (Integer) request.getSession().getAttribute("userInfoId");
		// 用户未登录的话， 直接返回空信息
		if (userInfoId == null)
			return "WEB-INF/jsp/pricing";
		// 用户已经登录， 查找该用户的信息并展示
		aboutMeService.updateUserDetailInfo(userInfoId, country, address, phone);
		
		return "forward:pricing.do";
	}
	
	
}
