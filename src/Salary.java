public class Salary extends Embloyee{
private double bonus;

public double getbonus() {
    return bonus;
}

public void setbonus(double bonus) {
    this.bonus = bonus;
}
@Override
public double getSalary() {
    return super.getSalary()+bonus;
}

public Salary(double bonus,String name, String address, String department, String email, double salary) {
    super(name, address, department, email, salary);
    this.bonus = bonus;
 
}

}