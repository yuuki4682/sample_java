package calcapp.main;

import calcapp.logics.*;

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 2;
		
		int total = CalcLogics.tasu(a,b);
		int delta = CalcLogics.hiku(a,b);
		System.out.println("足すと" + total);
		System.out.println("引くと" + delta);
	}

}
