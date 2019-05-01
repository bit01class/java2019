package com.bit.day11;

public class Ex15 {

	public static void main(String[] args) {
		// 문자열 추가, 수정, 삭제
		String target="abcdefg";
		//target=target.concat("추가");
		System.out.println(target);
		String result=target.substring(1);
		System.out.println(result);
		int idx = target.indexOf("cd");
		int idx2 = target.lastIndexOf("cd");
		System.out.println(idx2);
		boolean result2=target.startsWith("abd");
		System.out.println(result2);
		result2=target.endsWith("fg");
		System.out.println(result2);
		result2=target.contains("bcd");
		System.out.println(result2);
		int su=target.compareTo("abcdefg");
		System.out.println(su);
		String result3=target.replace('b', 'B');
		result3=target.replace("def", "deeeeef");
		result3=target.replace("def", "DEF");
		result3=target.replace("def", "");
		System.out.println(result3);
		String target2="      Abc     DeFg      ";
		result3=target2.trim();
		System.out.println(result3);//"abc     defg"
		result3=target2.toUpperCase();
		System.out.println(result3);
		result3=target2.toLowerCase();
		System.out.println(result3);
	}

}
















