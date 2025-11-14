package curriculum_D;

public abstract class Character {//「Character は設計図。実際に戦うのは Player と Daemon。だから Character は abstract（抽象）にしておく」
	
		protected String name;
	    protected int hp;
	    protected int at;
	    protected int sp;	
	    //protected は「子クラスからは使えるけど、他の場所からは使えない」ようにするもの
	    //name, hp, at, sp は外部から直接は触れない。でも、Character を継承したクラス（Player や Daemon）からは自由に使える
	    
	    
	    
	    /*-----------コンストラクタ-----------*/
	    public Character(String name, int hp, int at, int sp) {
	        this.name = name;//this は「このクラス自身（このオブジェクト）」を指す。
	        this.hp = hp;
	        this.at = at;
	        this.sp = sp;
	    }
	    
	    /*-----------Character クラスの「ゲッター(getter)」と「状態チェックメソッド」-----------*/
	    public String getName() { return name; }//name（名前）フィールドの値を外部から読み取れるようにする。
	    public int getHp() { return hp; }
	    public int getAt() { return at; }
	    public int getSp() { return sp; }

	    public boolean isAlive() {
	        return hp > 0;
	    }

	    public void attack(Character target) {
	        System.out.println(name + "の攻撃！ " + target.getName() + "に" + at + "ダメージ！");
	        target.hp -= at;
	        if (target.hp < 0) target.hp = 0;
	        System.out.println(target.getName() + "の残りHP：" + target.getHp());
	    }

	
}
