package org.study.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferOutputStreamEx {

	public static void main(String[] args) {
		System.out.println("BufferOutputStream");

//		Scanner sc = new Scanner(System.in);
//		
//		String userId = sc.next();
//		System.out.println(userId);

		FileOutputStream inReader = null;
		FileOutputStream fos = null;
		String fileUrl = "C:\\Users\\Administrator\\Desktop\\ioex2\\123.txt";

		FileReader fReader = null;

		// 123.txt -> 읽어서 -> 콘솔에 출력
		try {
			fos = new FileOutputStream(fileUrl);
			// BufferedOutputStream의 버퍼 크기를 5로 한다
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			// 파일 123.txt 에 1부터 9까지 출력한다
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}

			fReader = new FileReader(fileUrl);

			int inData = 0;
			while ((inData = fReader.read()) != -1) {
				System.out.print((char) inData);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
