package curriculum_C;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        CPU cpu = new CPU();

        System.out.println("=== じゃんけんゲーム ===");
        System.out.println("グー(0), チョキ(1), パー(2) を入力してください。");

        while (true) {
            System.out.print("入力: ");
            int input = scanner.nextInt();

            if (input < 0 || input > 2) {
                System.out.println("0〜2の数字を入力してください。");
                continue;
            }

            // プレイヤーとCPUの手をセット
            player.setHand(input);
            cpu.generateHand();

            // 手とメッセージ出力
            System.out.println(player.getMessage());
            System.out.println(cpu.getMessage());
            System.out.println("あなたの手: " + player.getHandName());
            System.out.println("CPUの手: " + cpu.getHandName());

            // 勝敗判定
            int result = (player.getHand() - cpu.getHand() + 3) % 3;

            if (result == 0) {
                System.out.println("あいこです。もう一度！");
            } else if (result == 1) {
                System.out.println("あなたの負け…再挑戦！");
            } else {
                System.out.println("あなたの勝ち！");
                break;
            }
            System.out.println();
        }

        System.out.println("ゲーム終了。お疲れさまでした！");
        scanner.close();
    }
}


