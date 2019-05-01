package com.bit.day13;

class Machine{
	
	void on(){
		System.out.println("켜다");
	}
	
	void off(){
		System.out.println("끄다");
	}
	
}

class Tv extends Machine{
	void on(){
		System.out.println("화면을 출력한다");
	}
}

class Radio extends Machine{
	void on(){
		System.out.println("주파수를 맞춰 소리를 출력한다");
	}
}

class Audio extends Machine{
	void on(){
		System.out.println("음악을 틀어준다");
	}
}



public class Ex11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		Machine remote=null;
		System.out.print("1.Tv 2.radio 3.Audio>");
		int input=sc.nextInt();
		if(input==1){
			remote=new Tv();
		}else if(input==2){
			remote = new Radio();
		}else if(input==3){
			remote = new Audio();
		}
		remote.on();
		remote.off();

	}

}
















