package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		// 출력
		try {
			FileOutputStream fOut = new FileOutputStream("c:\\noKor.txt");
			FileInputStream fIn = null;

			for (int i = 0; i < 10; i++) {
				int n = 10 - i;
				fOut.write(n);
			}

			if (fOut != null) {
				fOut.close();
			}

//			fIn = new FileInputStream("c:\\test.txt");
			fIn = new FileInputStream("c:\\test.out");

			int inData = 0;
			while ((inData = fIn.read()) != -1) {
				System.out.print((char) inData);
			}

			if (fIn != null) {
				fIn.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
