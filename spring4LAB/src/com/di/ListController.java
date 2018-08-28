package com.di;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ListController extends AbstractController {
	List<String> insaBean = null;
	public void setInsaBean(List<String> insaBean) {
		this.insaBean = insaBean;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView();//forward√≥∏Æ
		//req.setAttribute("insaBean", insaBean);
		mav.addObject("insaBean", insaBean);
		mav.setViewName("di/insaList");// WEB-INF/view/di/insaList.jsp
		return mav;
	}

}
