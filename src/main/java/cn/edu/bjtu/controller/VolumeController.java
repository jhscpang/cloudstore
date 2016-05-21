package cn.edu.bjtu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.bjtu.service.IVolumeService;

/**
 * springmvc的控制类,处理所有默认情况下的跳转
 * 
 * @author 庞超
 *
 */
@Controller
public class VolumeController {

	private IVolumeService volumeService;

	public IVolumeService getVolumeService() {
		return volumeService;
	}

	@Resource
	public void setVolumeService(IVolumeService volumeService) {
		this.volumeService = volumeService;
	}

	/**
	 * @Description:充值
	 * @exception:
	 */
	@RequestMapping("/buy.do")
	public String buy(HttpServletResponse response, HttpServletRequest request, String type) throws Exception {
		
		if(type == null || "".equals(type) || !type.equals("5") || !type.equals("10") || !type.equals("15")) {
			return "false";
		}
		Integer userInfoId = (Integer) request.getSession().getAttribute("userInfoId");
		if (userInfoId == null || userInfoId <= 0) {
			return "false";
		}
		//更新套餐
		volumeService.buyVolume(userInfoId, type);
		return "true";
	}
	
	
	
}
