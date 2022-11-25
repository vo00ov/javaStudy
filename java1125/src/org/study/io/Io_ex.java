package org.study.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io_ex {

	public static void main(String[] args) {
		InputStreamReader input = null;

		System.out.println("학생 이름 : ");
		input = new InputStreamReader(System.in); // 콘솔에 입력 설정

		BufferedReader in = new BufferedReader(input); // input 입력값 대기

		try {
			String name = in.readLine(); // input 입력값 in으로 출력하여 name 에 담는다
			System.out.println("기말고사 성적표" + "[" + name + "]" + "점수를 입력하세요.");

			String[] subject = { "국어", "영어", "수학" }; // 과목 배열 선언
			int[] score = new int[3]; // 점수 배열 선언

			double sum = 0.0; // 과목별 총점 임시값

			for (int i = 0; i < subject.length; i++) {

				System.out.print(subject[i] + ":"); // 과목배열 :
				String scoreIn = in.readLine(); // 점수값 입력하여 scorein 에 담는다
				score[i] = Integer.parseInt(scoreIn); // 문자형을 인트형으로 변환
				sum += score[i];

			}

			System.out.println("평균 : " + sum / subject.length);

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
