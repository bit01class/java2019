package com.bit.am;

class Â¥Àå{
	
}

class Â«»Í{
	
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
		Â¥Àå c1=new Â¥Àå();
		Â«»Í c2=new Â«»Í();
		Box4<Â¥Àå,Â«»Í> box=new Box4<Â¥Àå,Â«»Í>();
		box.set(c1, c2);
	}

}












