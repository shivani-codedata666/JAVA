public class employee {

        // Private instance variables
        private int employee_id;
        private String employee_name;
        private double employee_salary;


        public employee(int id, String name, double salary) {
            this.employee_id = id;
            this.employee_name = name;
            this.employee_salary = salary;
        }


        public int getEmployeeId() {
            return employee_id;
        }


        public void setemployeeId(int employee_id) {
            this.employee_id = employee_id;
        }


        public String getemployeeName() {
            return employee_name;
        }


        public void setemployeeName(String employee_name) {
            this.employee_name = employee_name;
        }


        public String getemployeeSalary() {
            return String.format("₹%.2f", employee_salary);
        }


        public static void main(String[] args) {

            employee emp = new employee(111, "ISHA", 90000.75);


            System.out.println("ID: " + emp.getEmployeeId());
            System.out.println("Name: " + emp.getemployeeName());
            System.out.println("Salary: " + emp.getemployeeSalary());


            emp.setemployeeId(112);
            emp.setemployeeName("Rahul");


            System.out.println("\nUpdated Details:");
            System.out.println("ID: " + emp.getEmployeeId());
            System.out.println("Name: " + emp.getemployeeName());
            System.out.println("Salary: " + emp.getemployeeSalary());
        }
    }


