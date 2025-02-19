
public class Engine {
    String engineType;
    int topSpeed;

    public Engine(String engineType,int topSpeed){
        this.engineType =engineType;
        this.topSpeed = topSpeed;
    }
    public void engineDetails(){
        System.out.println("Engine type : "+engineType+" topspeed : "+topSpeed+" Kmph");
    }
}
