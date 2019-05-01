package com.bit.am;


class Pan{
	public void draw(){
		System.out.println("¼±À» ±ß´Ù");
	}
}

class Pancil extends Pan{
	final String size;
	
	public Pancil() {
		size="HB";
	}
	
	public Pancil(int size){
		this.size=size+"B";
	}
	
	public void draw(){
		if(size.equals("2B")){
			System.out.print("Á¶±Ý µÎ²¨¿î ");
		}else if(size.equals("4B")){
			System.out.print("¸¹ÀÌ µÎ²¨¿î ");
			
		}
		System.out.println("¼±À» ±ß´Ù");
	}
}

class Ballpan extends Pan{
	private String color;
	
	public Ballpan() {
		color="°ËÁ¤";
	}
	public Ballpan(String color){
		this.color=color;
	}
	
	public void draw(){
		System.out.println(color+"»ö ¼±À» ±ß´Ù ");
	}
}


class Box2<T>{
	private T pan;
	
	public <T>Box2() {
	}
	
	public T get(){
		return pan;
	}
	
	public void set(T pan){
		this.pan=pan;
	}
	
}


public class Ex03 {

	public static void main(String[] args) {
		Box2<Pan> box=new Box2();
		box.set(new Ballpan("»¡°­"));
		box.get().draw();
		box.set(new Ballpan());
		box.get().draw();
		box.set(new Pancil());
		box.get().draw();
		box.set(new Pancil(4));
		box.get().draw();

	}

}


















