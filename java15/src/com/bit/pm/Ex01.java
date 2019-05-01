package com.bit.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 주민번호 확인
		// 123456-1234567
		Scanner sc = new Scanner(System.in);
		String msg=null;
		int su1=0,su2=0;
		int cnt=0;
		while(true){
			System.out.print("주민번호를 입력>");
			msg=sc.nextLine();
			
			if(msg.length()!=14){if(++cnt==3){break;}else{continue;}}
			if(msg.charAt(6)!='-'){if(++cnt==3){break;}else{continue;}}
			String[] su=msg.split("-");
			if(su.length!=2){if(++cnt==3){break;}else{continue;}}
			try{
				su2=Integer.parseInt(su[1]);
				su1=19000000+Integer.parseInt(su[0]);
			}catch(Exception e){
				if(++cnt==3){break;}else{continue;}
			}
			System.out.println(msg);
			if(su2>2999999){su1+=1000000;}
			System.out.println(su1/10000);
			break;
		}
		
		//System.out.println(su2);
	}

}


















