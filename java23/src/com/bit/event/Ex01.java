package com.bit.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 extends Frame implements WindowListener{

	public Ex01() {
		
		addWindowListener(this);// 이벤트 등록
		
		setSize(300,200);
		setLocation(100-1280,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		System.out.println("메인끝");
	}
	/// 이벤트 들 ///
	public void windowOpened(WindowEvent e) {
		System.out.println("창이 열림...");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("창닫기...");
		//System.exit(0);
		dispose();
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("프로그램 종료시 수행하고 싶은 일...");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("최소화...");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("비최소화...");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("활성화...");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("비활성화...");
	}

}











