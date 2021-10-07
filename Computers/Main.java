import components.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //public static void main(String[] args){
        //Computer[] computers = new Computer[6];
        //computers[0] = new Desktop("popular maker", "cool model", new Cpu("good maker",1,1.1), new Ram("gm", 16, 1.1), new Disk("gm","cool hdd", 1), new VideoCard("gm",1));
        //computers[1] = new Laptop("popular maker", "new model",new Cpu("gm",1,1.1), new Ram("gm", 16, 1.1), new Disk("gm","cool hdd", 1), new Monitor("gm", "cool display"), new Keyboard("gm","cool keyboard"));
        //computers[2] = new Monoblock("popular maker", "awesome model",new Cpu("gm",1,1.1), new Ram("gm", 16, 1.1), new Disk("gm","cool hdd", 1), new Monitor("gm","cool monitor"));
        //computers[3] = new Netbook("popular maker", "best model", new Cpu("gm",1,1.1), new Ram("gm", 16, 1.1), new Disk("gm","cool hdd", 1), new Monitor("gm","cool display"), new Keyboard("gm","cool keyboard"));
        //computers[4] = new Nettop("popular maker", "bad model", new Cpu("gm",1,1.1), new Ram("gm", 16, 1.1), new Disk("gm","cool hdd", 1));
        //computers[5] = new Server("popular maker", "general model",new Cpu("gm",1,1.1), new Ram("gm", 16, 1.1), new Disk("gm","cool hdd", 1));
        //for(Computer computer: computers){
            //System.out.println(computer.turnOn());
            //System.out.println(computer.connect());
            //System.out.println(computer.turnOff());
        //}
   // }
    public static void main(String[] args) throws FileNotFoundException {
        List<String> lines = new ArrayList<String>();
        Scanner s = new Scanner(new File("Computers.txt"));
        while (s.hasNextLine()){
            lines.add(s.nextLine());
        }
        Computer[] computers = new Computer[6];
        String[][] compSplited = new String[6][16];
        for (int i = 0; i <= 5; i++){
            compSplited[i] = lines.get(i).split(",");
            Cpu cpu = new Cpu(compSplited[i][3], Integer.parseInt(compSplited[i][4]), Double.parseDouble(compSplited[i][5]));
            Ram ram = new Ram(compSplited[i][6], Integer.parseInt(compSplited[i][7]), Double.parseDouble(compSplited[i][8]));
            Disk disk = new Disk(compSplited[i][9], compSplited[i][10], Integer.parseInt(compSplited[i][11]));
            if (compSplited[i][0].equals("Desktop")){
                VideoCard card = new VideoCard(compSplited[i][12], Integer.parseInt(compSplited[i][13]));
                computers[i] = new Desktop(compSplited[i][1], compSplited[i][2], cpu, ram, disk, card);
            }
            if (compSplited[i][0].equals("Laptop")){
                Monitor monitor = new Monitor(compSplited[i][12], compSplited[i][13]);
                Keyboard keyboard = new Keyboard(compSplited[i][14], compSplited[i][15]);
                computers[i] = new Laptop(compSplited[i][1], compSplited[i][2], cpu, ram, disk, monitor, keyboard);
            }
            if (compSplited[i][0].equals("Netbook")){
                Monitor monitor = new Monitor(compSplited[i][12], compSplited[i][13]);
                Keyboard keyboard = new Keyboard(compSplited[i][14], compSplited[i][15]);
                computers[i] = new Netbook(compSplited[i][1], compSplited[i][2], cpu, ram, disk, monitor, keyboard);
            }
            if (compSplited[i][0].equals("Monoblock")){
                Monitor monitor = new Monitor(compSplited[i][12], compSplited[i][13]);
                computers[i] = new Monoblock(compSplited[i][1], compSplited[i][2], cpu, ram, disk, monitor);
            }
            if (compSplited[i][0].equals("Nettop")){
                computers[i] = new Nettop(compSplited[i][1], compSplited[i][2], cpu, ram, disk);
            }
            if (compSplited[i][0].equals("Server")){
                computers[i] = new Server(compSplited[i][1], compSplited[i][2], cpu, ram, disk);
            }
        }
        for(Computer computer: computers) {
            System.out.println(computer.turnOn());
            System.out.println(computer.connect());
            System.out.println(computer.turnOff());
        }
    }
}
