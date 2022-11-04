package org.study.arrayEx;

public class Test01 {

	public static void main(String[] args) {

		int score[][] = { { 100, 66, 77 }, { 88, 66, 88 }, { 80, 46, 97 }, { 70, 88, 80, }, { 100, 90, 88 } }; // 배열 선언

		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("===============================================");
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + "\t");

			int sum = 0;
			double avg = 0.0;

			korSum += score[i][0];
			engSum += score[i][1];
			mathSum += score[i][2];

			for (int j = 0; j < score[i].length; j++) {

				sum += score[i][j];

				System.out.print(score[i][j] + "\t");

				avg = sum / score[0].length;
			}
			System.out.println(sum + "\t" + avg);
		}
		System.out.println("===============================================");
		System.out.println("과목별총첨:" + "\t" + korSum + "\t" + engSum + "\t" + mathSum);
		System.out.println("과목별평균:" + "\t" + (double) korSum / score.length + "\t" + (double) engSum / score.length
				+ "\t" + (double) mathSum / score.length);
	}
}
