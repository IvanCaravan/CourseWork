public class Main {

    public static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Бульонов", "Эдуард", "Кондратьевич", 1, 1000000);
        employees[1] = new Employee("Журавлёва", "Оксана", "Игнатьевна", 2, 50000);
        employees[2] = new Employee("Горбушкин", "Семён", "Семёнович", 3, 4000);
        employees[3] = new Employee("Савушкин", "Игорь", "Николаевич", 4, 56000);
        employees[4] = new Employee("Абдулаев", "Геннадий", "Семёнович", 2, 67000);
        employees[5] = new Employee("Колясников", "Владимир", "Романович", 5, 45000);
        employees[6] = new Employee("Кислых", "Семён", "Юрьевич", 5, 45700);
        employees[7] = new Employee("Верещагин", "Максим", "Александрович", 2, 67000);
        employees[8] = new Employee("Авдотьев", "Александр", "Борисович", 6, 58000);
        employees[9] = new Employee("Поликаропов", "Игорь", "Алексеевич", 1, 30000);

        String fullList = getFullList(employees);
        int salary = calculateAllSalaries(employees);
        System.out.println(salary);
        double avgSalary = calculateAverageSalary(employees);
        System.out.println(avgSalary);
        int minSalary = findTheCheapest(employees);
        System.out.println(minSalary);
        int maxSalary = findTheMostExpensive(employees);
        System.out.println(maxSalary);
        String list = getFullNames(employees);
        System.out.println(list);
    }
    public static String getFullList(Employee[] employees) {
        for (Employee i : employees) {
            if (i != null) System.out.println("i = " + i);
        }
        return null;
    }
    public static int calculateAllSalaries(Employee[] employees) {
        int totalSum = 0;
        for (Employee i : employees) {
            if (i != null) totalSum += i.getSalary();
        }
        return totalSum;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalSum = 0;
        int counter = 0;
        for (Employee i : employees) {
            if (i != null) {
                counter++;
                totalSum += i.getSalary();
            }
        }
        return totalSum / counter;
    }

    public static int findTheCheapest(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee i : employees) {
            if (i != null && i.getSalary() < minSalary) {
                minSalary = i.getSalary();
            }
        }
        return minSalary;
    }

    public static int findTheMostExpensive(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee i : employees) {
            if (i != null && i.getSalary() > maxSalary) {
                maxSalary = i.getSalary();
            }
        }
        return maxSalary;
    }

    public static String getFullNames(Employee[] employees) {
        String list = "";
        for (Employee i : employees) {
            if (i != null) {
                list += i.getFullName() + ", ";
            }
        }
        if (!list.isEmpty()) {
            list = list.substring(0, list.length() - 2);
        }
        return list;
    }

}