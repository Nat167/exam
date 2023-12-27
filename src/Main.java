
public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иван", "Иванов", "Иванович", 1, 10000);
        employeeBook.addEmployee("Тихон", "Петров", "Аркадьевич", 2, 11000);
        employeeBook.addEmployee("Аркадий", "Левин", "Иванович", 3, 12000);
        employeeBook.addEmployee("Лев", "Васильев", "Васильевич", 4, 13000);
        employeeBook.addEmployee("Антон", "Иванович", "Носов", 5, 14000);
        employeeBook.addEmployee("Дмитрий", "Дмитриев", "Дмитриевич", 5, 15000);
        employeeBook.addEmployee("Мария", "Иванова", "Ивановна", 4, 16000);
        employeeBook.addEmployee("Елена", "Андреева", "Андреевна", 3, 20000);
        employeeBook.addEmployee("Татьяна", "Сидорова", "Сидоровна", 2, 25000);
        employeeBook.addEmployee("Олег", "Олегов", "Олегович", 1, 26000);

        employeeBook.getAllEmployees();
        System.out.println(" ");
        // Пункт 8. b.
        System.out.printf("Сумма затрат на зарплаты в месяц: %.2f рублей.", employeeBook.getSumSalaryPerMonth());
        System.out.println(" ");
        System.out.println(" ");
        // Пункт 8. c.
        System.out.println("Сотрудник с минимальной зарплатой - " + employeeBook.getMinSalary());
        System.out.println(" ");
        // Пункт 8. d.
        System.out.println("Сотрудник с максимальной зарплатой - " + employeeBook.getMaxSalary());
        System.out.println(" ");
        // Пункт 8. e.
        System.out.printf("Среднее значение зарплат: %.2f рублей.", employeeBook.getAverageSalary());
        System.out.println(" ");
        System.out.println(" ");
        // Пункт 8. f.
        employeeBook.getFioEmployees();

        // Повышенная сложность.
        // Задание 1.
        System.out.println(" ");
        employeeBook.getIndexSalary();
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2. a.
        int departmentNumber = 5;
        System.out.println("Сотрудник с минимальной зарплатой в отделе № " + departmentNumber + " - " + employeeBook.getMinDepartmentSalary(departmentNumber));
        System.out.println(" ");
        // Задание 2. b.
        System.out.println("Сотрудник с максимальной зарплатой в отделе № " + departmentNumber + " - " + employeeBook.getMaxDepartmentSalary(departmentNumber));
        System.out.println(" ");
        // Задание 2. c.
        System.out.printf("Сумма затрат на зарплаты в месяц: в отделе № " + departmentNumber + " - %.2f рублей.", employeeBook.getSumSalaryDepartmentPerMonth(departmentNumber));
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2. d.
        System.out.printf("Среднее значение зарплат: в отделе № " + departmentNumber + " - %.2f рублей.", employeeBook.getAverageSalaryDepartment(departmentNumber));
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2. e.
        int procent = 10;
        employeeBook.getIndexSalaryDepartment(departmentNumber, procent);
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2. f.
        employeeBook.getAllEmployeesDepartment(departmentNumber);
        System.out.println(" ");
        // Задание 3 a.
        double EmployeesSalary = 20000.00d;
        employeeBook.getAllEmployeesSalaryMin(EmployeesSalary);
        System.out.println(" ");
        // Задание 3 b.
        employeeBook.getAllEmployeesSalaryMax(EmployeesSalary);
        System.out.println(" ");
       // employeeBook.addEmployee("Борисов","Борис","Борисович",3,60000);
       // employeeBook.removeEmployee(2);
        String fioEmployees = "Иван Иванов Иванович";
        employeeBook.getNewSalaryDepartmentEmployee(fioEmployees, EmployeesSalary, departmentNumber);
        System.out.println(" ");
        System.out.println(" ");
        employeeBook.removeEmployee(4);
        System.out.println(" ");
        employeeBook.getAllEmployeesDepartment();

    }
}





