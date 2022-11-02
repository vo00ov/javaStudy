package org.study.loopEx;

public class ForEx04 {

	public static void main(String[] args) {

		System.out.println("===for문===");
		
		String div = "<div>\n <ul>\n";
		
		for(int i = 0; i < 10; i++) {
			div+="	<li><img src='img/bg_"+i+".jpg'></li>\n";
		}
				
		div+=" </ul>\n</div>";
		
		System.out.println(div);

	}
}
