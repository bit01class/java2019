package com.bit.day11;

public class Ex14 {

	public static void main(String[] args) {
		// String
		String msg1="abc";
		System.out.println(msg1+"1234");
		String msg2=new String();// String msg2="";
		System.out.println(msg2+"1234");
		String msg3=new String("abc");
		System.out.println(msg3);
		char[] ch1=new char[]{'A','B','C'};
		char[] ch2={'A','B','C'};
		String msg4=new String(ch2);
		System.out.println(msg4);
		System.out.println("msg4 length:"+msg4.length());
		String msg5="abcd efg";
		for(int i=0; i<msg5.length(); i++){
			char temp=msg5.charAt(i);
			//System.out.println(temp);
		}
		
		char[] ch4=msg5.toCharArray();
		char[] ch5=myCharArray(msg5);
		String msg6=new String(ch4);
		String msg7=new String(ch5);
		System.out.println(msg6);
		System.out.println(msg7);
		char ch6=msg5.charAt(2);
		System.out.println(ch6);
		char ch7=myAt(msg5,2);
		System.out.println(ch7);
		
	}
	public static char myAt(String msg, int idx){
		char[] ch=msg.toCharArray();
		return ch[idx];
	}
	
	public static char[] myCharArray(String msg){
		char[] ch3=new char[msg.length()];
		for(int i=0; i<ch3.length; i++){
			ch3[i]=msg.charAt(i);
		}
		return ch3;
	}

}












