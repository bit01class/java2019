package com.bit.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		String str="http://www.seoul.go.kr/main/index.jsp";
		URL url=null;
		InputStream is =null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			url=new URL(str);
			URLConnection conn = url.openConnection();
			conn.connect();
			is = conn.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String msg=null;
			while((msg=br.readLine())!=null){
				System.out.println(msg);
			}
			
//			String type = conn.getContentType();
//			int size = conn.getContentLength();
//			System.out.println(type);
//			System.out.println(size+"byte");
//			Map head = conn.getHeaderFields();
//			Set keys = head.keySet();
//			Iterator ite = keys.iterator();
//			while(ite.hasNext()){
//				String key = (String) ite.next();
//				System.out.println(key+"::"+head.get(key));
//			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}















