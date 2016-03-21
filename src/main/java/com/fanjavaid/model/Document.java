/**
 * 
 */
package com.fanjavaid.model;

import java.util.Date;

/**
 * @author fanjavaid
 *
 */
public class Document {
	private String name;
	private Type type;
	private Date createdAt;
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(String name, Type type, Date createdAt) {
		super();
		this.name = name;
		this.type = type;
		this.createdAt = createdAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Document [name=" + name + ", createdAt=" + createdAt + "]";
	}
	
}
