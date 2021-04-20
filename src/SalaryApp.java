public class SalaryApp {
    public static void main(String[] args) {
        Employees employees = new Employees();

        employees.addFullTimeEmployee("Jan", "Kowalski", 5000);
        employees.addPartTimeEmployee("Anna", "Borowska", 40, 20);


        System.out.println(employees.getEmployeesInfo());
        System.out.println("Suma miesięcznych wynagrodzeń: " + employees.totalMonthPayments());
        System.out.println("Suma rocznych wynagrodzeń: " + employees.totalYearPayments());
    }
}
