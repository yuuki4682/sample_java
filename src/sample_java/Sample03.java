package sample_java;

public class Sample03 {
	
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/**
		System.out.println("メソッドを呼び出します");
		hello("Taro");
		System.out.println("メソッドの呼び出し終了");
		
		add(100,20);
		add(200,50);
		
		int ans = add(100,10);
		System.out.println(add(add(10,20),add(30,40)));
		
		int[] arr = {1, 2, 3};
		printArray(arr);
		
		**/
		
		//int[] array = {1, 2, 3};
		//incArray(array);
		
		int[] array = makeArray(3);
		
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
	}
	
	
	/**
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	
	public static int add(int x, int y) {
		int ans = x + y;
		//System.out.println(x + "+" + y + "=" + ans);
		return ans;
	}
	
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}
	**/

}
