package sports;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TENNISCoach implements Coach {

	@Override
	public void getPractise() {
		// TODO Auto-generated method stub
		System.out.println("inside tennis");
	}

}
