public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double overtime;
        double regular;
        if (hoursWorked > 40) {
            overtime = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            hoursWorked = 40;
            regular = hoursWorked * hourlyPayRate;
            return overtime + regular;
        } else {
            regular = hoursWorked * hourlyPayRate;
            return regular;
        }
    }
    public String displayWeeklyPay(double hoursWorked) {
        double regularHours;
        double overtimeHours;
        double regularPay;
        double overtimePay;
        double totalPay;

        if (hoursWorked > 40) {
            regularHours = 40;
            overtimeHours = hoursWorked - 40;
        } else {
            regularHours = hoursWorked;
            overtimeHours = 0;
        }
        regularPay = regularHours * hourlyPayRate;
        overtimePay = overtimeHours + (hourlyPayRate * 1.5);
        totalPay = regularPay + overtimePay;

        return String.format("Regular Hours - %.2f Regular Pay - %.2f Overtime Hours - %.2f Overtime Pay - %.2f Total Pay - %.2f", regularHours, regularPay, overtimeHours, overtimeHours, totalPay);
    }
}
