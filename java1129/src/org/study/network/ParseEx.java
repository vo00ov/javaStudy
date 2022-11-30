package org.study.network;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseEx {

	public static void main(String[] args) {
		
		URL opinion = null;	// 자원의 경로
		URL join = null;
		
		try {
//			join = new URL("http://localhost:8092/springMVC1206/join");	// 절대 경로로 URL 객체생성
			join = new URL("http://192.168.23.211:8092/springMVC1206/join");	// 절대 경로로 URL 객체생성
			opinion = new URL(join, "join");	// 상대 경로로 URL 객체 생성
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("잘못된 경로");
		}
		System.out.println("protocal = " + opinion.getProtocol());	// 프로토콜 출력
		System.out.println("host = " + opinion.getHost());	// 호스트 이름 출력
		System.out.println("port = " + opinion.getPort());	// 포트 번호 출력
		System.out.println("path = " + opinion.getPath());	// 경로 부분 출력
		System.out.println("filename = " + opinion.getFile());	// 파일 이름 출력
		
	}
}
