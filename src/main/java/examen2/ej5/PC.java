package examen2.ej5;

public class PC {
    private IState state;
    private String[] openApps = new String[]{};
    private int ramConsumption;
    private int cpuConsumption;

    public String[] getOpenApps() {
        return openApps;
    }

    public void resManager() throws InterruptedException {
        state.resManager(this);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void showStatus(){
        System.out.println("---Status of PC---");
        System.out.println("RAM Consumption: "+ramConsumption);
        System.out.println("CPU Consumption: "+cpuConsumption);
        System.out.println("Apps opened:");
        if (openApps.length == 0){
            System.out.println("No apps opened");
        } else {
            for (int i = 0; i < openApps.length; i++){
                if (openApps[i] != null){
                    System.out.println(openApps[i]);
                }

            }
        }

    }

    public void setOpenApps(String[] openApps) {
        this.openApps = openApps;
    }

    public int getRamConsumption() {
        return ramConsumption;
    }

    public void setRamConsumption(int ramConsumption) {
        this.ramConsumption = ramConsumption;
    }

    public int getCpuConsumption() {
        return cpuConsumption;
    }

    public void setCpuConsumption(int cpuConsumption) {
        this.cpuConsumption = cpuConsumption;
    }
}
