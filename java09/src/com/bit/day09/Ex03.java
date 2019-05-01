/*
	String msg="Java Web Spring";
Q1. 띄어쓰기는 몇개인가?
	char	charAt(int index)

Q2. 몇개의 대문자를 사용했는지 구하시오

Q3. 모두 대문자로 바꾸시오

04. 띄어쓰기로 잘라 String 배열에 담으시오

*/
package com.bit.day09;

public class Ex03{

  public static void main(String[] args){
	String msg="Java Web Spring";
	int cnt=0;
	for(int i=0; i<msg.length(); i++){
		char ch=msg.charAt(i);
		if(ch==' '){cnt++;}
	}
	System.out.println("msg의 띄어쓰기는 "+cnt+"개");
	System.out.println("---------------------------");
	cnt=0;
	char[] chs1=msg.toCharArray();
	for(int i=0; i<chs1.length; i++){
		if(chs1[i]==' '){cnt++;}
	}
	System.out.println("msg의 띄어쓰기는 "+cnt+"개");
	System.out.println("---------------------------");
	cnt=0;
	byte[] by1=msg.getBytes();
	byte space=(byte)' ';
	
	for(int i=0; i<by1.length; i++){
		if(by1[i]==space){cnt++;}
	}
	System.out.println("msg의 띄어쓰기는 "+cnt+"개");
	System.out.println("------------------------------------");
	cnt=0;
	for(int i=0; i<msg.length(); i++){
		char ch=msg.charAt(i);
		if((int)'A'<=(int)ch && (int)ch<=(int)'Z'){cnt++;}
	}
	System.out.println("msg의 대문자는 "+cnt+"개");
	System.out.println("------------------------------------");
	cnt=0;
	char[] ch2=msg.toCharArray();
	for(int i=0; i<ch2.length; i++){
		if(ch2[i]>='A' && ch2[i]<='Z'){cnt++;}
	}
	System.out.println("msg의 대문자는 "+cnt+"개");
	System.out.println("------------------------------------");
	int gap='a'-'A';
	//	97-65=32;
	//	98-32=66;
	char[] ch3=msg.toCharArray();
	for(int i=0; i<ch3.length; i++){
		if(ch3[i]>='a' && ch3[i]<='z'){
			ch3[i]-=gap;
		}
	}
	String msg2=new String(ch3);
	System.out.println(msg2);
	System.out.println("------------------------------------");
	String msg3="";
	for(int i=0; i<msg.length(); i++){
		char ch4=msg.charAt(i);
		if(ch4>='a' && ch4<='z'){
			msg3+=(char)(ch4-gap);
		}else{
			msg3+=ch4;
		}
		
	}	
	System.out.println(msg3);
	
	System.out.println("------------------------------------");
	String[] msgs=new String[1];
	int cnt2=1;
	for(int i=0; i<msg.length(); i++){
		char ch4=msg.charAt(i);
		if(ch4==' '){cnt2++;msgs=new String[cnt2];}
	}
	for(int i=0; i<msgs.length; i++){// msgs 갯수확정
		msgs[i]="";
	}// {"","",""}
	int cnt3=0;
	for(int i=0; i<msg.length(); i++){
		char ch4=msg.charAt(i);
		if(ch4==' '){cnt3++;}
		else{msgs[cnt3]+=msg.charAt(i);}
	}
	for(int i=0; i<msgs.length; i++){
		System.out.println(msgs[i]);
	}
	
  }

}


















