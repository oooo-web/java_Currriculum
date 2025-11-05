//===========================================
// サブクラス：PartTimeEmployee（パート社員）
//===========================================
public class PartTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1000; // 時給1000円

    public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }

    public int calculateDailyWage(int hoursWorked) {
        return costForDay(hoursWorked);
    }
}
