package Lab;
import java.net.*;
public class HostIPMac_anuradha_7 {
	
	
	    public static void main(String[] args) {
	        try {
	            // Enter any host name here
	            String host = "www.google.com";

	            // Get InetAddress of the host
	            InetAddress inet = InetAddress.getByName(host);

	            // Print IP Address
	            System.out.println("Host: " + host);
	            System.out.println("IP Address: " + inet.getHostAddress());

	            // Get Network Interface (may return null for public hosts)
	            NetworkInterface ni = NetworkInterface.getByInetAddress(inet);

	            if (ni != null) {
	                // Get MAC address
	                byte[] mac = ni.getHardwareAddress();

	                if (mac != null) {
	                    System.out.print("MAC Address: ");
	                    for (int i = 0; i < mac.length; i++) {
	                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
	                    }
	                    System.out.println();
	                } else {
	                    System.out.println("MAC Address: Not available");
	                }
	            } else {
	                System.out.println("MAC Address: Network interface not found.");
	            }

	        } catch (Exception e) {
	            System.out.println("Error: " + e);
	        }
	    }
	}
