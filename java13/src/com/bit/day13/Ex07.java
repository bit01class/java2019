package com.bit.day13;

/*
 * -----------------------------------
 * 학생성적관리 프로그램(ver 0.1.1)
 * -----------------------------------
 * 
*/

public class Ex07 {
	static String data="1901|80|77|69"
						+"\n1902|88|97|69"
						+"\n1903|90|93|89"
						+"\n1904|71|77|69";
//						+"\n1905|71|77|69";
	
	
	
	public static void main(String[] args) {
		int num=4;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String title="---------------------------------------";
		title+="\n학생성적관리 프로그램(ver 0.1.1)\n";
		title+="---------------------------------------";
		System.out.println(title);
		String input=null;
		while(true){
			System.out.print("1.보기 2.등록 3.수정 4.삭제 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println(data);
			}else if(input.equals("2")){
				num++;
				input=1900+num+"";
				System.out.print(1900+num+"번 국어>");
				input+="|"+sc.nextLine();
				System.out.print(1900+num+"번 영어>");
				input+="|"+sc.nextLine();
				System.out.print(1900+num+"번 수학>");
				input+="|"+sc.nextLine();
				data+="\n"+input;
			}else if(input.equals("3")){
				System.out.print("수정할 학번>");
				input=sc.nextLine();
				
				String[] stu=data.split("\n");
				
				int i=0;
				for(i=0; i<stu.length; i++){
					if(stu[i].startsWith(input)){break;}
					
				}
				stu[i]=input;
				System.out.print(input+"번 국어>");
				stu[i]+="|"+sc.nextLine();
				System.out.print(input+"번 영어>");
				stu[i]+="|"+sc.nextLine();
				System.out.print(input+"번 수학>");
				stu[i]+="|"+sc.nextLine();
				data="";
				for(int j=0; j<stu.length; j++){
					if(j!=0){data+="\n";}
					data+=stu[j];
				}
			}
		}
	}

}























