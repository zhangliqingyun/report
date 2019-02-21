package com.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 处理错误异常跳转页面的方法
 * @author 张立增[zhanglizeng] Tel：18860126570
 * @createDate 2018年6月28日 下午4:11:27
 */
@Controller
public class ErrorController {

	/**
	 * @Description 服务器出错的跳转页面
	 * @author 张立增[zhanglizeng] Tel：18860126570
	 * @createDate 2018年6月28日 下午4:12:34
	 */
	@RequestMapping("/serverError")
	public String serverError() {
		return "500";
	}
	
	/**
	 * @Description 找不到页面出错的跳转页面
	 * @author 张立增[zhanglizeng] Tel：18860126570
	 * @createDate 2018年6月28日 下午4:12:34
	 */
	@RequestMapping("/notFind")
	public String notFind() {
		return "404";
	}
	
}
