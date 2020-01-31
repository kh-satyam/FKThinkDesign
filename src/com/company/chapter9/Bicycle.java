

public class Bicycle {

   private int size,tire_size;
    private String chain;
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTire_size(int tire_size) {
        this.tire_size = tire_size;
    }

    public int getTire_size(){
        throw new UnsupportedOperationException();
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }



    public void spares(){
        tire_size = tire_size;
    }

    public String default_chain(){
        return "10-speed";
    }



}

class RoadBike extends Bicycle{

    String tape_color;

    public int getTire_size(){
        return 23;
    }

}

class MountainBike extends Bicycle{

    String front_shock,rear_shock;

     public int getTire_size(){
        return 21;
    }

}