import java.util.ArrayList;
import java.util.List;

//===========================================
// SOLID 原則の実装例を確認するメインクラス
//===========================================
public class SolidExampleMain {
    public static void main(String[] args) {

        // Billable型でポリモーフィズムを利用
        List<Billable> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("S001", "田中太郎"));
        employees.add(new ContractEmployee("S002", "佐藤花子"));
        employees.add(new PartTimeEmployee("S003", "山本一郎"));

        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println("=== SOLID 原則の良い例 ===");
        for (Billable emp : employees) {
            calculator.printDailySalary(emp, 9);
        }
    }
}