package com.hb.domain;

public class Employee implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private String hiredate;
	public Integer getId()
	{
		System.out.println("domain");
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getHiredate()
	{
		return hiredate;
	}
	public void setHiredate(String hiredate)
	{
		this.hiredate = hiredate;
	}
	
	

}
