/**
 * 
 */
package com.fanjavaid.model;

/**
 * @author fanjavaid
 *
 */
public class Type {
	private String name;
	private String extention;
	
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Type(String name, String extention) {
		super();
		this.name = name;
		this.extention = extention;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtention() {
		return extention;
	}

	public void setExtention(String extention) {
		this.extention = extention;
	}

	@Override
	public String toString() {
		return "Type [name=" + name + ", extention=" + extention + "]";
	}
	
}
