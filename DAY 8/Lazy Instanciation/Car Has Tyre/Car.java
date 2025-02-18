public class Car {
    String company;

    Tyre[] tyres = new Tyre[4];
    Car(String company){
        this.company = company;
    }
    int i=0;
    public void attachTyre(String brand){
        tyres[i] = new Tyre(brand);
        i++;
    }
}
