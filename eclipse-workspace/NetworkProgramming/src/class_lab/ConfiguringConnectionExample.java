package class_lab;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class ConfiguringConnectionExample {
	public static void main(String[] args) {
		try {
			URL url = new URL ("http://www.example.com");
			URLConnection connection = url.openConnection();
			System.out.println("URL: " + connection.getURL());
			System.out.println("Allow User Interaction: " + connection.getAllowUserInteraction());
			System.out.println("Do Output: " + connection.getDoOutput());
			System.out.println(" Use Cache: " + connection.getUseCaches() +"\n");
			
			connection.setAllowUserInteraction(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			
			System.out.println("URL: " + connection.getURL());
			System.out.println("Allow User Interaction: " + connection.getAllowUserInteraction());
			System.out.println("Do Output: " + connection.getDoOutput());
			System.out.println(" Use Cache: " + connection.getUseCaches() );
			connection.connect();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
//setvsAddrequestProperty
