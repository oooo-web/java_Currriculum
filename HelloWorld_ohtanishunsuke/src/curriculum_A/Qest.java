package curriculum_A;

public class Qest {

	public static void main(String[] args) {
		
		
		//各型の変数を宣言し、初期値を設定してください。				
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0L;
		float floatNum = 0.0f;
		double doubleNum = 0.0d;
		char letter = '\u0000';// 初期値はヌル文字
		String letters = null;// 参照型の初期値はnull
		boolean isBoolean = false;// 論理型の初期値はfalse
		
		
		
		//1で宣言した各型の変数に指定された値を代入してください					
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;	
		
		
		
		//値を代入した変数を用いて出力をしてください
		System.out.println(byteNum + longNum);    
		System.out.println(byteNum + byteNum);
		System.out.println(letter + letters + isBoolean);
		System.out.println(longNum + shortNum + byteNum *3);
		System.out.println(byteNum * shortNum * intNum * longNum * floatNum);
		System.out.println(doubleNum % shortNum);
		System.out.println(byteNum - shortNum);
		
		
		
	    //name という String型の変数 を宣言し...
		String name = "山田太郎"; 
		System.out.println("こんにちは、" + name + "さん！" );
        
		
		
		//age という int型の変数 を宣言し...
		int age = 25;
		System.out.println("年齢:" +  age  + "歳");
		
		
		
		 // num1 という int型の変数 を宣言し、10 を代入...
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);// 15
		
		
		
		//score という int型の変数 を宣言し、80 を代入...
		int score = 80;
		score = score + 20;
		System.out.println(score);// 100
			
		
		
		//price という double型の変数 を宣言し、99.99 を代入...
		double price = 99.99;
		int intPrice = (int) price; 
		System.out.println("整数価格: " + intPrice); // 99 
		
		
		
		//String 型の変数 numStr に "123" を代入... 
		String numStr = "123";
		int parsed = Integer.parseInt(numStr);
		int num5 = parsed + 10;  
		System.out.println("変換後の値: " + num5); // 133
		
		
		
		//int 型の変数 num に 50 を代入...
		int num = 50; 
		String strNum = String.valueOf(num);
		System.out.println("得点" + strNum + "点");// 得点50点
		
		
		
		//次の条件を満たすプログラムを条件演算子を使用して作成してください。...
		int a = 10;
		int b = 20;
		boolean result = a < b;
		System.out.println(result);// true
		
		
		
		//条件演算子（三項演算子）を使用してください。
		 int x = 15;  // x に 15 を代入
	     String result1 = (x >= 10) ? "OK" : "NG";  // 三項演算子で判定
	     System.out.println(result1); // OK
		
//		<<if文>>		
//		int x = 15;
//		if(x >= 10){
//			System.out.println("OK");
//		}else {
//			System.out.println("NG");
//		}
		
		
		 String text = "私はJavaが好きです。Javaは楽しい！";
		 String replacedText = text.replace("Java", "Python");  // 置き換え
		 System.out.println(replacedText); // 私はPythonが好きです。Pythonは楽しい！
		
		
		
	}

}