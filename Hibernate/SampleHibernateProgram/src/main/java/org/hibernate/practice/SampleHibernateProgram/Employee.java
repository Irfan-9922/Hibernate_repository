package org.hibernate.practice.SampleHibernateProgram;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Irfan
 *
 */
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/**
	 The employeeId
	 */
	private Long employeeId;
	
	/**
	 * The empolyeeName
	 */
	private String empolyeeName;
	
	/**
	 * The employeeSalery
	 */
	private Long employeeSalery;

	/**
	 * @return employeeId
	 */
	public Long getEmployeeId() {
		return employeeId;
	}

	/**
	 * To Set EmployeeId
	 * @param employeeId
	 */
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return empolyeeName
	 */
	public String getEmpolyeeName() {
		return empolyeeName;
	}

	/**
	 * To set EmpolyeeName
	 * @param empolyeeName
	 */
	public void setEmpolyeeName(String empolyeeName) {
		this.empolyeeName = empolyeeName;
	}

	/**
	 * @return employeeSalery
	 */
	public Long getEmployeeSalery() {
		return employeeSalery;
	}

	/**
	 * To set EmployeeSalery
	 * @param employeeSalery
	 */
	public void setEmployeeSalery(Long employeeSalery) {
		this.employeeSalery = employeeSalery;
	}

}
