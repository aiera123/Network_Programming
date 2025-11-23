package Lab;
import java.net.*;
public class IPversioncheck_anuradha {
	    public static void main(String[] args) {
	        try {
	            String ip = "255.234.180.23";   // You can change this to test other IPs

	            InetAddress address = InetAddress.getByName(ip);

	            System.out.println("IP Address: " + ip);

	            if (address instanceof Inet4Address) {
	                System.out.println("This is an IPv4 address.");
	            } else if (address instanceof Inet6Address) {
	                System.out.println("This is an IPv6 address.");
	            } else {
	                System.out.println("Unknown IP address type.");
	            }

	        } catch (Exception e) {
	            System.out.println("Invalid IP Address!");
	        }
	    }
	}


