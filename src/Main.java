public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Смирнов Егор Петрович", 2, 73633);
        employees[1] = new Employee("Петров Павел Павлович", 2, 1103461);
        employees[2] = new Employee("Козлов Александр Николаевич", 1, 94456);
        employees[3] = new Employee("Самушкина Ольга Ивановна", 5, 822334);
        employees[5] = new Employee("Коко Ильф Туземунович", 3, 11382);
        employees[6] = new Employee("Головешкина Снежанна Василевна", 2, 872583);
        employees[9] = new Employee("Махно Нестр Генуэзович", 5, 57346);
        printEmployees();
        System.out.println();
        printSumSalary();
        System.out.println();
        printMinSalary();
        System.out.println();
        printMaxSalary();
        System.out.println();
        printAverageSalary();
        System.out.println();
        printFullNames();

    }

    private static void printEmployees() {
        for (Employee employee : employees) {    //подсмотрел на разборе формат
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void printSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Общая зарплата: " + sum);

    }

    private static void printMinSalary() {
        double min = Double.MAX_VALUE;
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        System.out.println("Работник с минимальной зарплатой: " + employeeMinSalary);

    }
    private static void printMaxSalary() {
        double max = Double.MIN_VALUE;
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        System.out.println("Работник с максимальной зарплатой: " + employeeMaxSalary);

    }
    private static void printAverageSalary() {
        double sum = 0;
        int i = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                i++;
            }
        }
        System.out.println("Средняя зарплата: " + sum/i);

    }
    private static void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}