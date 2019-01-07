package org.hibernate.practice.SampleHibernateProgram;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empolyeeName=" + empolyeeName + ", employeeSalery="
				+ employeeSalery + "]";
	}
	private String empolyeeName;
	private Long employeeSalery;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpolyeeName() {
		return empolyeeName;
	}
	public void setEmpolyeeName(String empolyeeName) {
		this.empolyeeName = empolyeeName;
	}
	public Long getEmployeeSalery() {
		return employeeSalery;
	}
	public void setEmployeeSalery(Long employeeSalery) {
		this.employeeSalery = employeeSalery;
	}

}
