package me.xxxelppa.consoleBaseball;

import java.util.Scanner;

class CommonControl {
	private Scanner sc;
	private int inputNumber;
	private String[] targetNumber;
	private int[] dupCheck;

	public CommonControl() {
		// TODO Auto-generated constructor stub
		this.sc = new Scanner(System.in);
		this.dupCheck = new int[10];
		this.inputNumber = 0;
	}

	public Object input(int type) {
		switch (type) {
		case 1:
			System.out.print("input target number length (3 ~ 10) : ");
			this.inputNumber = sc.nextInt();

			if (this.inputNumber < 3 || this.inputNumber > 10) {
				System.out.println("out of bound");
				System.out.println("shut down program");
				System.out.println("please restart");
				System.exit(0);
			}
			return this.inputNumber;
		case 2:

			boolean dupFlag = true;

			while (dupFlag) {
				dupFlag = false;
				for (int i = 0; i < dupCheck.length; ++i) {
					dupCheck[i] = 0;
				}

				System.out.print("input expect number : ");
				this.targetNumber = sc.next().split("");

				for (int i = 0; i < this.targetNumber.length; ++i) {
					dupCheck[Integer.parseInt(this.targetNumber[i])]++;
				}

				for (int i = 0; i < this.dupCheck.length; ++i) {
					if (dupCheck[i] > 1) {
						System.out.println("duplicate input. input again");
						dupFlag = true;
						break;
					}
				}

				if (this.targetNumber.length < this.inputNumber) {
					System.out.println("input number is too short");
					dupFlag = true;
				}
			}
			return this.targetNumber;

		default:
			return "";
		}
	}
}