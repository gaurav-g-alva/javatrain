
public class Cpu {
    String systemName;
    int cpuId;

    public Cpu(String systemName,int cpuId){
        this.systemName =systemName;
        this.cpuId = cpuId;
    }
    public void cpuDetails(){
        System.out.println("System Name : "+systemName+"\nCPU ID : "+cpuId);
    }
}
