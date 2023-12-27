public class MainBook {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Гордеев", "Алексей", "Леонидович", 2, 36_789);
        employeeBook.addEmployee("Иванов", "Иван", "Иванович", 1, 30_459);
        employeeBook.addEmployee("Борисов", "Станислав", "Александрович", 5, 31_469);
        employeeBook.addEmployee("Алексеев", "Артём", "Александрович", 4, 33_989);
        employeeBook.addEmployee("Исаев", "Игорь", "Леонардович", 3, 39_598);
        employeeBook.addEmployee("Исаева", "Ирина", "Константиновна", 5, 31_709);
        employeeBook.addEmployee("Беляева", "Людмила", "Викторовна", 1, 28_109);
        employeeBook.addEmployee("Романова", "Елена", "Анатольевна", 2, 20_543);
        employeeBook.addEmployee("Конюхов", "Андрей", "Иванович", 1, 34_192);
        employeeBook.addEmployee("Кочубей", "Вячеслав", "Иванович", 5, 40_999);

        // Пункт a.
        employeeBook.getAllEmployees();
        System.out.println(" ");
        // Пункт b.
        System.out.printf("Сумма затрат на зарплаты в месяц: %.2f рублей.", employeeBook.getSumSalaryPerMonth());
        System.out.println(" ");
        System.out.println(" ");
        // Пункт c.
        System.out.println("Сотрудник с минимальной зарплатой - " + employeeBook.getMinSalary());
        System.out.println(" ");
        // Пункт d.
        System.out.println("Сотрудник с максимальной зарплатой - " + employeeBook.getMaxSalary());
        System.out.println(" ");
        // Пункт e.
        System.out.printf("Среднее значение зарплат: %.2f рублей.", employeeBook.getAverageSalary());
        System.out.println(" ");
        System.out.println(" ");
        // Пункт f.
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
        double EmployeesSalary = 30000.00d;
        employeeBook.getAllEmployeesSalaryMin(EmployeesSalary);
        System.out.println(" ");
        // Задание 3 b.
        employeeBook.getAllEmployeesSalaryMax(EmployeesSalary);
        System.out.println(" ");

        String fioEmployees = "Калинин Марк Архипович";
        employeeBook.getNewSalaryDepartmentEmployee(fioEmployees, EmployeesSalary, departmentNumber);
        System.out.println(" ");
        employeeBook.removeEmployee(4);
        System.out.println(" ");
        employeeBook.getAllEmployeesDepartment();
    }
}


