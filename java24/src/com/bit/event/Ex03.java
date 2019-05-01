package com.bit.event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class Ex03 extends Frame implements ItemListener{
	Choice cho;
	List list;
	
	public Ex03() {
		Panel p=new Panel();
		
		cho=new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		cho.addItem("item5");
		
//		cho.addItemListener(this);
//		p.add(cho);
		
//		CheckboxGroup cbg=new CheckboxGroup();
//		Checkbox chk1=new Checkbox("item1",cbg,false);
//		Checkbox chk2=new Checkbox("item2",cbg,true);
//		Checkbox chk3=new Checkbox("item3",cbg,false);
//		Checkbox chk4=new Checkbox("item4",cbg,false);
//		
//		chk1.addItemListener(this);
//		chk2.addItemListener(this);
//		chk3.addItemListener(this);
//		chk4.addItemListener(this);
//		
//		p.add(chk1);
//		p.add(chk2);
//		p.add(chk3);
//		p.add(chk4);
		
		list=new List(5,true);
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.add("item5");
		list.addItemListener(this);
		p.add(list);
		
		add(p);
		setBounds(100-1280,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03 me = new Ex03();
		

	}

	public void itemStateChanged(ItemEvent e) {
//		System.out.println(cho.getSelectedIndex());
//		System.out.println(cho.getSelectedItem());
		Object obj = e.getItem();
		int chkState = e.getStateChange();
//		System.out.println(obj+","+chkState);
		
//		if(chkState==ItemEvent.SELECTED){
//			System.out.println(obj+" 선택함");
////			System.out.println(list.getItem(((Integer)obj)));
//		}else if(chkState==ItemEvent.DESELECTED){
//			System.out.println(obj+" 선택해제");
//		}
		
		String[] items = list.getSelectedItems();
		System.out.println(Arrays.toString(items));
//		for(int i=0; i<items.length; i++){
//			System.out.println(items[i]);
//		}
	}

}


















