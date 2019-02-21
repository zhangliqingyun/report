package com.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description ��������쳣��תҳ��ķ���
 * @author ������[zhanglizeng] Tel��18860126570
 * @createDate 2018��6��28�� ����4:11:27
 */
@Controller
public class ErrorController {

	/**
	 * @Description �������������תҳ��
	 * @author ������[zhanglizeng] Tel��18860126570
	 * @createDate 2018��6��28�� ����4:12:34
	 */
	@RequestMapping("/serverError")
	public String serverError() {
		return "500";
	}
	
	/**
	 * @Description �Ҳ���ҳ��������תҳ��
	 * @author ������[zhanglizeng] Tel��18860126570
	 * @createDate 2018��6��28�� ����4:12:34
	 */
	@RequestMapping("/notFind")
	public String notFind() {
		return "404";
	}
	
}
