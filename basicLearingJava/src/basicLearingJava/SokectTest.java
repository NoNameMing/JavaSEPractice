package basicLearingJava;

import java.io.*;
import java.net.*;
import java.util.*;

public class SokectTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try (Socket s = new Socket("time-a.nist.gov", 13); // 打开套接字
			Scanner in = new Scanner(s.getInputStream(), "UTF-8")) 
		{
			while (in.hasNextLine())
			{
				String line = in.nextLine();
				System.out.println(line);
			}
		}
	
	}

}
