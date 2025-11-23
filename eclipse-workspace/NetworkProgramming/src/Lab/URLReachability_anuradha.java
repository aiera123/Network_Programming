package Lab;
import java.net.*;
public class URLReachability_anuradha {
	    public static void main(String[] args) {
	        try {
	            String urlString = "https://www.google.com";

	            // Convert to URL
	            URL url = new URL(urlString);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // Set timeout to 2 seconds (2000 ms)
	            connection.setConnectTimeout(2000);
	            connection.setReadTimeout(2000);

	            // Try connecting
	            connection.connect();

	            // Check response code
	            if (connection.getResponseCode() == 200) {
	                System.out.println(urlString + " is reachable within 2 seconds.");
	            } else {
	                System.out.println(urlString + " is NOT reachable. Response Code: "
	                                   + connection.getResponseCode());
	            }

	        } catch (Exception e) {
	            System.out.println("URL is NOT reachable within 2 seconds.");
	        }
	    }
	}


