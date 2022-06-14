package examen2.ej5;

import java.util.Random;

public class On implements IState{
    @Override
    public void resManager(PC pc) throws InterruptedException {
        System.out.println("PC is now on");
        System.out.println("-> Opening apps...");
        pc.setOpenApps(new String[new Random().nextInt(20)]);
        System.out.println("LOG> "+pc.getOpenApps().length+" apps are to be opened");
        for(int i = 0; i < pc.getOpenApps().length; i++){
            int time = new Random().nextInt(4000);
            Thread.sleep(time);
            System.out.println("Time elapsed: "+ time+" milliseconds");
            System.out.println("Opening App "+i);
            pc.getOpenApps()[i] = "App "+i;
            if (pc.getCpuConsumption() < 100 && pc.getRamConsumption() < 100){
                pc.setCpuConsumption(pc.getCpuConsumption() + 5);
                pc.setRamConsumption(pc.getRamConsumption() + 5);
            }
            pc.showStatus();
        }
    }
}