package com.bit.day10;
/*
 * 
 * 주민번호 입력>123456-3456789
 * 당신은 8세 남자입니다
 * 
 * 주민번호 입력>993456-2456789
 * 당신은 21세 여자입니다
 * 
 * 주민번호 입력>9934562456789
 * 입력양식을 확인해주세요(ex. 000000-0000000
 * 
 * 주민번호 입력>999999-123456
 * 입력양식을 확인해주세요(ex. 000000-0000000
 * 
 * 주민번호 입력>99999-22123456
 * 입력양식을 확인해주세요(ex. 000000-0000000
 * 
 * 주민번호 입력>abcdfg-abcdfeg
 * 입력이 잘못되었습니다.
 * 
 * 인공지능(한글인식)
 * 주민번호 입력>일이삼사오육-일이삼사오육칠
 * 당신은 00세 0자입니다.
 * 
 * 
 */

public class Ex11 {

	public static void main(String[] args) {
		String msg="1234";
		char[] chs=msg.toCharArray();
		char[] ch2={chs[0],chs[1]};
		
		System.out.println(
				Integer.parseInt(new String(ch2)));
		
	}

}
















