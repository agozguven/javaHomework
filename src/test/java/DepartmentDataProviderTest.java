import org.example.DepartmentEmp;
import org.example.Employee;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DepartmentDataProviderTest {
    @DataProvider(name = "employeeData")
    public Object[][] employeeData() {
        return new Object[][] {
                {"Gökçe Özgüven", "Test Analyst", 6, 35, 20000.0},
                {"Hande Demir", "Test Team Leader", 8, 33, 6000.0}
        };
    }

    @Test(dataProvider = "employeeData")
    public void testCalculateSalary(String name, String position, int experience, int workedDays, double expectedSalary) {
        DepartmentEmp departmentEmp = new DepartmentEmp();
        departmentEmp.addEmployee(name, position, experience);
        Employee[] testDepartment = departmentEmp.getEmployees();
        double calculatedSalary = testDepartment[0].calculateSalary(workedDays);
        assertEquals(calculatedSalary, expectedSalary);
    }


}
