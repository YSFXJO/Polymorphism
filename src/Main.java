public class Main {
    public static void main(String[] args) throws Exception {
        Embloyee e1 = new Embloyee("Yousef", "Makkah","IT","fwofj@gmai;.com",1000.00);
        System.out.println("\nyour salary is "+ e1.getSalary());
        e1 = new Salary(200.0,"Yousef", "Makkah","IT","fwofj@gmai;.com",1000.00);
        System.out.println("\nyour salary plus the bonus is "+ e1.getSalary());
        e1 = new DailyEmb("Yousef", "Makkah","IT","fwofj@gmai;.com",1000.00,20,15);
        System.out.println("\nYour salary in daily price is "+ e1.getSalary());
        e1 = new HourlyEmb("Yousef", "Makkah","IT","fwofj@gmai;.com",1000.00,5,3);
        System.out.println("\nYour salary in hourly price is "+ e1.getSalary());
    }
        
}
