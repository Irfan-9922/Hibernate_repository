package org.hibernate.practice.SampleHibernateProgram;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * @author Irfan
 *
 */
public class App {
	public static void main(String[] args) {
		// Transient Object.
		Employee employee = new Employee();
		employee.setEmployeeSalery(12039L);
		employee.setEmpolyeeName("Irfan");
		// Session
		Session session = null;
		try {
			session = new Configuration().configure().buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(employee);
			System.out.println("data saved \t" + employee.getEmployeeId());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			session.close();
		}

	}
}
