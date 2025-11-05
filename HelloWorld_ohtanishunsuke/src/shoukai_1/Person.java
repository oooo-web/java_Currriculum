package shoukai_1;

class Person {
	  //インスタンスフィールドを定義   
	  String name;    // 名前
	  int age;        // 年齢
	  double height;  // 身長
	  double weight;  // 問題4

	  //人数を数えるためのクラス変数（問題10用）
	  static int count = 0;

	  //問題2・3・4：コンストラクタを定義
	  Person(String name, int age, double height, double weight) {
	    this.name = name;     // 問題3：インスタンスフィールドに代入
	    this.age = age;
	    this.height = height;
	    this.weight = weight; // 問題4：weightをセット
	    count++;              // 問題10：人数カウント
	  }

	  // 問題6・7 bmiメソッド
	  double bmi() {
	    return this.weight / (this.height * this.height);
	  }

	  //問題8・9・10：printメソッド
	  void print() {
	    System.out.println("名前は" + this.name + "です");                  // 問題9
	    System.out.println("年は" + this.age + "です");
	    System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
	    System.out.println("合計" + count + "人です");                     // 問題10
	  }
	}