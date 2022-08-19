public class EmpWage {
      public static  double random(double Empcheck){
          double idp=1;
          if(Empcheck==idp){
              System.out.println("present");
          }
          else {
              System.out.println("absent");
          }
          return Empcheck;
      }
    public static void main(String[] args) {
       EmpDaily n = new EmpDaily();
       double check = Math.floor(Math.random()*10)%2;
       EmpWage.random(check);
    }
}
