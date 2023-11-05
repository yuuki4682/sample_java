package sample_java;

public class Practice_for_test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		int sum = 0;
		for (int i = 10; i > 1; i -= 2) {
			System.out.println(i);
			count ++;
			sum += i;
		}
		System.out.println("個数は" + count);
		System.out.println("合計は" + sum);
		
	}

}
