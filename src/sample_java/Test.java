package sample_java;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/**
		// 1-2
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println("縦幅３　横幅５　の長方形の面積は、" + c );
		
		int x = 5;
		int y = 10;
		String ans = "ｘ+ｙは" + (x + y);
		System.out.println(ans);
		
		//3-1
		int weight = 60;
		if (weight == 60) {
			System.out.println("Q1 OK");
		}
		int age1 = 20;
		int age2 = 30;
		if (weight < (age1 + age2) * 2) {
			System.out.println("Q2 OK");
		}
		int age = 3;
		if (age % 2 == 1) {
			System.out.println("Q3 OK");
		}
		String name = "湊";
		if (name.equals("湊")) {
			System.out.println("Q4 OK");
		}
		
		//3-3
		int seibetu = 0;
		int age = 26;
		System.out.println("こんにちは。");
		if (seibetu == 0) {
			System.out.println("私は男です。");
			System.out.println(age + "歳です。");
		}else {
			System.out.println("私は女です。");
		}
		System.out.println("よろしくおねがいします。");
		
		//3-4
		boolean tenki = false;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		}else {
			System.out.println("DVDをみます");
			System.out.println("寝ます");
		}
		
		//3-5
		System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更 >");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}
		**/
		
		//3-6
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i ++) {
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			}else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを修了します");
	}

}
