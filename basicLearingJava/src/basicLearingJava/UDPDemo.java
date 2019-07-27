package basicLearingJava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 需求：建立UDP发送端
		 * 思路：
		 * 1.建立可发送UDP的SOCKET的服务
		 * 2.明确具体发送的数据
		 * 3.通过SOCKET服务将具体的数据发送出去
		 * 4.关闭服务
		 */
		
		System.out.println("UDP发送启动");
		
		// 1.创建UDP服务
		DatagramSocket dSocket = new DatagramSocket();
		
		// 2.明确数据
		String string = "Class UDPDemo Is Sending Out Data";
		
		// 3.发送数据 数据发送到数据包中
		   // 3.1 将数据封装到数据包对象中，数据包会明确目的地址和端口
		byte[] buf = string.getBytes();
		DatagramPacket dPacket = new DatagramPacket(buf, buf.length,
				InetAddress.getByName("172.20.10.5"), 3000);
		   // 3.2 发送
		dSocket.send(dPacket);
		
		// 4.关闭
		dSocket.close();
		
		// to sum: 发了 但 UDP 面向无连接 收没收我也不知道haha
	}

}
