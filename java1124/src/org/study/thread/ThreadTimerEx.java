package org.study.thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	//Swing 
	JLabel timerLabel;// 타이머의 표시글

	public TimerThread(JLabel timerLabel) {
		super();
		this.timerLabel = timerLabel;
	}

	@Override // 스레드코드, run매서드가 종료하면 스레드도 종료
	public void run() {
		int num = 0;// 타이머카운트
		while (true) {
			timerLabel.setText(Integer.toString(num));
			num++;
			try {
				Thread.sleep(1000); // 1초동안..
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;// 스레드 종료해라.
			}
		}
	}

}

public class ThreadTimerEx extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ThreadTimerEx() {
		
		// JFrame 시작
		setTitle("Thread Timer 예제");
		// X눌렀을 때 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();// 패널하나
		c.setLayout(new FlowLayout());

		JLabel timerLaber = new JLabel();// 타이머 값
		timerLaber.setFont(new Font("Gothic", Font.BOLD, 80));
		c.add(timerLaber);

		setSize(250, 150);
		setVisible(true); // 보여라
		// JFrame 종료

		// Thread
		TimerThread thread = new TimerThread(timerLaber);
		thread.start();
	}

	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
