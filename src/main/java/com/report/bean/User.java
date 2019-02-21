package com.report.bean;

/**
 * @Description 用户实体映射类
 * @author 张立增[zhanglizeng] Tel：18860126570
 * @createDate 2018年6月28日 上午11:20:51
 */
public class User implements java.io.Serializable  {

	private static final long serialVersionUID = 1L;
	private Integer id;
    private String username;
    private String password;  
    private String realname;  
    
	public User() {
		super();
	}

	public User(Integer id, String username, String password,String realname) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.realname = realname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

    
}
