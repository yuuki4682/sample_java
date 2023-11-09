package sample_java;

import java.util.Arrays;

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
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i);
			if (i != 10) {
				System.out.print(",");
			}
		}
		
		System.out.println("");
		
		int[] arr = new int[20];
		for (int i = 0; i < 20; i ++) {
			arr[i] = i * 5;
		}
		System.out.println(Arrays.toString(arr));
		
		boolean flg = true;
		String str1 = "";
		String str2 = "";
		
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 1) {
				if (flg) {
					str1 += arr[i];
					flg = false;
				}else {
					str1 += "," + arr[i];
				}
			}
		}
		
		flg = true;
		for (int i = 11; i < 20; i ++) {
			if (arr[i] % 2 == 0) {
				if (flg) {
					str2 += arr[i];
					flg = false;
				}else {
					str2 += "," + arr[i];
				}
			}
		}
		
		
		System.out.println("奇数：" + str1);
		System.out.println("偶数：" + str2);
//		System.out.print("1-10の奇数:");
//		for (int i = 0; i < 10; i ++) {
//			int temp1 = arr[i];
//			if (temp1 % 2 == 1) {
//				System.out.print(temp1 + ",");
//			}
//		}
//
//		System.out.println("");
//		System.out.print("11-20の偶数:");
//		for (int i = 11; i < 20; i ++) {
//			int temp2 = arr[i];
//			if (temp2 % 2 == 0) {
//				System.out.print(temp2 + ",");
//			}
//		}
		
		
	}

}
