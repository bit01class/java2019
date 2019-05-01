package com.bit.am;

class Ball{
	
	public void play(){
		System.out.println("±¼·¯°£´Ù");
	}
}

class Baseball extends Ball{
	
	public void work(){
		System.out.println("µ·À» ¹ú¾îÁØ´Ù");
	}
}


class Box<T>{
	private T ball;
	
	public void set(T ball){
		this.ball=ball;
	}
	
	public T get(){
		return ball;
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		Box box=new Box();
		box.set(new Baseball());
		
//		box.get().play();
//		box.get().work();
	}

}













