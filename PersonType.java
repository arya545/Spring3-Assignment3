/**
 * 
 */
package com.spring.session3;

/**
 * @author arya_girijakumari
 *
 */
public class PersonType {
	
	private String typeName;
 
	//parameretised constructor
	public PersonType(String typeName) {
		super();
		this.typeName = typeName;
	}

	public PersonType() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getters and setters
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	

}
