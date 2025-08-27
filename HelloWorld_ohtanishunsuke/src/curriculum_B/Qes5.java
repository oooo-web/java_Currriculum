package curriculum_B;

public class Qes5 {
	
	/*==================================*/
    // 引数なし、戻り値なしのメソッド
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

	/*==================================*/
    // 引数：int num
    // 戻り値：int （引数の2倍の値を返す）
    public static int doubleValue(int num) {
        return num * 2;
    }

    /*==================================*/
    // 引数：int num
    // 戻り値：boolean（偶数なら true、奇数なら false）
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        // Hello, World! の実行
        helloWorld();

        // 10 を 2 倍して表示
        int value = 10;
        int result = doubleValue(value);
        System.out.println(value + " を 2 倍すると " + result + " です。");

        // 偶数・奇数判定
        int num1 = 7;
        int num2 = 10;

        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }

        if (isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }
    }
    
    /*==================================*/

}
