
public class Driver {
    public static void main(String[] args) {
        State state = new State("KARNATAKA",10000, new Cm("Siddaramaya", 2));
        System.out.println(state.stateName);
        System.out.println(state.stateIncome);
        System.out.println(state.getcm()); //address
        System.out.println(state.getcm().name); 
        System.out.println(state.getcm().experience); 

        Cm c1 = new Cm("annamalayi", 5);
        c1.cmDetails();

        State s1 = new State("KERALA", 52033, c1);
        s1.StateDetails();

    }
}
