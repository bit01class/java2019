package com.bit.am;

class MyArray{
	private Object[] arr;
	
	public MyArray() {
		arr=new Object[0];
	}
	public MyArray(int su) {
		arr=new Object[su];
	}
	
	public int size(){
		return arr.length;
	}
	
	public void add(Object value){
	
		Object[] old=arr;
		arr=new Object[old.length+1];
		System.arraycopy(old, 0, arr, 0, old.length);
		arr[arr.length-1]=value;
	}
	
	public Object get(int idx){
		return arr[idx];
	}
}


public class Ex03 {

	public static void main(String[] args) {
		// 동적처리(동적, 순서O)
//		MyArray arr=new MyArray();
		java.util.ArrayList arr=new java.util.ArrayList();
		arr.add(1111);
		arr.add(2222);
		arr.add("잘나옴");
		arr.add("또나와라");
		arr.add("또나와라1");
		arr.add("또나와라2");
		arr.add("또나와라3");
		arr.add(23423453);
		arr.add(3.14);
		arr.add(true);
		arr.add('A');
		
		for(int i=0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}
	}

}



















