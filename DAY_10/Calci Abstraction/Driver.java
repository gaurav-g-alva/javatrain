


public class Driver {
    public static void main(String[] args) {
        BasicCalci bc = new BasicImp();
        System.out.println("Basic Calci Add : "+bc.add(10, 20));
        System.out.println("Basic Calci Sub : "+bc.sub(10, 20));
        System.out.println("Basic Calci Mul : "+bc.mul(10, 20));

        CalciV1 v1 = new CalciV1Imp();
        System.out.println("\nCalci V1 Power : "+v1.power(10, 2));
        System.out.println("Calci V1 Square : "+v1.square(5));
        System.out.println("Calci V1 Add : "+v1.add(45, 50));
        System.out.println("Calci V1 Sub : "+v1.sub(89, 150));
        System.out.println("Calci V1 Mul : "+v1.mul(45, 50));

        CalciV2 v2 = new CalciV2Imp();
        System.out.println("\nCalci V2 Mod : "+v2.mod(10, 6));
        System.out.println("Calci V2 Add : "+v2.add(62, 50));
        System.out.println("Calci V2 Sub : "+v2.sub(25, 50));
        System.out.println("Calci V2 Mul : "+v2.mul(3, 50));

    }
}
