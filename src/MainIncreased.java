public class MainIncreased {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Гордеев", "Алексей", "Леонидович", 2, 36_789);
        employees[1] = new Employee("Иванов", "Иван", "Иванович", 1, 30_459);
        employees[2] = new Employee("Борисов", "Станислав", "Александрович", 5, 31_469);
        employees[3] = new Employee("Алексеев", "Артём", "Александрович", 4, 33_989);
        employees[4] = new Employee("Исаев", "Игорь", "Леонардович", 3, 39_598);
        employees[5] = new Employee("Исаева", "Ирина", "Константиновна", 5, 31_709);
        employees[6] = new Employee("Беляева", "Людмила", "Викторовна", 1, 28_109);
        employees[7] = new Employee("Романова", "Елена", "Анатольевна", 2, 20_543);
        employees[8] = new Employee("Конюхов", "Андрей", "Иванович", 1, 34_192);
        employees[9] = new Employee("Кочубей", "Вячеслав", "Иванович", 5, 40_999);

        IndexOfAll();
        // Отдел, в котором ищем сотрудника с минимальной зарплатой
        getEmployeeWithMinSalary(2);
        // Отдел, в котором ищем сотрудника с максимальной зарплатой
        getEmployeeWithMaxSalary(2);
        // Отдел, в котором ищем сумму затрат на зарплату
        System.out.println("Сумма затрат на зарплату по отделу: " + getSumSalary(2));
        // Отдел, в котором ищем среднюю зарплату
        System.out.println("Средняя зарплата по отделу: " + getAverageSalary(2));
        System.out.println();
        System.out.println("Зарплаты всех сотрудников отдела на процент, который приходит в качестве параметра: ");
        IndexOfAllSpecifiedDepartment(5, 10);
        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела): ");
        aVoid(2);
        System.out.println();
        System.out.println("Вывести всех сотрудников с зарплатой меньше числа: ");
        salaryIsLessThanCertainNumber(31000);
        System.out.println();
        System.out.println("Вывести всех сотрудников с зарплатой с зарплатой больше (или равно) числа: ");
        salaryIsGreaterOrEqualCertainNumber(33000);
    }

    //Задание 1
    public static void IndexOfAll() {
        double index = 5; // Процент индексации зарплаты
        // Проиндексировать зарплату всех сотрудников
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index / 100);
                System.out.println("ФИО - " + employee.getFullName() + " ID: " + employee.getId() + " Зарплата: " + employee.getSalary());
            }
        }
        System.out.println();
    }

    //Задание 2
    // a. Сотрудник с минимальной зарплатой в отделе
    private static void getEmployeeWithMinSalary(int department) {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        if (minSalaryEmployee != null) {
            System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ":");
            System.out.println(minSalaryEmployee);
        } else {
            System.out.println("В отделе " + department + " нет сотрудников.");
        }
    }

    // b. Сотрудник с максимальной зарплатой в отделе
    private static void getEmployeeWithMaxSalary(int department) {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        if (maxSalaryEmployee != null) {
            System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ":");
            System.out.println(maxSalaryEmployee);
        } else {
            System.out.println("В отделе " + department + " нет сотрудников.");
        }
    }

    // c. Сумму затрат на зарплату по отделу
    public static double getSumSalary(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    // d. Средняя зарплата по отделу
    public static double getAverageSalary(int department) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                count++;
            }
        }
        if (count == 0) {
            return 0; // Если нет сотрудников в отделе, вернуть 0
        }
        return sum / count;
    }

    // e. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public static void IndexOfAllSpecifiedDepartment(int department, double index) {
        // Проиндексировать зарплату всех сотрудников указанного отдела
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment() == department) {
                    employee.setSalary(employee.getSalary() + employee.getSalary() * index / 100);
                    System.out.println("ФИО - " + employee.getFullName() + " ID: " + employee.getId() + " Зарплата: " + employee.getSalary());
                }
            }
        System.out.println();
        }

    // f. Напечатать всех сотрудников отдела (все данные, кроме отдела).
    private static void aVoid(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullNameDepartment());
            }
        }
    }

    //Задание 3
    //a. Вывести всех сотрудников с зарплатой меньше числа
    public static void salaryIsLessThanCertainNumber(double number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee.getFullNameDepartment());
            }
        }
    }
    //b. Вывести всех сотрудников с зарплатой с зарплатой больше (или равно) числа
    public static void salaryIsGreaterOrEqualCertainNumber(double number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println(employee.getFullNameDepartment());
            }
        }
    }
}

