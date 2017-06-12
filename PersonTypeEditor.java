/**
 * 
 */
package com.spring.session3;

import java.beans.PropertyEditorSupport;

/**
 * @author arya_girijakumari
 *
 */
//custompropertyeditor method which extends PropertyEditorSupport
public class PersonTypeEditor extends PropertyEditorSupport {
	
	public void setAsText(String text)
	{
		setValue(new PersonType(text.toUpperCase()));
	}
	

}
