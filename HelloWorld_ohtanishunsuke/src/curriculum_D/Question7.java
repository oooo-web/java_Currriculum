package curriculum_D;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Player player = Player.createPlayer(sc);//プレイヤーを作る（名前入力＋ステータスランダム
		Daemon daemon = Daemon.loadDaemon("src/curriculum_D/daemon_status.txt");//ファイルから敵のステータスを読み込む
		
		System.out.println("バトル開始");
		battle(player, daemon);
		
		//----------------------再提出修正箇所----------------------//
		
		 sc.close(); // ← 最後に閉じる
		 
		 
		//----------------------再提出修正箇所----------------------//
	}

	
	
	/*この部分は「バトルを始める準備」と「最初のログ出力（戦闘開始の文字）」をしているところです。*/
	public static void battle(Player player,Daemon daemon) {//定義
		Random rand = new Random();//ランダムな数を使うための準備
	    StringBuilder log = new StringBuilder();//バトルの経過を記録する入れ物を準備

	    log.append("=== バトル開始 ===\n");//ログに文字を追加していく
	    log.append(player.getName() + " vs " + daemon.getName() + "\n\n");//「player name vs Daemon」
	    
	    System.out.println(player.getName() + " vs " + daemon.getName() + "\n");//hyouji


	/*------------------------------------------------------------------------------------*/
	
	
    // 先攻決定
    Character attacker, defender;
    if (player.getSp() > daemon.getSp()) {
        attacker = player;
        defender = daemon;
    } else if (player.getSp() < daemon.getSp()) {
        attacker = daemon;
        defender = player;
    } else {
        attacker = rand.nextBoolean() ? player : daemon;
        defender = (attacker == player) ? daemon : player;
    }

    log.append("先攻は " + attacker.getName() + "！\n\n");

    // ターン制バトル
    while (player.isAlive() && daemon.isAlive()) {
        attacker.attack(defender);
        log.append(attacker.getName() + "が攻撃！ " + defender.getName() + "の残りHP：" + defender.getHp() + "\n");

        if (!defender.isAlive()) break;

        // 攻守交代
        Character temp = attacker;
        attacker = defender;
        defender = temp;
    }

    String winner = player.isAlive() ? player.getName() : daemon.getName();
    System.out.println("\n--- バトル終了 ---");
    System.out.println("勝者：" + winner);

    log.append("\n--- バトル終了 ---\n");
    log.append("勝者：" + winner + "\n");
    
    
    // ログを保存
    saveBattleLog(log.toString());
}

public static void saveBattleLog(String log) {
    // --- ログをファイルに保存 ---
    try (PrintWriter pw = new PrintWriter("battle_log.txt")) {
        pw.print(log);
        System.out.println("バトルログを「battle_log.txt」に保存しました。");
    } catch (IOException e) {
        System.out.println("バトルログの保存に失敗しました。");
        e.printStackTrace();
    }
}
}