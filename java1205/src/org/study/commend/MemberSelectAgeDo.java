package org.study.commend;

import java.util.List;
import java.util.Scanner;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectAgeDo implements ExcuteQueryCommend {

	@Override
	public void excuteCommned() {
		System.out.println("30대 회원 출력");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 나이 : ");
		int ageStart = sc.nextInt();
		System.out.print("끝 나이 : ");
		int ageEnd = sc.nextInt();
		
		MemberDao dao = new MemberDao();
		List<MemberDto> members = dao.selectAge(ageStart, ageEnd);
		
		if(members.size()==0) {
			System.out.println("조건에 맞는 회원이 없습니다");
		}else {
			for(MemberDto member : members) {
				System.out.print("ID:" + member.getUserId() + " ");
				System.out.print("PW:" + member.getUserPw() + " ");
				System.out.print("AGE:" + member.getAge() + " ");
				System.out.print("EMAIL:" + member.getEmail() + "\n");
			}
		}
		
	}

}
