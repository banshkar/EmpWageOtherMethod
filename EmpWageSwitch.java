public class EmpWageSwitch {

     public static  int random(int Empcheck){
         double EmpHous,Emp_rate=20,IsFulltime=2,IsParttime=1,EmpWage;
         switch (Empcheck){
             case 2:
                 EmpHous=8;
                 System.out.print("EmpWage is FUllTime: ");
                 break;
             case 1:
                 EmpHous=4;
                 System.out.print("EmpWage is PartTime: ");
                 break;
             default:
                 EmpHous=0;
                 System.out.println("absent ");
         }
          EmpWage=Emp_rate*EmpHous;
         System.out.print(EmpWage);
         return Empcheck;
     }
    public static void main(String[] args) {
            EmpWageSwitch w = new EmpWageSwitch();
            int check = (int) Math.floor(Math.random()*10)%3;
            EmpWageSwitch.random(check);
    }
}
