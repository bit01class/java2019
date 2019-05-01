package com.bit.pm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex01 {

	public static void main(String[] args) {
		// 성적관리프로그램 (ver 1.2.0)
		// 1.보기 2.입력 3.수정 4.삭제 0.종료>
		
		List<Integer> data=new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("성적관리프로그램 (ver 1.2.0)");
		System.out.println("---------------------------------");
		String tmpInput=null;
		int num=201900;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			tmpInput=sc.nextLine();
			if(tmpInput.equals("0")){break;}
			if(tmpInput.equals("1")){
				System.out.println("---------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("---------------------------------");
				//~~~~
				for(int i=0; i<data.size(); i+=4){
					
					for(int j=i; j<i+4; j++){
						if(j!=i){System.out.print("\t");}
						System.out.print(data.get(j));
						
					}
					System.out.print("\n");
				}
				
			}else if(tmpInput.equals("2")){
				num++;
				data.add(num);
				System.out.print("국어>");
				tmpInput=sc.nextLine();
				int kor=Integer.parseInt(tmpInput);
				data.add(kor);
				System.out.print("영어>");
				tmpInput=sc.nextLine();
				int eng=Integer.parseInt(tmpInput);
				data.add(eng);
				System.out.print("수학>");
				tmpInput=sc.nextLine();
				int math=Integer.parseInt(tmpInput);
				data.add(math);
				
			}else if(tmpInput.equals("3")){
				System.out.print("학번>");
				tmpInput=sc.nextLine();
				int target=Integer.parseInt(tmpInput);
				int i=0;
				for(i=0; i<data.size(); i+=4){
					int num2=data.get(i);
					if(target==num2){break;}
				}
				if(i==data.size()){continue;}
					System.out.print("국어>");
					tmpInput=sc.nextLine();
					data.set(i+1, new Integer(tmpInput));
					System.out.print("영어>");
					tmpInput=sc.nextLine();
					data.set(i+2, new Integer(tmpInput));
					System.out.print("수학>");
					tmpInput=sc.nextLine();
					data.set(i+3, new Integer(tmpInput));
			}else if(tmpInput.equals("4")){
				System.out.print("학번>");
				tmpInput=sc.nextLine();
				int target=Integer.parseInt(tmpInput);
				int i=0;
				for(i=0; i<data.size(); i+=4){
					int num2=data.get(i);
					if(target==num2){break;}
				}
				if(i==data.size()){continue;}
				data.remove(i);
				data.remove(i);
				data.remove(i);
				data.remove(i);
			}
		}
		System.out.println("이용해주셔서 감사합니다");

	}

}




















