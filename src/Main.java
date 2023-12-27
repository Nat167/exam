public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иван", "Иванов", "Иванович", 1, 10000);
        employees[1] = new Employee("Тихон", "Петров", "Аркадьевич", 2, 11000);
        employees[2] = new Employee("Аркадий", "Левин", "Иванович", 3, 12000);
        employees[3] = new Employee("Лев", "Васильев", "Васильевич", 4, 13000);
        employees[4] = new Employee("Антон", "Иванович", "Носов", 5, 14000);
        employees[5] = new Employee("Дмитрий", "Дмитриев", "Дмитриевич", 5, 15000);
        employees[6] = new Employee("Мария", "Иванова", "Ивановна", 4, 16000);
        employees[7] = new Employee("Елена", "Андреева", "Андреевна", 3, 20000);
        employees[8] = new Employee("Татьяна", "Сидорова", "Сидоровна", 2, 25000);
        employees[9] = new Employee("Олег", "Олегов", "Олегович", 1, 26000);

        getAllEmployees();
        System.out.println();
        allSalaryInMonth();
        System.out.println();
        getMinimumSalary();
        System.out.println();
        getMaximumSalary();
        System.out.println();
        averageSalary();
        System.out.println();
        getNameOfAllEmployees();
        System.out.println();
        getFullName();

    }


    public static void getAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static int allSalaryInMonth() {
        int summ = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            summ += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц: " + summ);
        return summ;
    }

    public static Employee getMinimumSalary() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }

        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой : " + minSalary);
        return minSalary;

    }

    public static Employee getMaximumSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }

        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой : " + maxSalary);
        return maxSalary;

    }

    public static void averageSalary() {
        double summ = 0;
        for (Employee employee : employees) {
            summ += employee.getSalary();
        }
        double averageSalary = summ/10;
        System.out.println("Средняя зарплата сотрудников : " + averageSalary);
    }


    public static void getNameOfAllEmployees(){
        for (Employee employee:employees) {
            System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getPatronymic());

        }
    }



    public static void getFullName() {
        for (Employee employee: employees) {
            System.out.println(employee.getFullName());
       }
    }
}



