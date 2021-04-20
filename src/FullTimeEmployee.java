public class FullTimeEmployee extends Employee {

    private final double YEARLY_BONUS = 0.05;

    public FullTimeEmployee(String name, String surname, double payment) {
        super(name, surname, payment);
    }

    @Override
    double monthPayment() {
        return getPayment();
    }

    @Override
    double yearPayment() {
        return getPayment() * NO_OF_MONTHS * (1 + YEARLY_BONUS);
    }

}
