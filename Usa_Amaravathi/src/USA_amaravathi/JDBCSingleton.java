package USA_amaravathi;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JDBCSingleton {

	static JDBCSingleton xyz = new JDBCSingleton();
	Properties x = new Properties();

	private JDBCSingleton() {
		try {

			FileInputStream f = new FileInputStream(
					"C:\\Users\\ravi_\\eclipse-workspace\\myProject\\connection.properties");
			x.load(f);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static JDBCSingleton getInstance() {
		return xyz;
	}

	public String getProperty(String name) {

		return x.getProperty(name);
	}

}
