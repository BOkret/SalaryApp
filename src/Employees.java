public class Employees {
    private final int MAX_EMPLOYEES_NUMBER = 4;
    private int employeeNumber = 0;

    private Employee[] employees = new Employee[MAX_EMPLOYEES_NUMBER];

    void addFullTimeEmployee(String name, String surname, double payment){
        checkEmployeesNumber();
            employees[employeeNumber] = new FullTimeEmployee(name, surname, payment);
            employeeNumber++;
    }

    void addPartTimeEmployee(String name, String surname, double payment, double workHoursPerMonth){
        checkEmployeesNumber();
            employees[employeeNumber] = new PartTimeEmployee(name, surname, payment, workHoursPerMonth);
            employeeNumber++;
    }

    void checkEmployeesNumber(){
        if(employeeNumber >= MAX_EMPLOYEES_NUMBER)
            throw new MaximumEmployeesNumberException("Osiągnięto limit pracowników");
    }

    public String getEmployeesInfo(){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                builder.append(employees[i]);
            }
        }
        return builder.toString();
    }

    public double totalMonthPayments(){
        double totalMonthSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalMonthSalary += employees[i].monthPayment();
            }
        }
        return totalMonthSalary;
    }

    public double totalYearPayments(){
        return totalMonthPayments() * 12;
    }

}
