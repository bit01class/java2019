package com.bit.am;

class Target4 implements java.lang.Comparable{
	int su=1000;
	
	public Target4() {
	}
	
	public Target4(int su) {
		this.su=su;
	}
	
	public boolean equals(Object obj){
		Target4 me=this;
		Target4 you=(Target4)obj;
		return me.su ==you.su;
	}

	public String toString(){
		return ""+su;
	}

	@Override
	public int compareTo(Object obj) {
		Target4 me=this;
		Target4 you=(Target4) obj;
		
//		return me.su-you.su ;
		return you.su-me.su ;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Target4 target4=new Target4();
		Target4 target5=new Target4(1234);
		System.out.println(target5);
		System.out.println(target4.equals(target5));

	}

}
