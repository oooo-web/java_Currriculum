package curriculum_B;

import java.util.Scanner;

public class Qes4 {
	public static void main(String[] args) {
		
		
      
		/*int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する
		配列の全要素を 順番に表示*/
		int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        
        
		/*int 型の配列 {10, 20, 30, 40, 50} を用意する
		配列の要素を 逆順 に表示*/   
        int[] number1 = {10, 20, 30, 40, 50};
        for (int i = number1.length - 1; i >= 0; i--) {
            System.out.println(number1[i]);
        }
        
        
		/*int 型の配列 {3, 5, 7, 9, 11} を用意する
		配列の全要素の 合計値 を計算し、表示*/
        int[] number2 = {3, 5, 7, 9, 11};
        int sum = 0;
        for (int i = 0; i < number2.length; i++) {
            sum += number2[i];
        }
        System.out.println(sum);
        
        
		/*int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		配列の 最大値と最小値 を求めて表示*/
        int[] numbers = {12, 7, 9, 21, 5, 18};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 結果を表示
        System.out.println("最大値は " + max);
        System.out.println("最小値は " + min);
        
        
        
		/*int 型の配列 {1, 2, 3, 4, 5} を用意する
		配列のすべての要素を 2 倍 し、結果を表示
		結果を表示する際の処理に拡張for文を使用してください*/  
        int[] number4 = {1, 2, 3, 4, 5};
        for (int i = 0; i < number4.length; i++) {
            number4[i] *= 2;
        }
        // 拡張for文で結果を表示
        for (int num : number4) {
            System.out.println(num);
        }
        
        
        
		/*int 型の配列 {4, 7, 10, 15, 20} を用意する
		ユーザーが入力した数が 配列に含まれているか を判定し、結果を表示
		結果：（”入力した値”は配列に含まれています／含まれていません）*/
        int[] number5 = {4, 7, 10, 15, 20};

        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください: ");
        int input = scanner.nextInt();
        boolean found = false;
        for (int num : number5) {
            if (num == input) {
                found = true;
                break;
            }
        }

        // 結果を表示
        if (found) {
            System.out.println(input + " は配列に含まれています。");
        } else {
            System.out.println(input + " は配列に含まれていません。");
        }

		       scanner.close();
        
        
        
		/*2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する
		配列の すべての要素を表示 */
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < array.length; i++) {          // 行ループ
            for (int j = 0; j < array[i].length; j++) {   // 列ループ
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // 行ごとに改行
        }
        

        
		/*2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
		配列の すべての要素の合計値を表示*/ 
        int[][] array1 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
         };

         int sum1 = 0;

         for (int i = 0; i < array1.length; i++) {
             for (int j = 0; j < array1[i].length; j++) {
                 sum1 += array1[i][j];
             }
         }

            // 結果を表示
         System.out.println("合計値は " + sum1);
        
        
            
		/*2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
		配列内の 最大値と最小値 を求めて表示*/
        int[][] array2 = {
                    {12, 15, 8},
                    {6, 19, 25},
                    {30, 2, 10}
             };

          // 最初の要素で初期化
             int max1 = array2[0][0];
             int min1 = array2[0][0];

                // 2次元配列を走査して最大値・最小値を更新
             for (int i = 0; i < array2.length; i++) {
                 for (int j = 0; j < array2[i].length; j++) {
                     if (array2[i][j] > max) {
                         max = array2[i][j];
                     }
                     if (array2[i][j] < min) {
                         min = array2[i][j];
                     }
                 }
             }

             // 結果を表示
             System.out.println("最大値は " + max1);
             System.out.println("最小値は " + min1);
                
                
          /*3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
          配列内のすべての要素を 表示*/
          int[][][] array3 = {
                  {{1, 2}, {3, 4}},
                  {{5, 6}, {7, 8}}
              };

              for (int i = 0; i < array3.length; i++) {             // 1次元
                  for (int j = 0; j < array3[i].length; j++) {      // 2次元
                   for (int k = 0; k < array3[i][j].length; k++) { // 3次元
                       System.out.print(array3[i][j][k] + " ");
                      }
                      System.out.println(); // 2次元ごとに改行
                        }
               }
   
    }
}