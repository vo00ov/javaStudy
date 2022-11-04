package org.study.arrayEx;

public class ArrayEx07 {

	public static void main(String[] args) {
		System.out.println("char형 배열 >> String");

		int i;
		
		char [] ch = {'C','A','F','E'};
		String binnery[] = {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"
				};
			
		String result = "";
		
		for( i = 0; i<ch.length; i++) {
			if(ch[i] >= '0' && ch[i]<= '9') {
				result = result + binnery[ch[i] - '0'];
			}else {
				result = result + binnery[ch[i] - 'A' + 10];
			}
		}
		
		System.out.println("ch=" + new String(ch));
		System.out.println("ch=" + String.copyValueOf(ch));
		System.out.println(result);
		
	}

}
