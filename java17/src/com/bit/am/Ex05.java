package com.bit.am;

class ¥��{
	
}

class «��{
	
}

class Box4<T1,T2>{
	T1 a1;
	T2 a2;
	
	public void set(T1 b1, T2 b2){
		a1=b1;
		a2=b2;
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		¥�� c1=new ¥��();
		«�� c2=new «��();
		Box4<¥��,«��> box=new Box4<¥��,«��>();
		box.set(c1, c2);
	}

}












