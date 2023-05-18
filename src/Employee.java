public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int idCounter = 1;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;  // указывал ранее просто +, разницу с ++ уловил
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }
    public String toString() {
        return "id:"+this.id+" ФИО:"+this.fullName+" департамент:"+this.department+" зарпалата:"+this.salary;
    }
}
