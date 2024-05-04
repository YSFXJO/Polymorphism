public class Embloyee{
    private String name, address, department, email;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Embloyee(String name, String address, String department, String email, double salary) {
        this.name = name;
        this.address = address;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }
    
}