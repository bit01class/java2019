package com.bit.pm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 성적관리프로그램 (ver 1.2.1)
		// 1.보기 2.입력 3.수정 4.삭제 0.종료>
		List<String> data=new ArrayList<String>();
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
					String show=data.get(i).replace(",", "\t");
					System.out.println(show);
				}
			}else if(input.equals("2")){
				num++;
				String msg=num+"";
				System.out.print("국어>");
				msg+=",";
				msg+=sc.nextLine();
				System.out.print("영어>");
				msg+=",";
				msg+=sc.nextLine();
				System.out.print("수학>");
				msg+=",";
				msg+=sc.nextLine();
				data.add(msg);
			}else if(input.equals("3")){
				System.out.print("학번>");
				String msg=sc.nextLine();
				int i=0;
				for(i=0; i<data.size(); i++){
					if(data.get(i).startsWith(msg)){break;}
				}
				if(i==data.size()){continue;}
				System.out.print("국어>");
				msg+=",";
				msg+=sc.nextLine();
				System.out.print("영어>");
				msg+=",";
				msg+=sc.nextLine();
				System.out.print("수학>");
				msg+=",";
				msg+=sc.nextLine();
				data.set(i, msg);
			}else if(input.equals("4")){
				System.out.print("학번>");
				String msg=sc.nextLine();
				int i=0;
				for(i=0; i<data.size(); i++){
					if(data.get(i).startsWith(msg)){break;}
				}
				if(i==data.size()){continue;}
				data.remove(i);
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}














