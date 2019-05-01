package com.bit.pm2;

interface Crud{
	void add();
	void list();
	void edit();
	void delete();
}

class Bbs implements Crud{

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void list() {
		// TODO Auto-generated method stub
		
	}

	public void edit() {
		Crud me=new Bbs();
		me.delete();
		//~~~
		me.add();
		//~~~
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
