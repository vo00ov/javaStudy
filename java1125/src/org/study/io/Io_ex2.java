package org.study.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.security.auth.Subject;

public class Io_ex2 {

	public static void main(String[] args) {
		InputStreamReader input = null;

		System.out.println("학생 이름 : ");
		input = new InputStreamReader(System.in); // 콘솔에 입력 설정

		BufferedReader in = new BufferedReader(input); // input 입력값 대기

		try {
			String name = in.readLine(); // input 입력값 in으로 출력하여 name 에 담는다
			System.out.println("기말고사 성적표" + "[" + name + "]" + "점수를 입력하세요.");

			ArrayList<String> subject = new ArrayList<String>();
			ArrayList<String> score = new ArrayList<String>();

			while (true) {
				System.out.print("과목 입력 (종료 : exit)");
				String subjectIn = in.readLine();
				subject.add(subjectIn);

				if (subjectIn.equals("exit")) {
					break;
				}
			}

			double sum = 0.0; // 총점 임시값

			for (int i = 0; i < subject.size() - 1; i++) {
				System.out.print(subject.get(i) + ":");
				String scoreIn = in.readLine();
				score.add(scoreIn);

				sum += (Integer.parseInt(score.get(i)));
			}

			for (int i = 0; i < subject.size() - 1; i++) {
				System.out.print(subject.get(i) + ":" + score.get(i) + " ");
			}

			System.out.println();
			System.out.print("평균 : " + sum / (subject.size() - 1));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
