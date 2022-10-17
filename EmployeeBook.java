public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void addEmployees(Employee employees) {
        for(int i = 0; i < employees.length; i++); {
            if(employees[i]) != null) {
               employees[i] =  employee

            }
        }
    }
    public int findEmployee(String name, String  middleName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                && employees[i].getName().equals(name)
                && employees[i].getMiddleName().equals(middleName)
                && employees[i].getLastName().equals(LastName)) {
              return i;
                }
            }
        return -1;
        }

    public void deleteEmployee(String name, String middlename, String LastName) {
            int index = findEmployee( name, middleName, lastName);
            if (index != -1 ) {
                employees[index] = null;
            }
        }
        public void changeEmployee(String name, String middleName, String lastName, int salary, byte department) {
            int index = findEmployee(name, middleName, lastName);
            if(index != -1) {
                employees[index].setDepartment(department);
                employees[index].setSalary(salary);

            }
        }


    }
}

