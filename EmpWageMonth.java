import java.time.Month;
public class EmpWageMonth {
    public static int random(int Empcheck){
        double EmpHous,Emp_rate=20,IsFulltime=2,IsParttime=1,totalWage=0 ,EmpWage;
        for(int day=1; day<=30; day++){
            switch (Empcheck){
                case 2:
                    EmpHous=8;
                    break;
                case 1:
                    EmpHous=4;
                    break;
                default:
                    EmpHous=0;
            }
            EmpWage=Emp_rate*EmpHous;
            totalWage = totalWage+EmpWage;
            System.out.println("EmpWage_ Par Day: "+EmpWage);
        }
        System.out.println("..............");
        System.out.println("TotalEmpWage_per_Month:"+totalWage);
        return Empcheck;
    }
    public static void main(String[] args) {
        EmpWageMonth n =new EmpWageMonth();
        int check = (int) Math.floor(Math.random()*10)%3;
        EmpWageMonth.random(check);
    }
}
