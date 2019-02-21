package com.report.bean;

import java.util.Date;

/**
 * @Description 版本实体映射类
 * @author 张立增[zhanglizeng] Tel：18860126570
 * @createDate 2018年6月28日 上午11:20:51
 */
public class Version implements java.io.Serializable  {

	private static final long serialVersionUID = 1L;
	private Integer id;
    private String num;
    private String updatedate;  
    
	public Version() {
		super();
	}

	public Version(Integer id, String num, String updatedate) {
		super();
		this.id = id;
		this.num = num;
		this.updatedate = updatedate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	
}
