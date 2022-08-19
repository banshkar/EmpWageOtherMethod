public class EmpWageMax {
    public static int random(int Empcheck){
        int EmpHous,Emp_rate=200,IsFulltime=2,IsParttime=1,totalWage;
        int totalHouse=0,totalwarkingday=0,Emp_max_Hours=100,Emp_working_day=20;
        while (totalHouse<=Emp_max_Hours && totalwarkingday<Emp_working_day){
            totalwarkingday++;
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
            totalHouse+=EmpHous;
            System.out.println("day :"+ totalwarkingday+" " +"totalhouse: "+totalHouse);
        }
        totalWage =totalHouse*Emp_rate;
          System.out.println("total EmpWage:" +totalWage);
         return Empcheck;
    }
    public static void main(String[] args) {
         EmpWageMax n = new EmpWageMax();
        int check = (int) Math.floor(Math.random()*10)%3;
        EmpWageMax.random(check);
    }
}
