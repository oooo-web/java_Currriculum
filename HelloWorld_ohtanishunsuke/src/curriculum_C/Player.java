package curriculum_C;

public class Player {
    private int hand; // 0:グー, 1:チョキ, 2:パー

    public void setHand(int hand) {
        this.hand = hand;
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

    // 手ごとのメッセージ
    public String getMessage() {
        switch (hand) {
            case 0: return "力強くグーを出した！";
            case 1: return "素早くチョキを出した！";
            case 2: return "堂々とパーを出した！";
            default: return "";
        }
    }
}
