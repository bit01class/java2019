package com.bit.day10;

public class Ex06{

  public static void main(String[] args){

	char ch1=' ';
	Character ch2=new Character('B');
	Character ch3='C';

	System.out.println((int)Character.MIN_VALUE);
	System.out.println((int)Character.MAX_VALUE);
	System.out.println(Character.SIZE);
	// �����ڵ����� 
	System.out.println(Character.isDefined('@'));
	// �������� �ƴ���
	System.out.println("�������� �ƴ���");
	System.out.println(Character.isLetter(ch1));
	System.out.println(Character.isAlphabetic(ch1));
	// �������� �ƴ���
	System.out.println("�������� �ƴ���");
	System.out.println(Character.isDigit(ch1));
	// �빮������ �ҹ�������
	System.out.println("�빮��:"+Character.isUpperCase(ch1));
	System.out.println("�ҹ���:"+Character.isLowerCase(ch1));
	// ����
	System.out.println(Character.isSpace(ch1));
	System.out.println(Character.isWhitespace(ch1));
  }

}




















