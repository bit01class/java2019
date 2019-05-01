package com.bit.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		InetAddress addr1=null;
		InetAddress[] addr2=null;
		try {
			addr1 = InetAddress.getByName("naver.com");
			addr2 = InetAddress.getAllByName("www.naver.com");
			
			for(int i=0; i<addr2.length; i++){
				System.out.println(addr2[i].getHostName());
				System.out.println(addr2[i].getHostAddress());
				System.out.println(addr2[i].getCanonicalHostName());
				System.out.println("-----------------------------");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		
		
		
//		System.out.println(addr1.getHostName());
//		System.out.println(addr1.getHostAddress());
//		System.out.println(addr1.getCanonicalHostName());
//		byte[] arr=addr1.getAddress();
//		System.out.println(Arrays.toString(arr));
	}

}

/*
 * IPv4 주소는 232인 4,294,967,296개
 * IPv6의 약 3.4x1038개(340,282,366,920,938,463,463,374,607,431,768,211,456개)[
 * 
 * 
naver.com
210.89.160.88
210.89.160.88
[-46, 89, -96, 88]
---------------
google.com
172.217.161.174
hkg07s29-in-f14.1e100.net
[-84, -39, -95, -114]


naver.com
210.89.164.90
210.89.164.90
-----------------------------
naver.com
125.209.222.142
125.209.222.142
-----------------------------
naver.com
125.209.222.141
125.209.222.141
-----------------------------
naver.com
210.89.160.88
210.89.160.88
 * */
















