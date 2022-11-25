package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoEx1 {

	public static void main(String[] args) {

		String fileUrl = "C:\\Users\\Administrator\\Desktop\\ioex2\\text3.txt";
		// 1. file객체생성 -> 2.파일경로 추가
		File file = new File(fileUrl);

		FileReader fReader = null;
		// 3. 파일 가져오기(Reader->텍스트)
		try {
			fReader = new FileReader(file);
			// 4. 파일 가져오기(Reader -> 텍스트)
			int inData = 0;
			while((inData=fReader.read()) != -1) {
				// 5. 콘솔 출력
				System.out.print((char)inData);
			}
		} catch (FileNotFoundException e) {
			// 파일 유무
			e.printStackTrace();
		} catch (IOException e) {
			// 입출력
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
