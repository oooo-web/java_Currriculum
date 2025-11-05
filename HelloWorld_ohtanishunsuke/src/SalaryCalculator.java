//===========================================
// S: 単一責任の原則（SRP）
// O: 開放/閉鎖の原則（OCP）
// L: リスコフの置換原則（LSP）
// I: インターフェイス分離の原則（ISP）
// D: 依存関係逆転の原則（DIP）
//===========================================

class SalaryCalculator {

    // D: Employeeの具象型には依存せず、抽象（Billable）に依存
    public void printDailySalary(Billable billable, int hoursWorked) {
        int salary = billable.costForDay(hoursWorked);
        System.out.println(billable.getClass().getSimpleName() + 
                           " の給与は " + salary + " 円です。");
    }
}