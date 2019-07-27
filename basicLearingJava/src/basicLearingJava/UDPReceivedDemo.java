package basicLearingJava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceivedDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 *  创建 DUP 接收端
		 *  思路：
		 *  1.创建socket服务；明确一个端口。
		 *  2.收数据
		 *  3.将其中所需要的数据取出来 ip data 端口
		 *  4.关闭资源
		 */
		
		System.out.println("UDP Receive Started");
		// 1.创建socket服务
		DatagramSocket ds = new DatagramSocket(10000);
		
		// 2.使用socket的接收方法。接收数据。需要将收到的数据存到数据包中
		// 可以通过数据包对象的方法对收到的数据进行解析
			//2.1 创建一个数据包
			byte[] buf = new byte[1024];
			DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
		ds.receive(dPacket);// 阻塞式方法
		
		// 3.通过数据包对象解析收到的数据 使用数据包的方法
		String ipString = dPacket.getAddress().getHostAddress();
		int port = dPacket.getPort();
		// 获取文字数据
		String str = new String (dPacket.getData(), 0, dPacket.getLength());
		System.out.println(ipString + " : " + port + " ---- " + str);

	}

}
