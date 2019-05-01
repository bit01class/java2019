package com.bit.am;

public class Ex04 {

	public static void main(String[] args) {
		String data="1901|90|80|70";
		data+="\n1902|91|81|71";
		data+="\n1903|92|82|72";
		data+="\n1904|93|83|73";
		data+="\n1905|94|84|74";
		
		String[] students=data.split("\n");
		int[][] data2=new int[students.length][];
		for(int i=0; i<students.length; i++){
			String[] temp=students[i].split("\\|");
			int[] su=new int[temp.length];
			for(int j=0; j<su.length; j++){
				su[j]=Integer.parseInt(temp[j]);
			}
			data2[i]=su;
		}
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("학생성적관리 프로그램(ver 0.1.2)");
		System.out.println("-----------------------------------");
		int input=0;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println("------------------------------------");
				System.out.println("학번\t|국어\t|영어\t|수학");
				System.out.println("------------------------------------");
				for(int i=0; i<data2.length; i++){
					for(int j=0; j<data2[i].length; j++){
						if(j!=0){
							System.out.print("\t|");
						}
						System.out.print(data2[i][j]);
					}
					System.out.println();
				}
			}else if(input==2){
				int[][] data3=new int[data2.length+1][];
				for(int i=0; i<data2.length; i++){
					data3[i]=data2[i];
				}
				int[] stu=new int[4];
				int num=data2[data2.length-1][0]+1;
				stu[0]=num;
				System.out.print(num+"번 국어>");
				stu[1]=sc.nextInt();
				System.out.print(num+"번 영어>");
				stu[2]=sc.nextInt();
				System.out.print(num+"번 수학>");
				stu[3]=sc.nextInt();
				data3[data3.length-1]=stu;
				data2=data3;
			}else if(input==3){
				System.out.print("학번:");
				input=sc.nextInt();
				int i=0;
				for(i=0; i<data2.length; i++){
					if(data2[i][0]==input){
						break;
					}
				}
				
				if(i==data2.length){
					System.out.println("학번이 존재하지 않습니다");
				}else{
					System.out.print(input+"번 국어>");
					int kor=sc.nextInt();
					System.out.print(input+"번 영어>");
					int eng=sc.nextInt();
					System.out.print(input+"번 수학>");
					int math=sc.nextInt();
					data2[i][1]=kor;
					data2[i][2]=eng;
					data2[i][3]=math;
				}
			}else if(input==4){
				System.out.print("학번:");
				input=sc.nextInt();
				int i=0;
				while(i<data2.length){
					if(input==data2[i][0]){
						break;
					}
					i++;
				}
				if(i==data2.length){
					System.out.println("삭제 실패");
				}else{
					int[][] data4=new int[data2.length-1][];
					for(int j=0; j<i; j++){
						data4[j]=data2[j];
					}
					for(int j=i+1; j<data2.length; j++){
						data4[j-1]=data2[j];
					}
					data2=data4;
				}
			}
		}
		data="";
		for(int i=0; i<data2.length; i++){
			if(i!=0){
				data+="\n";
			}
			for(int j=0; j<data2[i].length; j++){
				if(j!=0){
					data+="|";
				}
				data+=data2[i][j];
			}
		}
		
		System.out.println("이용해주셔서 감사합니다");
		System.out.println(data);
	}

}


























