//===========================================
// サブクラス：ContractEmployee（契約社員）
//===========================================
public class ContractEmployee extends Employee {
    private static final int HOURLY_RATE = 1000; // 時給1000円

    public ContractEmployee(String id, String name) {
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
