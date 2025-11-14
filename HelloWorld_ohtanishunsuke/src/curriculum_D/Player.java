package curriculum_D;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character {

    public Player(String name) {
        super(name, randomStat(70, 100), randomStat(10, 20), randomStat(5, 15));
    }

    private static int randomStat(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static Player createPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("プレイヤー名を入力してください：");
        String name = sc.nextLine();
        Player p = new Player(name);
        
        sc.close(); // 最後に閉じる！
        
        System.out.println("\n【" + name + "のステータス】");
        System.out.println("HP: " + p.getHp());
        System.out.println("AT: " + p.getAt());
        System.out.println("SP: " + p.getSp());
        return p;
        
        
    }
}

