package com.bit.ui;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex04 extends Frame{
	
	public Ex04() {
		GridBagLayout gbl=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		Panel p1= new Panel();
		p1.setLayout(gbl);
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(new Label("�� ��"),gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(new TextField(),gbc);
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(new Label("�� ��"),gbc);
		Panel p2=new Panel();
		p2.add(new Checkbox("��",true));
		p2.add(new Checkbox("��"));
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(p2,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(new Label("�ֹι�ȣ"),gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(new Label("�� ��"),gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(new Label("�� �� ��"),gbc);
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(new Label("�� ����"),gbc);
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p1.add(new Label("�ڱ�Ұ�"),gbc);
		
		
		add(p1);
		setSize(300,500);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex04 me = new Ex04();

	}

}



