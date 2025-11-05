//===========================================
// サブクラス：FullTimeEmployee（正社員）
//===========================================
public class FullTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1250; // 時給1250円

    // コンストラクタ
    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    // Billableインターフェイスのメソッドをオーバーライド
    @Override
    public int costForDay(int hoursWorked) {
        int overtime = Math.max(0, hoursWorked - 8); // 8時間超過分
        int regular = hoursWorked - overtime;
        return (regular * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);
    }

    // 以前の課題との互換（calculateDailyWage）
    public int calculateDailyWage(int hoursWorked) {
        return costForDay(hoursWorked);
    }
}
