package com.bit.day13;

public class BitArray {
	private int[] val;
	
	public BitArray() {
		val=new int[0];
	}
	
	public int size(){
		return val.length;
	}

	public void add(int su){
		int[] temp=val;
		val=new int[val.length+1];
		// arrayCopy
		for(int i=0; i<temp.length; i++){
			val[i]=temp[i];
		}
		val[val.length-1]=su;
	}
	
	public int get(int index){
		return val[index];
	}
	
}









