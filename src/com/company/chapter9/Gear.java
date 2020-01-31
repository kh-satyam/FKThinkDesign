

public class Gear {

     private  int chain;
     private  int cog ;
    private Wheel wheel;
    private  int rim;
    private  int tire;

     public  Gear(int chain ,int cog ,int rim , int tire)
     {
       //  System.out.println("gear constructer");
         this.chain = chain;
         this.cog =cog;
          wheel = new Wheel(rim,tire);
     }

     public double ratio(){
         //System.out.println("ratio");
         return  chain/cog;
     }

     public double gear_inch()
     {
       //  System.out.println("gear_inch");
       //return  this.ratio()*wheel.diameter() ;
         return this.ratio() *  this.diameter();
     }
     public double diameter()
     {
       //  System.out.println("in Gear Diameter");
         return this.wheel.diameter() ;
     }


}
