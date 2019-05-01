package com.bit.day10;

public class Ex06{

  public static void main(String[] args){

	char ch1=' ';
	Character ch2=new Character('B');
	Character ch3='C';

	System.out.println((int)Character.MIN_VALUE);
	System.out.println((int)Character.MAX_VALUE);
	System.out.println(Character.SIZE);
	// 유니코드인지 
	System.out.println(Character.isDefined('@'));
	// 문자인지 아닌지
	System.out.println("문자인지 아닌지");
	System.out.println(Character.isLetter(ch1));
	System.out.println(Character.isAlphabetic(ch1));
	// 숫자인지 아닌지
	System.out.println("숫자인지 아닌지");
	System.out.println(Character.isDigit(ch1));
	// 대문자인지 소문자인지
	System.out.println("대문자:"+Character.isUpperCase(ch1));
	System.out.println("소문자:"+Character.isLowerCase(ch1));
	// 띄어쓰기
	System.out.println(Character.isSpace(ch1));
	System.out.println(Character.isWhitespace(ch1));
  }

}




















