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
        System.out.println();
        // Повышенная сложность.
        // Задание 1.
        System.out.println(" ");
        getIndexSalary();
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2. a.
        int departmentNumber = 2;
        System.out.println("Сотрудник с минимальной зарплатой в отделе № "+ departmentNumber +" - " + getMinDepartmentSalary(2));
        System.out.println(" ");
        // Задание 2. b.
        System.out.println("Сотрудник с максимальной зарплатой в отделе № "+ departmentNumber +" - " + getMaxDepartmentSalary(2));
        System.out.println(" ");
        // Задание 2. c.
        System.out.printf("Сумма затрат на зарплаты в месяц: в отделе № " + departmentNumber + " - %.2f рублей.", getSumSalaryDepartmentPerMonth(departmentNumber));
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2. d.
        System.out.printf("Среднее значение зарплат: в отделе № " + departmentNumber +" - %.2f рублей.", getAverageSalaryDepartment(departmentNumber));
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2. e.
        getIndexSalaryDepartment(departmentNumber);
        System.out.println(" ");
        System.out.println(" ");
        // Задание 2. f.
        getAllEmployeesDepartment(departmentNumber);
        System.out.println(" ");
        // Задание 3 a.
        double EmployeesSalary = 20000.00d;
        getAllEmployeesSalaryMin(EmployeesSalary);
        System.out.println(" ");
        // Задание 3 b.
        getAllEmployeesSalaryMax(EmployeesSalary);
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

    //Повышенная сложность. Индексация зарплаты.
    public static void getIndexSalary() {
        int arg = 10;
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * arg / 100);
                System.out.println("id" + " " + employee.getId()
                        + " " + employee.getFullName() + " "
                        + "Проиндексированная зарплата: " + " " + employee.getSalary());
            }
        }
    }

    //Повышенная сложность.Сотрудник с минимальной зарплатой.
    public static Employee getMinDepartmentSalary(int departmentNumber) {
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
            if (employees[i].getSalary() < min && employees[i].getDepartment() == departmentNumber) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        return minSalary;
    }
    //Повышенная сложность.Сотрудник с максимальной зарплатой.
    public static Employee getMaxDepartmentSalary(int departmentNumber) {
        double max = 0;
        int index = 0;
        Employee maxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
                index = i;
                break;
            }
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max && employees[i].getDepartment() == departmentNumber) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }
    //Повышенная сложность.Сумма затрат на зарплату по отделу.
    public static double getSumSalaryDepartmentPerMonth(int departmentNumber) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getDepartment() == departmentNumber) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }
    //Повышенная сложность. Средняя зарплата по отделу.
    public static double getAverageSalaryDepartment(int departmentNumber) {
        double sum = 0;
        int countEmp = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getDepartment() == departmentNumber) {
                countEmp++;
                sum += employees[i].getSalary();
            }
        }
        return sum / countEmp;
    }
    //Повышенная сложность.Индексация зарплаты.
    public static void getIndexSalaryDepartment(int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == departmentNumber) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * departmentNumber / 100);
                System.out.printf("%.2f  ", employee.getSalary());
            }
        }
    }
    //Повышенная сложность.Все сотрудники отдела.
    public static void getAllEmployeesDepartment(int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == departmentNumber) {
                System.out.println("Информация о сотруднике: (Уникальный идентификатор = " + employee.getId() + ", " + employee.getFullName() + ", З/П в месяц: " + employee.getSalary() + ')');
            }
        }
    }
    //Повышенная сложность.Сотрудники с зарплатой меньше числа
    public static void getAllEmployeesSalaryMin(double EmployeesSalary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < EmployeesSalary) {
                System.out.println("Информация о сотруднике: (Уникальный идентификатор = " + employee.getId() + ", " + employee.getFullName() + ", З/П в месяц: " + employee.getSalary() + ')');
            }
        }
    }
    //Повышенная сложность.Сотрудники с зарплатой больше числа
    public static void getAllEmployeesSalaryMax(double EmployeesSalary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= EmployeesSalary) {
                System.out.println("Информация о сотруднике: (Уникальный идентификатор = " + employee.getId() + ", " + employee.getFullName() + ", З/П в месяц: " + employee.getSalary() + ')');
            }
        }
    }
}





