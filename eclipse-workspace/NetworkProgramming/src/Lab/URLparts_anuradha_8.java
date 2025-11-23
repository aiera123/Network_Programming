package Lab;
import java.net.*;
public class URLparts_anuradha_8 {
	    public static void main(String[] args) {
	        try {
	            String urlString = "https://example.com/en/4.2/querysets/#queryset-api";
	            URL url = new URL(urlString);

	            System.out.println("URL: " + urlString);
	            System.out.println("Scheme (Protocol)   : " + url.getProtocol());
	            System.out.println("Authority           : " + url.getAuthority());
	            System.out.println("Path                : " + url.getPath());
	            System.out.println("Query String        : " + url.getQuery());
	            System.out.println("Section (Reference) : " + url.getRef());

	        } catch (Exception e) {
	            System.out.println("Invalid URL!");
	        }
	    }
	}


