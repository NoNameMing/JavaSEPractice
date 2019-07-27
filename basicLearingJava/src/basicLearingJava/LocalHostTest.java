package basicLearingJava;

import java.net.*;

public class LocalHostTest {

	public static void main(String[] args) throws java.net.UnknownHostException {
		// TODO Auto-generated method stub
		
		InetAddress ip = InetAddress.getLocalHost();
		
		ip = InetAddress.getByName("www.google.hk");
		
		String str_ip = ip.getHostAddress();
		String name = ip.getHostName();
		
		System.out.println(str_ip + ":" + name);
	}

}
