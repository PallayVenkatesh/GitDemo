package sports;

import org.springframework.stereotype.Component;

@Component("random")
public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Random fortune";
	}

}
