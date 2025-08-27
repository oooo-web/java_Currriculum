package curriculum_B;

public class Main {
    public static void main(String[] args) {
        // Greeting クラスのインスタンスを生成
        Greeting greeting = new Greeting();
        greeting.sayHello();

        // Animal クラスのインスタンスを生成
        Animal lion = new Animal();

        // setterを使って値を設定
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // getterを使って出力
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
