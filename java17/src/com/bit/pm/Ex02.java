package com.bit.pm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 성적관리프로그램 (ver 1.2.1)
		// 1.보기 2.입력 3.수정 4.삭제 0.종료>
//		int[] 성적 =new int[3];
		List<int[]> data=new ArrayList<int[]>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("성적관리프로그램 (ver 1.2.0)");
		System.out.println("---------------------------------");
		String input=null;
		int num=201900;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("---------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("---------------------------------");
				for(int i=0; i<data.size(); i++){
					int[] stu=data.get(i);
					for(int j=0; j<stu.length; j++){
						if(j!=0){
							System.out.print("\t");
						}
						System.out.print(stu[j]);
					}
					System.out.println();
				}
			}else if(input.equals("2")){
				int[] stu=new int[4];
				stu[0]=++num;
				String[] title={"국어","영어","수학"};
				for(int i=0; i<3; i++){
					System.out.print(title[i]+">");
					input=sc.nextLine();
					stu[i+1]=Integer.parseInt(input);
				}
				
				
//				System.out.print("국어>");
//				input=sc.nextLine();
//				stu[1]=Integer.parseInt(input);
//				System.out.print("영어>");
//				input=sc.nextLine();
//				stu[2]=Integer.parseInt(input);
//				System.out.print("수학>");
//				input=sc.nextLine();
//				stu[3]=Integer.parseInt(input);
				
				data.add(stu);
			}else if(input.equals("3")){
				System.out.print("학번>");
				input=sc.nextLine();
				int target=Integer.parseInt(input);
				int i=0;
				for(i=0; i<data.size(); i++){
					if(target==data.get(i)[0]){break;}
				}
				if(i==data.size()){continue;}
				int[] stu={target,0,0,0};
				System.out.print("국어>");
				stu[1]=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu[2]=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu[3]=Integer.parseInt(sc.nextLine());
				
				data.set(i, stu);
			}else if(input.equals("4")){
				System.out.print("학번>");
				input=sc.nextLine();
				int target=Integer.parseInt(input);
				int i=0;
				for(i=0; i<data.size(); i++){
					if(target==data.get(i)[0]){break;}
				}
				if(i==data.size()){continue;}
				data.remove(i);
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}



















