package com.bit.am;

public class Ex03 extends Object {

	public static void main(String[] args) {
		Object obj=new Object();
		Object obj2=new Object();
		Object obj3=obj;
//		Object obj4=obj.clone();
		
		System.out.println(obj.equals(obj3));
		
//		System.out.println(obj.toString());
//		System.out.println(obj.getClass());
//		int su=obj.hashCode();
//		String code=Integer.toHexString(su);
//		System.out.println(code);
		Ex03 me =new Ex03();
		Ex03 you =new Ex03();
		Ex03 me2=null;
		me2 = (Ex03) me.clone();
		System.out.println(me.equals(me2));
		System.out.println(me.equals(you));
		System.out.println(me);
		System.out.println(you);
	}
	
	public int hashCode(){
		return 1111;
	}
	
	public boolean equals(Object obj){
		
//		return this.hashCode()==obj.hashCode();
		return this.toString().equals(obj.toString());
	}
	
	public Object clone(){
		return this;
	}
	
//	public String toString(){
//		return "¹Ù²Þ";
//	}

}

















