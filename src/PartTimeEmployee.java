public class PartTimeEmployee extends Employee {
    private double workHoursPerMonth;

    public PartTimeEmployee(String name, String surname, double payment, double workHoursPerMonth) {
        super(name, surname, payment);
        this.workHoursPerMonth = workHoursPerMonth;
    }

    public double getWorkHoursPerMonth() {
        return workHoursPerMonth;
    }

    public void setWorkHoursPerMonth(double workHoursPerMonth) {
        this.workHoursPerMonth = workHoursPerMonth;
    }

    @Override
    double monthPayment() {
        return workHoursPerMonth * getPayment();
    }

    @Override
    double yearPayment() {
        return monthPayment() * NO_OF_MONTHS;
    }
}
