
public class State {
    String stateName;
    double stateIncome;
    private Cm cm;

    public State(String stateName,double  stateIncome,Cm cm) {
        this.stateName = stateName;
        this.stateIncome = stateIncome;
        this.cm = cm;
    }
    public Cm getcm(){
        return cm;
    }
    public void StateDetails(){
        System.out.println("\nState Name : "+stateName+"\nState Income : " + stateIncome);
        cm.cmDetails();
    }
}
