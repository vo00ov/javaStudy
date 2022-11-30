package org.study.gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuEx extends JFrame{

	public JMenuEx() {
		super("JMenu Ex");
		JMenuBar bar = new JMenuBar();	// 메뉴바 생성
		setJMenuBar(bar);	// 적용
		
		// 파일 메뉴 만들기
		JMenu fileMenu = new JMenu("파일(F)");
		fileMenu.setMnemonic('F');	// 단축키를 Alt + F 로 설정
		
		JMenuItem newFile = new JMenuItem("새파일(N)");	// 2차 메뉴 탭(아이템) 설정
		newFile.setMnemonic('N');	// 단축키를 Alt + N 으로 설정
		fileMenu.add(newFile);	// JMenuItem 인 newFile을 JMeun의 fileMenu에 저장
		
		JMenuItem open = new JMenuItem("열기(O)");
		open.setMnemonic('O');
		fileMenu.add(open);
		
		JMenuItem save = new JMenuItem("저장(S)");
		open.setMnemonic('S');
		fileMenu.add(save);
		
		JMenuItem close = new JMenuItem("닫기(C)");
		open.setMnemonic('C');
		fileMenu.add(close); 
		bar.add(fileMenu); // JMenuBar에 JMenu 부착
		
		
		// 도움말 메뉴 만들기
		JMenu helpMenu = new JMenu("도움말(D)");
		helpMenu.setMnemonic('D');	// 단축키를 Alt + D 로 설정
		
		JMenuItem help = new JMenuItem("Help(H)");
		help.setMnemonic('H');
		helpMenu.add(help);
		bar.add(helpMenu);
		
		setSize(400, 200);	// 프레임 사이즈 설정
		setVisible(true);	// 보이기
		
		
	}
	
	public static void main(String[] args) {
		
		JMenuEx j1 = new JMenuEx();
		j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
