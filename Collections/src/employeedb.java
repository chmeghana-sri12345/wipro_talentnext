

import java.util.*;

public class employeedb {

    private List<employee> al = new ArrayList<>();

    public boolean addemployee(employee e) {
        al.add(e);
        return true;
    }

    public boolean deleteemployee(int empId) {
        Iterator<employee> iterator = al.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEmpId() == empId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (employee e : al) {
            if (e.getEmpId() == empId) {
                return "The pay slip of the employee with the given empId is: " + e.getSalary();
            }
        }
        return "Employee not found with ID " + empId;
    }
}
