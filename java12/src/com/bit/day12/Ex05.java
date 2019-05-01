package com.bit.day12;

public class Ex05 {

	public static void main(String[] args) {
		int[][] data=new int[5][3];
		// 
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String title="---------------------------------------";
		title += "\n학생성적관리프로그램(ver 0.1.0)";
		title += "\n---------------------------------------";
		String tableHeader="------------------------------------------";
		tableHeader+="\n학번|국어|영어|수학|합계|평균";
		tableHeader+="\n------------------------------------------";		
		
		System.out.println(title);
		int input=0;
		int cnt=0;
		
		while(true){
			System.out.print("1.전체보기 2.입력 (3.수정 4.삭제) 0.종료> ");
			input = sc.nextInt();
			if(input==0){
				break;
			}else if(input==1){
				System.out.println(tableHeader);
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
				System.out.println(i+1+" "+stu[0]+" "+stu[1]+" "+stu[2]
						+" "+(stu[0]+stu[1]+stu[2])
						+" "+((stu[0]+stu[1]+stu[2])*100/3/100.0));
				}
			}else if(input==2){
				if(cnt==5){continue;}
				int[] stu=new int[3];
				System.out.print(cnt+1+"번 국어>");
				stu[0]=sc.nextInt();
				System.out.print(cnt+1+"번 영어>");
				stu[1]=sc.nextInt();
				System.out.print(cnt+1+"번 수학>");
				stu[2]=sc.nextInt();
				data[cnt++]=stu;
			}
		}
		System.out.println("이용해주셔서 감사합니다");
		
	}

}












