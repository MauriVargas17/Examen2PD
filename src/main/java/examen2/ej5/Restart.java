package examen2.ej5;

import java.util.Random;

public class Restart implements IState{

    @Override
    public void resManager(PC pc) throws InterruptedException {
        System.out.println("PC is now restarting");
        System.out.println("Closing all apps");
        if (pc.getOpenApps().length == 0){
            System.out.println("No apps to close");
        } else {
            for (String s: pc.getOpenApps()){
                Thread.sleep(new Random().nextInt(3000));
                System.out.println(s+" was closed successfully");
                pc.setCpuConsumption(pc.getCpuConsumption() - 5);
                pc.setRamConsumption(pc.getRamConsumption() - 5);
            }
        }
        pc.setOpenApps(new String[]{});
        pc.setCpuConsumption(0);
        pc.setRamConsumption(0);
        pc.showStatus();
    }
}
