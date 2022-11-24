package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {

	public static void main(String[] args) {
		System.out.println("====FileReader====");
		
		FileReader fReader = null;
		
		try {
			fReader = new FileReader("E:\\ioex\\test.txt");
			
			int indData = 0;
			
			while((indData = fReader.read()) != -1) {
				System.out.print((char)indData);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 X");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO X");
			e.printStackTrace();
		} finally {
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
