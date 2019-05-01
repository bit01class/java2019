package com.bit.io;

import java.io.Externalizable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

class Car implements Externalizable{// implements Serializable{
	private static final long serialVersionUID = 2L;
	
	int speed;
	int min;
	int max;
	String model;
	
	public Car() {
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("writeExternal");
		out.writeInt(speed);
		out.writeUTF(model);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("readExternal");
		speed=in.readInt();
		model=in.readUTF();
	}
	
//	public void speedup(int speed){
//		this.speed=1234;
//	}
}


public class Ex03 {

	public static void main(String[] args) {
		File file = new File("files\\data.bin");

		OutputStream os=null;
		ObjectOutputStream oos=null;
		
		try {
			os=new FileOutputStream(file);
			oos=new ObjectOutputStream(os);
			
			ArrayList list1=new ArrayList();
			list1.add(1111);
			list1.add("둘째");
			list1.add('3');
			
			oos.writeObject(list1);
			
			LinkedList list2=new LinkedList();
			list2.add(1111);
			list2.add("둘째");
			list2.add('3');
			
			oos.writeObject(list2);
			
			HashSet set1=new HashSet();
			set1.add(111);
			set1.add(2222);
			set1.add(111);
			set1.add(33);
			
			oos.writeObject(set1);
			
			TreeSet set2=new TreeSet();
			set2.add(111);
			set2.add(2222);
			set2.add(111);
			set2.add(33);
			
			oos.writeObject(set2);
			
			HashMap map1=new HashMap();
			map1.put("key1", "value1");
			map1.put("key2", "value2");
			map1.put("key3", "value3");
			
			oos.writeObject(map1);
			
			TreeMap map2=new TreeMap();
			map2.put("key1", "value1");
			map2.put("key2", "value2");
			map2.put("key3", "value3");
			
			oos.writeObject(map2);
			
			String msg1=new String("문자열:String");
			oos.writeObject(msg1);
			
			StringBuffer msg2=new StringBuffer();
			msg2.append("문자열:");
			msg2.append("StringBuffer");
			oos.writeObject(msg2);
			
			int[] arr1={1,3,5,7,9};
			oos.writeObject(arr1);
			
			int[][] arr2={
					{1,2},{1,3,5},{1,4,7,9}
			};
			oos.writeObject(arr2);
			
			Car car=new Car();
			car.speed=1;
			car.min=2;
			car.max=3;
			car.model="4";
			oos.writeObject(car);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null){oos.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작성 완료");
		
	}

}


















