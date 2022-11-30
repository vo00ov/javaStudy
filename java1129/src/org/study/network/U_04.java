package org.study.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class U_04 {

	public static void main(String[] args) {
		
		try {
			URL aurl = new URL("http://192.168.23.211:8092/springMVC1206/joinOk");
			
			URLConnection uc = aurl.openConnection();
			uc.setDoOutput(true);
			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());
			
			out.write("userId=m1111&userPw=1111&userName=s1");
			out.close();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			
			String inputLine;
			while((inputLine=in.readLine()) != null) {
				System.out.println(inputLine);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("오류");
		}
	}
}
