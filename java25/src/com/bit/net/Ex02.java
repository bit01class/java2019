package com.bit.net;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
//		String msg="https://www.google.com/search?q=Electron";
		String msg="http://www.seoul.go.kr/main/index.jsp";
		URL url=null;
		try {
			url=new URL(msg);
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}













