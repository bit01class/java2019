package com.bit.day12;

public class Ex05 {

	public static void main(String[] args) {
		int[][] data=new int[5][3];
		// 
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String title="---------------------------------------";
		title += "\n�л������������α׷�(ver 0.1.0)";
		title += "\n---------------------------------------";
		String tableHeader="------------------------------------------";
		tableHeader+="\n�й�|����|����|����|�հ�|���";
		tableHeader+="\n------------------------------------------";		
		
		System.out.println(title);
		int input=0;
		int cnt=0;
		
		while(true){
			System.out.print("1.��ü���� 2.�Է� (3.���� 4.����) 0.����> ");
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
				System.out.print(cnt+1+"�� ����>");
				stu[0]=sc.nextInt();
				System.out.print(cnt+1+"�� ����>");
				stu[1]=sc.nextInt();
				System.out.print(cnt+1+"�� ����>");
				stu[2]=sc.nextInt();
				data[cnt++]=stu;
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
		
	}

}












