package com.bit.am;
/*
 * 
 * 주민번호 입력>123456-3456789
 * 당신은 8세 남자입니다
 * 2019-2012+1=8
 * 주민번호 입력>993456-2456789
 * 당신은 21세 여자입니다
 * 당신은 100-79세 여자입니다
 * 0, 1 
 * 1,2 3,4
 * 2019-1999+1=21
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("---------------------------");
		System.out.println("주민번호 체크");
		System.out.println("---------------------------");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input=null;
		int age=2020-2000;
		boolean result=true, check=false;
		do{
			check=false;
			System.out.print("주민번호 입력>");
			input=sc.nextLine();
			if(input.length()!=14){
				System.out.println("1입력양식을 확인해주세요(ex. 000000-0000000");
				continue;
			}else if(input.charAt(6)!='-'){
				System.out.println("2입력양식을 확인해주세요(ex. 000000-0000000");
				continue;
			}
			
			for(int i=0; i<input.length(); i++){
				if(i==6){continue;}
				if(!Character.isDigit(input.charAt(i))){
					check=true;
					break;
				}
				
			}
			if(check){
				System.out.println("3입력양식을 확인해주세요(ex. 000000-0000000");
				continue;
			}
			
			if((input.charAt(0)=='0' || input.charAt(0)=='1')
					&&(input.charAt(7)=='3'||input.charAt(7)=='4')){
				age-=2000;
			}else if((input.charAt(0)>='2')
					&&(input.charAt(7)=='1'||input.charAt(7)=='2')){
				age-=1900;
			}else{
				continue;
			}
			
			result=false;
		}while(result);
		
		age-=(input.charAt(0)-'0')*10+input.charAt(1)-'0';	//'2'-'0'=2
//		if(age<0){
//			age+=100;
//		}
		System.out.print("당신은 "+age);
		char gender=input.charAt(7);
		if(gender=='1' || gender=='3'){
			gender='남';
		}else if(gender=='2' || gender=='4'){
			gender='여';
		}
		System.out.println("세 "+gender+"자입니다");
		
	}

}


















