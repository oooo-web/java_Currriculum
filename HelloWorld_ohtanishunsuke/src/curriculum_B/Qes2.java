package curriculum_B;

public class Qes2{
	
	public static void main(String[] args) {
		
		
		/*int 型の変数 score に 75 を代入
		score が 60 以上なら "合格です！" と表示*/
		int score = 75;
		
		if ( score >= 60 ) {
			System.out.println("合格です!");
		}
		
		
		/*int 型の変数 age に 25 を代入
		age が 20 以上 30 以下なら "適正年齢です" と表示
		それ以外の場合は "対象外です" と表示*/
		int age = 25;
		
		if ( age >= 20 && age <= 30 ) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}
		
		
		/*int 型の変数 age に 18 を代入
		age が 20 以上なら "成人です" と表示
		age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
		age が 12 以下なら "子供です" と表示*/
		int age1 = 18;
		if ( age1 >= 20 ) {
		System.out.println("成人です");
		}else if( age1 >= 13 && age1 <=19) {
		System.out.println("ティーンエイジャーです");
        } else if (age1 <= 12) {
        System.out.println("子供です");
        }
		
		
		/*int 型の変数 x, y, z に 30, 15, 50 を代入
		一番大きい数値を判定して表示*/
		int x = 30;
		int y = 15;
		int z = 50;
		
		int max;
		
		if ( x >= y && x >= z ) {
		 max = x;
		} else if ( y >= x && y >= z ) {
		 max = y;
		} else {
		 max = z;
		}
		System.out.println("一番大きい数値は " + max + " です");
			
			
		/*int 型の変数 num を用意
		num の値が 0 より大きければ "正の数です" と表示
		num の値が 0 なら "0 です" と表示
		num の値が 0 より小さければ "負の数です" と表示	*/
		int num = 5; // 任意の値5
			
		if ( num > 0) {
		 System.out.println("正の数です");
		 } else if ( num == 0) {
		 System.out.println("0 です");
		 } else {
		 System.out.println("負の数です");
		 }
		
		
		/*int 型の変数 num を用意
		num が 偶数 なら "偶数です" と表示
		num が 奇数 なら "奇数です" と表示*/
		int num1 = 5; // 任意の値5

		if ( num1 % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		
		
		/*int 型の変数 score に 0 から 100 の数値を代入
		90 以上なら "優"
		70 以上なら "良"
		50 以上なら "可"
		50 未満なら "不可"　を表示*/
		int score2 = 85; // 任意のスコアを代入（例：85）

		if ( score2 >= 90) {
			System.out.println("優");
		} else if ( score2 >= 70) {
			System.out.println("良");
		} else if ( score2 >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		/*入力が null または空文字（""）のときに「入力が無効です」と表示する処理を作成してください*/
		
		 String input = ""; // または null
		 
		 if (input == null || input.isEmpty()) {
			 System.out.println("入力が無効です");
		 } else {
			 System.out.println("入力された値: " + input);
		 }
		 
		 
		 /*int 型の変数 day を用意（1～7 の数値を代入）
			day の値に応じて曜日を表示
			1 → "月曜日"
			2 → "火曜日"
			3 → "水曜日"
			4 → "木曜日"
			5 → "金曜日"
			6 → "土曜日"
			7 → "日曜日"
			それ以外の値なら "無効な入力です" と表示
			※Switch文を使用してください*/
		 int day = 5; // 任意の値５

		 switch (day) {
		 case 1:
			 System.out.println("月曜日");
			 break;
		 case 2:
			 System.out.println("火曜日");
			 break;
		 case 3:
			 System.out.println("水曜日");
			 break;
		 case 4:
			 System.out.println("木曜日");
			 break;
		 case 5:
			 System.out.println("金曜日");
			 break;
		 case 6:
			 System.out.println("土曜日");
			 break;
		 case 7:
			 System.out.println("日曜日");
			 break;
		 default:
			 System.out.println("無効な入力です");	
			}
		 
		 
		/*int 型の変数 month を用意（1～12 の数値を代入）
		month の値に応じて季節を表示
		12, 1, 2 → "冬"
		3, 4, 5 → "春"
		6, 7, 8 → "夏"
		9, 10, 11 → "秋"
		それ以外の値なら "無効な月です" と表示
		※Switch文を使用してください*/
		 int month = 5; // 任意の月5

		 switch (month) {
		 case 12:
		 case 1:
		 case 2:
			 System.out.println("冬");
	    break;
		 case 3:
		 case 4:
		 case 5:
			 System.out.println("春");
			 break;
		 case 6:
		 case 7:
		 case 8:
			 System.out.println("夏");
			 break;
		 case 9:
		 case 10:
		 case 11:
			 System.out.println("秋");
			 break;
		 default:
			 System.out.println("無効な月です");
	        }

		}
}