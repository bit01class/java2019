package com.bit.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex04 {

	public static void main(String[] args) {
		File file = new File("files\\data.bin");
		InputStream is=null;
		ObjectInputStream ois=null;
		
		if(file.exists()){
			try {
				is=new FileInputStream(file);
				ois=new ObjectInputStream(is);
				
				ArrayList list1=(ArrayList) ois.readObject();
				LinkedList list2=(LinkedList) ois.readObject();
				HashSet set1=(HashSet) ois.readObject();
				TreeSet set2=(TreeSet) ois.readObject();
				HashMap map1=(HashMap) ois.readObject();
				TreeMap map2=(TreeMap) ois.readObject();
				String msg1=(String) ois.readObject();
				StringBuffer msg2=(StringBuffer) ois.readObject();
				int[] arr1=(int[]) ois.readObject();
				int[][] arr2=(int[][]) ois.readObject();
				Car car=(Car) ois.readObject();
				
				System.out.println(list1);
				System.out.println(list2);
				System.out.println(set1);
				System.out.println(set2);
				System.out.println(map1);
				System.out.println(map2);
				System.out.println(msg1);
				System.out.println(msg2);
				System.out.println(Arrays.toString(arr1));
				for(int i=0; i<arr2.length; i++){
					System.out.println(Arrays.toString(arr2[i]));
				}
				System.out.println(car.speed);
				System.out.println(car.min);
				System.out.println(car.max);
				System.out.println(car.model);
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					if(ois!=null){ois.close();}
					if(is!=null){is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			
		}

	}

}
















