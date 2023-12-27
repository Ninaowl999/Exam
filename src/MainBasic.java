public class MainBasic {
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

        all();
        System.out.println();
        System.out.println("Сумму затрат на зарплаты в месяц: " + getSumSalary());
        System.out.println();
        System.out.println("Cотрудник с минимальной зарплатой: " + getMinSalary());
        System.out.println();
        System.out.println("Cотрудник с максимальной зарплатой: " + getMaxSalary());
        System.out.println();
        System.out.println("Среднее значение зарплат: " + getAverageSalary());
        System.out.println();
        aVoid();
    }

    private static void all() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static double getSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary() {
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
        return minSalary;
    }

    public static Employee getMaxSalary() {
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
        return maxSalary;
    }

    public static double getAverageSalary() {
        double sum = getSumSalary();
        int count = countEmployees();
        return sum / count;
    }

    public static int countEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }

    public static void aVoid() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}




