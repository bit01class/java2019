package com.bit.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 extends Frame implements WindowListener{

	public Ex01() {
		
		addWindowListener(this);// �̺�Ʈ ���
		
		setSize(300,200);
		setLocation(100-1280,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		System.out.println("���γ�");
	}
	/// �̺�Ʈ �� ///
	public void windowOpened(WindowEvent e) {
		System.out.println("â�� ����...");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("â�ݱ�...");
		//System.exit(0);
		dispose();
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("���α׷� ����� �����ϰ� ���� ��...");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ...");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("���ּ�ȭ...");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("Ȱ��ȭ...");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("��Ȱ��ȭ...");
	}

}











