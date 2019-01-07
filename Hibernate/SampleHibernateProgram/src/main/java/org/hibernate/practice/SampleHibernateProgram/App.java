package org.hibernate.practice.SampleHibernateProgram;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
	//	Session session = null;
		Employee employee = new Employee();
		
		employee.setEmployeeSalery(12039L);
		employee.setEmpolyeeName("Irfan");
		try {
			Session	session = new Configuration().configure().buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(employee);
			System.out.println("data saved \t" + employee.getEmployeeId());
			session.getTransaction().commit();
		} catch (Exception e) {
			//session.close();
		}

	}
}
