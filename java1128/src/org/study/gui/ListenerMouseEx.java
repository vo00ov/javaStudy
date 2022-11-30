package org.study.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// 클릭햇을 때
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.yellow);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 누르고 있다가 땟을 때
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.red);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 눌렀다 땠을 때 **********************
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.MAGENTA);
	}

	@Override
	public void mouseEntered(MouseEvent e) { // e -> 실제 이벤트 적용 target
		// 마우스가 버튼에 올라올 때 호출
		JButton btn = (JButton) e.getSource();
		// 마우스가 올라간 버튼의 주소를 알아낸다
		btn.setBackground(Color.GREEN);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 버튼에서 내려 갈 때 호출
		JButton btn = (JButton) e.getSource();
		// 마우스가 올라간 버튼의 주소를 알아낸다
		btn.setBackground(Color.cyan);
		// 버튼의 배경색을 파란색으로 변경
	}
	
}

public class ListenerMouseEx extends JFrame{
	
	ListenerMouseEx(){
		this.setTitle("버튼에 Mouse 이벤트 리스너 작성");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 버튼 컴포넌트를 생성하고  MouserListener를 단다.
		JButton btn = new JButton("Mouse Event 테스트 버튼");
//		this.add(new JButton("Btn1"));
		btn.setBackground(Color.CYAN);
		
		
		// 마우스 리스너를 생성한다.
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener); // 버튼(btn) 마우스 리스너를 단다
		
		this.add(btn);
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new ListenerMouseEx();
	}

}
