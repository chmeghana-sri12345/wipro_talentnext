

public class testemployee {

    public static void main(String[] args) {

        employee emp1 = new employee(1, "Mahesh babu", "babu@gamil.com", "Male", 50000);
        employee emp2 = new employee(2, "Balayya babu", "balayya@gamil.com", "Male", 70000);

        employeedb t = new employeedb();
        t.addemployee(emp1);
        t.addemployee(emp2);

        System.out.println(t.showPaySlip(emp1.getEmpId()));
        System.out.println(t.showPaySlip(emp2.getEmpId()));

        if (t.deleteemployee(3)) { 
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
