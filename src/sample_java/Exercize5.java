package sample_java;

public class Exercize5 {
	
	public static void introduceOneself() {
		String name = "Taro";
		int age = 21;
		double height = 170.2;
		char sex = 'M';
		System.out.println("Name: " + name);
		System.out.println("age: " + age);
		System.out.println("height: " + height);
		System.out.println("sex: " + sex);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信いたしました");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
	}
	
	public static void email(String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信いたしました");
		System.out.println("件名：無題");
		System.out.println("本文：「" + text + "」");
	}
	
	public static double calcTriangleAea(double bottom,double height) {
		double area = ( bottom * height ) / 2;
		return area;
	}
	public static double calcCircleAea(double radius) {
		double pi = 3.14;
		double area = radius * radius * pi;
		return area;
	}



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		introduceOneself();
		
		System.out.println("");
		String title = "ご挨拶";
		String address = "Taro@sample.com";
		String text = "初めまして！\n〇〇商事の佐藤と申します。\nお客様は100万ペリカプレゼントキャンペーンにご当選いたしました！";

		email(title,address,text);

		System.out.println("");
		
		email(address,text);
		

		System.out.println("");
		
		System.out.println("三角形の面積：" + calcTriangleAea(10.0,5.0) + "㎠");
		System.out.println("円の面積：" + calcCircleAea(5.0) + "㎠");
	}

}
