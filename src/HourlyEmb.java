public class HourlyEmb extends Embloyee{
    private double workhourPrice;
    private int hourRate;
    public double getWorkhourPrice() {
        return workhourPrice;
    }
    public void setWorkhourPrice(double workhourPrice) {
        this.workhourPrice = workhourPrice;
    }
    public int getHourRate() {
        return hourRate;
    }
    public void setHourRate(int hourRate) {
        this.hourRate = hourRate;
    }
    public HourlyEmb(String name, String address, String department, String email, double salary, double workhourPrice,
            int hourRate) {
        super(name, address, department, email, salary);
        this.workhourPrice = workhourPrice;
        this.hourRate = hourRate;
    }
    public double getSalary() {
        return workhourPrice*hourRate;
    }
}