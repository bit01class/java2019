package com.bit.day08;

public class Ex09{

  public static void main(String[] args){
	// A~Z까지 출력하시오
	int cnt='Z'-'A'+1;
	char[] chs=new char[cnt];
	for(int i=0; i<cnt; i++){
		chs[i]=(char)('A'+i);
	}
	//~~~~~
	System.out.println("배열의 길이:"+cnt);
	System.out.println("배열의 길이:"+chs.length);
	for(int i=0; i<cnt; i++){
		System.out.println(chs[i]);
	}
	
	
  }

}