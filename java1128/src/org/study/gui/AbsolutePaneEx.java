package org.study.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class AbsolutePaneEx extends JFrame {

	public AbsolutePaneEx() {
		this.setTitle("AbsolutePaneEx");	// 프레임의 타이틀 달기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 윈도우를 닫으면 프로그램 종료
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton btn1 = new JButton("BTN1");
		JButton btn2 = new JButton("BTN2");
		JButton btn3 = new JButton("BTN3");
		JButton btn4 = new JButton("BTN4");
		
		btn1.setSize(150, 50);
		btn2.setSize(150, 50);
		btn3.setSize(150, 50);
		btn4.setSize(150, 50);
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		btn1.setLocation(0, 0);
		btn1.setBackground(Color.green);
		
		btn2.setLocation(450, 0);
		btn2.setBackground(Color.orange);
		
		btn3.setLocation(450, 550);
		btn3.setBackground(Color.PINK);
		
		btn4.setLocation(0, 550);
		btn4.setBackground(Color.YELLOW);
		
		//btn1,btn2,btn3 -> 프레임의 정중앙에 배치하도록 설정하시오
		
		// Object, JFrame
		this.add(panel);
		this.setSize(600, 600);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new AbsolutePaneEx();
	}
}
