package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig()  {

		File src = new File("./Configuration/config.properties");

		try {
		FileInputStream fils = new FileInputStream(src);

		pro = new Properties();

		

			// it will load a complete file.
			pro.load(fils);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getApplicationURL() {

		String url = pro.getProperty("baseURL");

		return url;

	}

	public String getUsername() {

		String username = pro.getProperty("username");

		return username;

	}

	public String getPassword() {

		String password = pro.getProperty("password");

		return password;

	}

	public String getChromeDriver() {

		String chromedriver = pro.getProperty("chromepath");

		return chromedriver;

	}

	public String getGeckoDriver() {

		String geckodriver = pro.getProperty("chromepath");

		return geckodriver;

	}

}
