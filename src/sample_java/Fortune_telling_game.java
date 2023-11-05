package sample_java;

public class Fortune_telling_game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortuneNum = new java.util.Random().nextInt(4);
		fortuneNum ++;
		String fortune = "";
		switch(fortuneNum) {
		case 1:
			fortune = "大吉";
			break;
		case 2:
			fortune = "中吉";
			break;
		case 3:
			fortune = "吉";
			break;
		case 4:
			fortune = "凶";
			break;
		}
		
		System.out.println("占いの結果がでました");
		System.out.println(age + "歳の" + name + "さん、あなたの運気は" + fortune + "です");
	}

}