package com.bit.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex12 extends JFrame{
	static Ex12 me;
	
	public Ex12() {
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ��������
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // �ƹ��͵� ����
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// dispose();
//		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// setVisible(false);
		JButton btn=new JButton("Ȯ��");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(me
//						, "Ȯ�θ޽����Դϴ�");
//				JOptionPane.showMessageDialog(me
//						, "Ȯ�θ޽����Դϴ�"
//						,"����",JOptionPane.INFORMATION_MESSAGE);
//				int result=JOptionPane.showConfirmDialog(me
//						, "Ȯ�θ޽����Դϴ�"
//						,"����",JOptionPane.YES_NO_OPTION);
//				int result=JOptionPane.showConfirmDialog(me
//						, "Ȯ�θ޽����Դϴ�"
//						,"����",JOptionPane.YES_NO_CANCEL_OPTION);
				String msg=JOptionPane.showInputDialog(me,"����¸�");
				
				System.out.println(msg);
			}
		});
		add(btn);
		setBounds(100-1280,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		me = new Ex12();
	}

}














