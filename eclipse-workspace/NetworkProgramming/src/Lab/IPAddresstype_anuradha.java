package Lab;
import java.net.*;
public class IPAddresstype_anuradha {


	    public static void main(String[] args) {
	        try {
	            String ip = "255.234.180.23";

	            InetAddress address = InetAddress.getByName(ip);

	            System.out.println("IP Address: " + ip);

	            if (address.isAnyLocalAddress()) {
	                System.out.println("Type: Any Local Address");
	            } else if (address.isLoopbackAddress()) {
	                System.out.println("Type: Loopback Address");
	            } else if (address.isLinkLocalAddress()) {
	                System.out.println("Type: Link-Local Address");
	            } else if (address.isSiteLocalAddress()) {
	                System.out.println("Type: Site-Local (Private) Address");
	            } else if (address.isMulticastAddress()) {
	                System.out.println("Type: Multicast Address");
	            } else {
	                System.out.println("Type: Public / Global Address");
	            }

	        } catch (Exception e) {
	            System.out.println("Invalid IP Address!");
	        }
	    }
	}


