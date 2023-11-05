package sample_java;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final double tax = 1.08;
		int fax = 5;
		System.out.println("５万円から４万円に値下げします。");
		fax = 4;
		System.out.println("FAXの新価格（税込み）");
		System.out.println(fax * tax + "万円");
	}

}
