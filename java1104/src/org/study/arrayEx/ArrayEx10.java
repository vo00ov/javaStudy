package org.study.arrayEx;

public class ArrayEx10 {

	public static void main(String[] args) {
		System.out.println("다차원배열");
		
		//	5행 3열
		int score[][] = {
							{ 100, 66, 77 },
							{ 88,  66, 88 },
							{ 80,  46, 97 },
							{ 70,  88, 80,},
							{ 100, 90, 88 }
						};	// 배열 선언
		
		
		System.out.println("==================중간고사 성적표==================");
		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("==============================================");
		
		for(int i=0; i<score.length; i++) { // 행
			
			int sum = 0;
			double avg = 0.0;

			System.out.print(i + "\t"); // 행 출력
			for(int j=0; j<score[i].length; j++) {
				
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
				
			}
			
				avg = sum/score[i].length;
			
			System.out.println(sum + "\t" + avg);
		}
		System.out.println("==============================================");
		
//		int kor = 0;
//		int math = 0;
//		int eng = 0;
//		int sum = 0;
//		double avg = 0.0; //초기값 설정
//		int scoreLength = score.length;	// 배열의 길이

//		System.out.println("===========중간고사 성적표===========");
//		System.out.println("번호\t 국어\t 영어\t 수학");
//		System.out.println("================================");
		
		
//		for(int i = 0; i < score.length; i++) {
//			System.out.print("  " + (i + 0) + "  ");
//			
//			kor = kor + score[i][0];	// score배열의 0번지 합계 (국어)
//			math = math + score[i][1];	// score배열의 1번지 합계 (영어)
//			eng = eng + score[i][2];	// score배열의 2번지 합계 (수학)
//			
//			for(int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j] + "  ");
//				sum = sum + score[i][j];	//총점
//			}
//			
//			avg = (double) sum / score.length;
//			System.out.println(sum + " " + avg);
//			
//		}
//		
//		System.out.println("=================================");
//		System.out.println("과목별 " + kor + " " + math + " " + eng);
	}

}
