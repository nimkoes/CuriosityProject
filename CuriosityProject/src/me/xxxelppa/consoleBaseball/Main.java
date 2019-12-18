package me.xxxelppa.consoleBaseball;

public class Main {
	public static void main(String[] ar) {
		System.out.println("xxxelppa's baseball game");
		System.out.println("please input number only");
		CommonControl cc = new CommonControl();

		GameControl gc = new GameControl((int) cc.input(1));
		gc.genTargetNumber();

		while (!gc.getResult()) {
			try {
				System.out.println();
				gc.compare((String[]) cc.input(2));
			} catch (Exception e) {
				System.out.println("please input number only..");
			}
		}
	}
}
