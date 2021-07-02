package com.login.oauth2Test;

import com.login.oauth2Test.model.ERole;
import com.login.oauth2Test.model.Role;
import org.hibernate.Session;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Oauth2TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2TestApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {


		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();


		} catch (Exception e) {
			e.printStackTrace();
		}


	}*/

}
