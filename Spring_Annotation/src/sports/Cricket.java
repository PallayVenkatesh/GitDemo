package sports;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("crik")
public class Cricket implements Coach {

	@Value(value = "${team}")
	private String team;

	private String email;

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}

	@Value(value = "${email}")
	public void setEmail(String email) {
		this.email = email;
	}

	private FortuneService fortuneServie;

	/*
	 * public void dummy(FortuneService fortuneServie) {
	 * System.out.println(" Inside my Junk "); this.fortuneServie = fortuneServie; }
	 */

	@PostConstruct
	public String initMethod() {
		System.out.println("inside init");
		return email;
	}

	@PreDestroy
	public String destroyMethod() {
		
		System.out.println("inside destroy");
		return team;
	}

	@Autowired

	public Cricket(@Qualifier("random") FortuneService fortuneServie) {

		this.fortuneServie = fortuneServie;
	}

	public String candy() {
		return fortuneServie.getFortune();
	}

	@Override
	public void getPractise() {
		// TODO Auto-generated method stub
		System.out.println("In Cricket");

	}

}
