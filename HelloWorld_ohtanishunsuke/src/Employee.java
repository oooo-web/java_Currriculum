//===========================================
// 抽象クラス：Employee
// Billable を実装し、共通処理をまとめる
//===========================================
public abstract class Employee implements Billable {
    protected String employeeId;
    protected String name;

    // コンストラクタ（IDと名前を設定）
    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    // 社員の基本動作
    public void work() {
        System.out.println(name + "は働いています。");
    }

    // 社員情報の表示
    public void showInfo() {
        System.out.println("社員ID: " + employeeId + ", 名前: " + name);
    }

    // カプセル化（getter / setter）
    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
