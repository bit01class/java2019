package com.bit.day13;

public class Ex06 {

	public static void main(String[] args) {
		String msg="java web        db spring";
		
		java.util.StringTokenizer token=null;
		token=new java.util.StringTokenizer(msg," ");
		
		System.out.println("token cnt:"+token.countTokens());
		String[] arr=new String[token.countTokens()];
		int cnt=0;
		
		while(token.hasMoreTokens()){
			arr[cnt++]=token.nextToken();
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}

}
