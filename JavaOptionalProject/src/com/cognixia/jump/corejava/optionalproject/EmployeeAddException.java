package com.cognixia.jump.corejava.optionalproject;

/**
 * This an exception for when an employee can not added to the department.
 * @author Lori White
 * @version v1 (06/04/2020)
 */
public class EmployeeAddException extends Exception{

	private static final long serialVersionUID = 1L;
	/**
	 * The overloaded constructor.
	 * @param message the error message
	 */
	public EmployeeAddException(String message) {
		super(message);
	}
}
