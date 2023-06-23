package dzoop6;

import java.io.File;

public class Program {
   
    public static void main(String[] args) {
        Order order = new Order("Bruce Wayne", "Porche", 5,500000);
        Saver saver = new Saver();
        Loader loader = new Loader();
        //loader.inputFromConsole(order);
        saver.saveToJson(order);
        saver.saveToXML(order);
        saver.saveToTxt(order);
        Order order1 = new Order();
        loader.loadFromJson(new File("/Users/tema/Desktop/фото/ОПП/dzoop6/order111.json"), order1);
        System.out.println(order1);
    }
}