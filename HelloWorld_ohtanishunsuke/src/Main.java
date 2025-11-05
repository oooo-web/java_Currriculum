import java.util.ArrayList;
import java.util.List;

//===========================================
// メインクラス：Main
// （全体の動作確認）
//===========================================
public class Main {
    public static void main(String[] args) {

        // ① 基礎概念
        Employee emp1 = new FullTimeEmployee("E000", "山田太郎");
        emp1.work();

        // ② クラスとオブジェクト
        Employee emp2 = new PartTimeEmployee("E001", "佐藤太郎");
        emp2.showInfo();

        // ③ カプセル化
        Employee emp3 = new PartTimeEmployee("E002", "田中花子");
        System.out.println("社員ID: " + emp3.getEmployeeId() + ", 名前: " + emp3.getName());

        // ④ 継承
        FullTimeEmployee full = new FullTimeEmployee("F001", "正社員");
        System.out.println(full.getName() + "の給与: " + full.calculateDailyWage(9) + " 円");

        PartTimeEmployee part = new PartTimeEmployee("P001", "パート社員");
        System.out.println(part.getName() + "の給与: " + part.calculateDailyWage(9) + " 円");

        // ⑤ ポリモーフィズム（Employee型リスト）
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("F001", "山田太郎"));
        employees.add(new FullTimeEmployee("F002", "佐藤花子"));
        employees.add(new ContractEmployee("C001", "鈴木次郎"));
        employees.add(new ContractEmployee("C002", "田中一郎"));

        int hoursWorked = 9;
        for (Employee emp : employees) {
        	int salary = emp.costForDay(hoursWorked);
            System.out.println(emp.getName() + "（ID: " + emp.getEmployeeId() + "）の給与: " + salary + " 円");
        }

        // ⑥ インターフェイスと抽象クラス（Billable型リスト）
        List<Billable> billables = new ArrayList<>();
        billables.add(new FullTimeEmployee("B001", "佐藤花子"));
        billables.add(new ContractEmployee("B002", "鈴木一郎"));

        System.out.println("\n=== インターフェイス Billable による出力 ===");
        for (Billable b : billables) {
            System.out.println(b.getClass().getSimpleName() + " の日給: " + b.costForDay(9) + "円");
        }
     // ⑦ SOLID原則（SalaryCalculator利用）
        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println("\n=== SOLID 原則の良い例 ===");
        calculator.printDailySalary(new FullTimeEmployee("S001", "山田太郎"), 9);
        calculator.printDailySalary(new ContractEmployee("S002", "佐藤花子"), 9);
        calculator.printDailySalary(new PartTimeEmployee("S003", "田中一郎"), 9);
    }
}
