package curriculum_C;

import java.util.Random;

public class CPU {
    private int hand;
    private Random rand = new Random();

    public void generateHand() {
        hand = rand.nextInt(3); // 0〜2
    }

    public int getHand() {
        return hand;
    }

    public String getHandName() {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return "不明";
        }
    }

    // CPUの出す手に応じたメッセージ
    public String getMessage() {
        switch (hand) {
            case 0: return "CPUは力強くグーを出した！";
            case 1: return "CPUは素早くチョキを出した！";
            case 2: return "CPUは堂々とパーを出した！";
            default: return "";
        }
    }
}
