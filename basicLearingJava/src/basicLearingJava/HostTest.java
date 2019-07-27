import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
 		InetAddress ip = InetAddress.getLocalHost();
 		System.out.println(ip);
 	 }
}
