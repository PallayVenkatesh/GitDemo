package sports;

import org.springframework.stereotype.Component;

@Component
public class candyFortue implements FortuneService {

	@Override
	public String getFortune() {

		return " Hersheys ";
	}

}
