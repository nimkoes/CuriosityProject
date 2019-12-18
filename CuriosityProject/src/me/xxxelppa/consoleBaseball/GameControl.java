package me.xxxelppa.consoleBaseball;

import java.util.Random;

class GameControl {
	private int numberLength;
	private int strikeCnt;
	private int ballCnt;
	private int tryCnt;

	private String[] targetNumber;
	private String[] userNumber;

	public GameControl(int numberLength) {
		// TODO Auto-generated constructor stub
		this.numberLength = numberLength;
		this.targetNumber = new String[this.numberLength];
		this.userNumber = new String[this.numberLength];
		this.strikeCnt = 0;
		this.ballCnt = 0;
	}

	public void genTargetNumber() {
		System.out.println("generate random number");
		boolean dupFlag = true;
		Random r = new Random();

		for (int i = 0; i < this.numberLength; ++i) {
			dupFlag = true;
			int temp = r.nextInt(10);
			while (dupFlag) {
				dupFlag = false;
				for (int j = 0; j < i; ++j) {
					if (String.valueOf(temp).equals(targetNumber[j])) {
						dupFlag = true;
						temp = r.nextInt(10);
					}
				}
			}
			targetNumber[i] = String.valueOf(temp);
		}
		System.out.println("random number was generated");
	}

	public void compare(String[] pNumber) {
		this.userNumber = pNumber;
		this.strikeCnt = 0;
		this.ballCnt = 0;
		this.tryCnt++;

		// strike count
		for (int i = 0; i < this.numberLength; ++i) {
			if (targetNumber[i].equals(userNumber[i])) {
				++this.strikeCnt;
			}
		}
		// ball count
		for (int i = 0; i < this.numberLength; ++i) {
			for (int j = 0; j < this.numberLength; ++j) {
				if (i == j)
					continue;

				if (targetNumber[i].equals(userNumber[j])) {
					++this.ballCnt;
				}
			}
		}
	}

	public String getUserNumber() {
		String userStr = "";
		for (int i = 0; i < this.numberLength; ++i) {
			userStr += this.userNumber[i];
		}
		return userStr;
	}

	public boolean getResult() {
		boolean result = false;
		if (this.tryCnt != 0) {
			System.out.println(this.tryCnt + " (st/nd/rd/th) try : [" + getUserNumber() + "] : [" + this.strikeCnt + "] Strike, [" + this.ballCnt + "] ball");
			if (this.numberLength == this.strikeCnt) {
				result = true;
				System.out.println("winner winner chicken dinner!");
				System.out.println("you got win " + this.tryCnt + " (st/nd/rd/th) try");
			}
		}
		return result;
	}
}