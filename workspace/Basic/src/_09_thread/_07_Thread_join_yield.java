package _09_thread;

public class _07_Thread_join_yield {
	static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		Hypen t1 = new Hypen();
		Bar t2 = new Bar();
		t1.start();
		t2.start();
		try {
			t1.join();// main쓰레드가 t1이 끝날때 까지 기다린다.
			t2.join();// main쓰레드가 t2이 끝날때 까지 기다린다.
			// t1.yield();//t1이 양보한다.
			// t2.yield();//t2이 양보한다.
		} catch (Exception e) {}
		System.out.print("소요시간: " + (System.currentTimeMillis() - _07_Thread_join_yield.startTime));
	}
}

class Hypen extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Bar extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}