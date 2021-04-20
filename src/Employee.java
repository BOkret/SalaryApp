public abstract class Employee {
    public final int NO_OF_MONTHS = 12;
    private String name;
    private String surname;
    private double payment;

    public Employee(String name, String surname, double payment) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;
    }

    abstract double monthPayment();
    abstract double yearPayment();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", wypłata miesięczna: " + monthPayment() + ", wypłata roczna: "
                + yearPayment() + "\n";
    }
}
