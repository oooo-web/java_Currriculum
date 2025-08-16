package curriculum_B;

import java.util.Scanner;

public class Qes3 {
	public static void main(String[] args) {
		
		/*for 文を使って 1 から 10 までの数字を 1 つずつ表示*/
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		/*for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示*/
		for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
		 }
		
		
		/*for 文を使って 10 から 1 まで カウントダウンして表示*/
		for (int i = 10; i >= 1; i--) {
		    System.out.println(i);
		}
		
		
		/*for 文を使って 1 から 100 までの合計 を表示*/
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
		    sum += i; // 合計を蓄積する
		}
		System.out.println(sum);
		
	
		
		/*for 文を使って 以下のような三角形を出力*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
	        System.out.print("*");
	    }
	    System.out.println(); // 改行
		}
		
		
		/*while 文を使って 1 から 10 まで を 1 つずつ表示*/
		int i = 1;

		while (i <= 10) {
		    System.out.println(i);
		    i++;
		}
		
		
		/*while 文を使って 2 から 20 までの偶数 を 1 つずつ表示*/
		int q = 2;
		
		while(q <=20) {
			System.out.println(q);
			q += 2;
		}
		
		
		/*while 文を使って 10 から 1 まで のカウントダウンを表示*/
		int o= 10;
		
		while(o >= 1) {
			System.out.println(o);	
			o--;
		}
		
		
		/*while 文を使って 1 から 100 までの合計 を表示*/
		int a = 1;
		int sum1 = 0;

		while (a <= 100) {
		    sum1 += a;  // sum = sum + i;
		    a++;
		}

		System.out.println(sum1);
		
		
		/*ユーザーから 数値を入力 してもらう...*/
		Scanner scanner = new Scanner(System.in);  // Scannerの用意
        int number = -1;  // 初期値（0以外なら何でもOK）

        while (number != 0) {
            System.out.print("数値を入力してください（0で終了）: ");
            number = scanner.nextInt();  // ユーザーの入力を受け取る
        }

        System.out.println("終了しました");
        scanner.close();  // Scannerを閉じる（メモリ解放）
        
        
		/*for文を使用して下記の通りに出力してください*/
        for (int dan = 1; dan <= 9; dan++) {
            for (int b = 1; b <= 9; b++) {
                String left = String.format("%02d", dan);
                String right = String.format("%02d", b);
                String result = String.format("%02d", dan * b);

                System.out.print(left + "＊" + right + "＝" + result);

                if (b != 9) {
                    System.out.print("　||　");
                }
            }
            System.out.println(); // 段ごとに改行
        }

}

}
