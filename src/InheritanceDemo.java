import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("000001", "Bilbo", "Baggins", "Mr.", 1980, 15.00));
        workers.add(new Worker("000002", "Frodo", "Baggins", "Mr.", 1990, 17.50));
        workers.add(new Worker("000003", "Souriya", "Phet", "Mr.", 2003, 20.00));
        workers.add(new SalaryWorker("100001", "Samwise", "Gamgee", "Mr.", 1986, 13.25, 38000));
        workers.add(new SalaryWorker("100002", "Peregrin", "Took", "Mr.", 1965, 22.25, 40000));
        workers.add(new SalaryWorker("100003", "Meridoc", "Brandybuck", "Mrs.", 1950, 20.15, 50000));

        String titleName = "Name";
        String titleWeek = "Week 1";
        String titleWeek2 = "Week 2";
        String titleWeek3 = "Week 3";

        System.out.println();
        System.out.println("Weekly pay per worker");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.printf("%-20s%-15s%-15s%-15s", titleName, titleWeek, titleWeek2, titleWeek3);
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        for (Worker w :workers) {
            System.out.printf("\n%-20s%-15.2f%-15.2f%-15.2f", w.getFullName(), w.calculateWeeklyPay(40), w.calculateWeeklyPay(50), w.calculateWeeklyPay(40));
        }
    }
}
