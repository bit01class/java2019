package com.bit.am;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ex14 {

	public static void main(String[] args) {
		Vector vec1=new Vector();
		// �߰�
		vec1.addElement("ù��°");
		vec1.addElement("�ι�°");
		vec1.addElement("����°");
		vec1.addElement("�׹�°");
		
		// ����
		//vec1.insertElementAt("�߰�", 2);
		// ����
		//vec1.setElementAt(3333, 2);
		// ����
		//vec1.removeElementAt(1);
		//boolean result=vec1.removeElement("5��°");
		
//		vec1.removeAllElements();
		
//		for(int i=0; i<vec1.size(); i++){
//			System.out.println(vec1.elementAt(i));
//		}
		String msg="java web    db";
		String[] arr1 = msg.split(" ");
		
		java.util.StringTokenizer token=null;
		token=new StringTokenizer(msg);
		
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
//		while(token.hasMoreElements()){
//			System.out.println(token.nextElement());
//		}
		
		// ������
		Enumeration enu = vec1.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		
		Iterator ite = vec1.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		

	}

}














