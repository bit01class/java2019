package com.bit.am;

public class Ex02 {

	public static void main(String[] args) {
		char[] su1={'0','1','2','3','4','5','6','7','8','9'};
		char[] su2={'��','��','��','��','��','��','��','ĥ','��','��'};
		
		System.out.println("-------------------------------");
		System.out.println("�ֹι�ȣ üũ");
		System.out.println("-------------------------------");
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		char[] arr=null;
		int age=0;
		while(true){
			System.out.print("�ֹι�ȣ�Է�>");
			input=sc.nextLine();
			arr=input.toCharArray();
			
			// �ѱ�ó�� //////////////////////
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<su2.length; j++){
					if(arr[i]==su2[j]){
						arr[i]=su1[j];
					}
				}
			}
			//////////////////////////////////
			
			if(arr.length==14){
				if(arr[6]=='-'){
					boolean check=true;
					for(int i=0; i<arr.length; i++){
						if(i==6){
							continue;
						}else if(!Character.isDigit(arr[i])){
							check=false;
							break;
						}
					}
					if(check){
						break;
					}
					
				}
			}
			System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ��ѹ�");
		}
		char[] target=new char[2];
		target[0]=arr[0];
		target[1]=arr[1];
		String su=new String(target);
		age=2020;
		char gender='��';
		if(arr[7]=='3'||arr[7]=='4'){
			age-=2000;
		}else if(arr[7]=='1'||arr[7]=='2'){
			age-=1900;
		}
		if(arr[7]=='2'||arr[7]=='4'){
			gender='��';
		}
		age-=Integer.parseInt(su);
		System.out.println(age+"�� "+gender+"�� �Դϴ�");
	}

}























