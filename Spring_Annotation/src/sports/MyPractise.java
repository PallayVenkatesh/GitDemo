package sports;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPractise {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cpath = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*
		 * Coach c = cpath.getBean("TENNISCoach", Coach.class); c.getPractise();
		 * 
		 * Coach c1 = cpath.getBean("TENNISCoach", Coach.class); c1.getPractise();
		 * 
		 * System.out.println(c + "***********" + c1);
		 */

		Cricket c = cpath.getBean("crik", Cricket.class);

		c.getPractise();
		
		System.out.println(c.candy());

		
		System.out.println(c.getEmail());
		System.out.println(c.getTeam());
		cpath.close();
		
		

	}

}
