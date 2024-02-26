import org.example.DepartmentEmp;
import org.example.Employee;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class DepartmentTest {
    @Test
     public void testSalary() {
        DepartmentEmp departmentEmp = new DepartmentEmp();

        departmentEmp.addEmployee("Gökçe Özgüven","Test Analyst", 6);
        departmentEmp.addEmployee("Hande Demir","Test Team Leader",8);

        Employee[] testDepartment = departmentEmp.getEmployees();

        double calculatedSalary = testDepartment[0].calculateSalary(35);

        double expectedSalary = 20000.0;

        assertEquals(expectedSalary, calculatedSalary);


    }
}
