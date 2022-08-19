public class EmaDailyAdd {
    public static double random(double Empcheck){
        double EmpHous,Emp_rate=20,IsFulltime=2,IsParttime=1,EmpWage;
        if(Empcheck==IsFulltime){
            EmpHous=16;
            EmpWage= EmpHous*Emp_rate;
            System.out.println("FullTime Wage dAY is: "+ EmpWage);
        } else if (Empcheck==IsParttime) {
            EmpHous=8;
            EmpWage= EmpHous*Emp_rate;
            System.out.println("PartTime Wage per day is: "+ EmpWage);
        }
        else{
            EmpHous=0;
            EmpWage= EmpHous*Emp_rate;
            System.out.println("Absent is: "+ EmpWage);
        }
        return Empcheck;
    }
    public static void main(String[] args) {
         EmaDailyAdd n = new EmaDailyAdd();
         double check = Math.floor(Math.random()*10)%3;
         EmaDailyAdd.random(check);
    }
}
