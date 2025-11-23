package Lab;
import java.net.*;

public class resolveuri_anuradha_9 {
	

	    public static void main(String[] args) {
	        try {
	            // Base URI
	            URI baseURI = new URI("http://example.com");

	            // Relative path
	            URI relativePath = new URI("colleges/SWASTIK#admission");

	            // Resolve relative path against base URI
	            URI completeURI = baseURI.resolve(relativePath);

	            System.out.println("Base URI       : " + baseURI);
	            System.out.println("Relative Path  : " + relativePath);
	            System.out.println("Complete URI   : " + completeURI);

	        } catch (Exception e) {
	            System.out.println("Error: " + e);
	        }
	    }
	}


