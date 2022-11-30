package org.study.gui;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JMenu2 extends JFrame implements ActionListener {

	JPanel jPanel; // 패널
	JMenuBar jMenuBar; // 메뉴바
	JMenu jmenu1, jmenu2; // 메뉴 1,2
	JMenuItem item1, item2, item3, exit, ramda, item4; // 메뉴 아이템

	public JMenu2() {
		super("JMenu2 예제 ");
		jMenuBar = new JMenuBar();
		setJMenuBar(jMenuBar);

		jmenu1 = new JMenu("파일(F)");
		jmenu1.setMnemonic('F');
		jmenu2 = new JMenu("도움말(H)");
		jmenu2.setMnemonic('H');

		item1 = new JMenuItem("새창(N)");
		item1.setMnemonic('N');

		item2 = new JMenuItem("출력(P)");
		item2.setMnemonic('P');

		exit = new JMenuItem("닫기(C)");
		exit.setMnemonic('C');

		item3 = new JMenuItem("자세히(D)");
		item3.setMnemonic('D');

		ramda = new JMenuItem("람다식");
		item4 = new JMenuItem("익명");

		jMenuBar.add(jmenu1);
		jMenuBar.add(jmenu2);

		jmenu1.add(item1);
		jmenu1.add(item2);
		jmenu1.add(exit);

		jmenu2.add(item3);
		jmenu2.add(ramda);
		jmenu2.add(item4);

		setSize(400, 400); // 프레임 사이즈 설정
		setVisible(true); // 보이기

		item4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명 이용");
			}
		});

		// 이벤트 구현 -> 람다식
		ramda.addActionListener((ActionEvent e) -> {
			System.out.println("람다식 이용방법");
		});

		// 이벤트 구현 -> 동시구현 방법
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 target 구별
		if (e.getSource() == exit) {
			System.exit(0);
		} else if (e.getSource() == item1) {
			newWindow(); // 메서드(새창띄우기)
		} else if (e.getSource() == item2) {
			System.out.println("아 이렇게 하면 이렇게 나오는구나");
		} else if (e.getSource() == item3) {
			System.out.println("이거는 자세히 버튼을 눌러서 자세히 나와야하는데 글쓰기가 매우 귀찮다");
		}
	}

	private void newWindow() {
		// 컨테이너 JFrame, JPanel
		// JFrame -> 윈도우
		// JPanel -> 그룹핑된
		JPanel jPanel = new JPanel();
		Dialog dialog = new Dialog(this, "New File");
		Button btn = new Button("Close");

		dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 100));
		btn.setSize(100, 100);
		jPanel.add(btn);
		dialog.add(jPanel);

		dialog.setSize(200, 200);
		dialog.setVisible(true);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(false);
			}
		});

	}

	public static void main(String[] args) {
		JMenu2 j2 = new JMenu2();
		j2.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
