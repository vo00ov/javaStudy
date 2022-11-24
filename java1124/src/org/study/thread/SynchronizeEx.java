package org.study.thread;

// 1. 공유 자원 Synchronize
class ShareStorage {

	// Thread공유 자원
	synchronized void storagePrint(String str) {
//		System.out.println(str);

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 2. Thread -> 공유 자원 Synchronize 접근
class Thread4 extends Thread {

	private ShareStorage share;
	private String str;

	public Thread4(ShareStorage share, String str) {
		super();
		this.share = share;
		this.str = str;
	}

	@Override
	public void run() {

		share.storagePrint(str);
	}
}

public class SynchronizeEx {

	public static void main(String[] args) {
		// 3. 1, 2, -> Thread 구현
		ShareStorage s1 = new ShareStorage();
		ShareStorage s2 = new ShareStorage();
		
		String str1 = "abcdefghijklmn";
		String str2 = "가나다라마바사아자차카타";
		
		Thread4 t1 = new Thread4(s1, str1);
		Thread4 t2 = new Thread4(s2, str2);

		t1.start();
		t2.start();
		
	}
}
