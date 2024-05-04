public class DailyEmb extends Embloyee{
    private double workDayPrice;
    private int dailyRate;
    public double getWorkDayPrice() {
        return workDayPrice;
    }
    public void setWorkDayPrice(double workDayPrice) {
        this.workDayPrice = workDayPrice;
    }
    public int getDailyRate() {
        return dailyRate;
    }
    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
    public DailyEmb(String name, String address, String department, String email, double salary, double workDayPrice,
            int dailyRate) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }
  @Override
    public double getSalary() {
    return workDayPrice*dailyRate;
}
    
}