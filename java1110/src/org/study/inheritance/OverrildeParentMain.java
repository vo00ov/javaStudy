package org.study.inheritance;

public class OverrildeParentMain {

	public static void main(String[] args) {
		
		OverrideSub1 ov1 = new OverrideSub1();
		OverrideSub2 ov2 = new OverrideSub2();
		OverrideSub3 ov3 = new OverrideSub3();
		
		ov1.excuteQuery(100);
		ov2.excuteQuery(200);
		ov3.excuteQuery(300);
	}
}
