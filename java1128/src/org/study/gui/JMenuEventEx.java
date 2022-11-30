package org.study.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuEventEx extends JFrame implements ActionListener {
	
	JMenuBar jMenuB;
	JMenu jMenu;
	JMenuItem jMe_01, jMe_02, jMe_03;
	Button btn;
	
	public JMenuEventEx() {
		super("JMenuEventEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		
		jMenuB = new JMenuBar();	// MenuBar 생성
		jMenu = new JMenu("메뉴");		// JMenu 생성
		jMe_01 = new JMenuItem("메뉴1");	// 아이템 생성
		jMe_02 = new JMenuItem("메뉴2");	// 아이템 생성
		jMe_03 = new JMenuItem("닫기");
		btn = new Button("Close");		// button 생성
		
		this.add(jMenuB);	// 프레임에 bar추가
		jMenuB.add(jMenu);	// bar에 메뉴추가
		jMenu.add(jMe_01);	// 메뉴에 아이템 추가
		jMenu.add(jMe_02);	// 메뉴에 아이템 추가
		jMenu.add(jMe_03);	// 메뉴에 아이템 추가
		
		this.setSize(500, 400);	// 프레임 크기
		this.setVisible(true);	// 보이기
		
		
		
		jMe_01.addActionListener(this); // 이벤트 연결
		
		jMe_03.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
			
		JDialog dial = new JDialog(this, "다이얼로그");	// 다이얼로그 컴포넌트
		dial.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 120));
		btn.setSize(100, 100);
		dial.add(btn);
		dial.setSize(300, 200);
		dial.setVisible(true);
		
		
		// btn 클릭 -> ActionListener의 actionPerformed 메서드를 구현
		// Android 이벤트 구현 방법 중에 하나
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(false);	// 다이얼 로그 버튼 클릭 하면 다이얼 안보임
			}
		});
		
		
		
//		Android App 이벤트 적용
//		btn.addActionListener(this);
//		// this
//		ActionListener a1 = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("오버라이딩");
//				dial.setVisible(false);
//			}
//		};

		
	}
	
	public static void main(String[] args) {
		
		new JMenuEventEx();
		
	}

}
