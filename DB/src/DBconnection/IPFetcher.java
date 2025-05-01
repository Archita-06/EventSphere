package DBconnection;

import java.net.InetAddress;

public class IPFetcher {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            System.out.println("My IP address is: " + ipAddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
