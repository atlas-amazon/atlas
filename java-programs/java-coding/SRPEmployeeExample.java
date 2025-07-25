public class SRPEmployeeExample {

    static class Employee {
        private String name;
        private String email;
        private double salary;

        public Employee(String name, String email, double salary) {
            this.name = name;
            this.email = email;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public double getSalary() {
            return salary;
        }
    }

    static class EmployeeReportGenerator {
        public void generatePdfReport(Employee employee) {
       
            System.out.println("Generating PDF report for employee: " + employee.getName());
            System.out.println("Salary: $" + employee.getSalary());
            
        }
    }
    static class EmployeeEmailSender {
        public void sendEmail(Employee employee) {
          
            System.out.println("Sending email to: " + employee.getEmail());
           
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Sushma", "MS@example.com", 75000.00);

        EmployeeReportGenerator reportGenerator = new EmployeeReportGenerator();
        EmployeeEmailSender emailSender = new EmployeeEmailSender();

        reportGenerator.generatePdfReport(employee);
        emailSender.sendEmail(employee);
    }
}