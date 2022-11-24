package org.study.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberDto2Controller {

	public static void main(String[] args) {
		System.out.println("=======Quiz========");
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberDto2> mDto = new ArrayList<MemberDto2>();

		boolean bool1 = false;
		int idx = 0;

		while (!bool1) {
			while (true) {
				if (idx >= 5) {
					System.out.println(idx);
					System.out.println("종료");
					bool1 = true;
					break;

				} else {
					System.out.println("회원가입 실행");

					System.out.print("ID : ");
					String userId = sc.next();

					System.out.print("EMAIL : ");
					String email = sc.next();

					System.out.print("PHONE : ");
					String phone = sc.next();

					System.out.print("AGE : ");
					int age = sc.nextInt();

					mDto.add(new MemberDto2(userId, email, phone, age));

				}
				idx++;
			}

			System.out.println("=====================");

			System.out.println("명단");

			int no = 1;

			for (MemberDto2 i : mDto) {
				System.out.print(no + ".");
				System.out.print("아이디:" + i.getUserId() + " ");
				System.out.print("이메일:" + i.getEmail() + " ");
				System.out.print("전화번호:" + i.getPhone() + " ");
				System.out.print("나이:" + i.getAge() + "\n");

				no++;
			}
			
			
			boolean bool2 = false;
			while(!bool2) {
				System.out.println("LogIn");

				System.out.print("id:");
				String logId = sc.next();
				
				System.out.print("email:");
				String logEmail = sc.next();
				
				for(MemberDto2 user : mDto) {
					String id = user.getUserId();
					String email = user.getEmail();
					
					if(logId.equals(id) && logEmail.equals(email)) {
						System.out.println("성공");
						bool2 =true;
						break;
					}else {
						System.out.println("실패");
					}
				}
			}
		}

	}
}
