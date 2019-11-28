/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        String entry;
        
        System.out.print("Enter Your brand (Benz or Bmw) : ");
        entry=scanner.next();
        
        if(entry.equalsIgnoreCase("benz")){
            Benz Benz1=new Benz();
            Benz Benz2=new Benz();
            Benz Benz3=new Benz();
            Benz Benz4=new Benz();
            Benz Benz5=new Benz();
            
            ArrayList<Benz> BenzList=new ArrayList<>();

            BenzList.add(Benz1);
            BenzList.add(Benz2);
            BenzList.add(Benz3);
            BenzList.add(Benz4);
            BenzList.add(Benz5);

            for(Benz c:BenzList){
                System.out.print("Enter Model : ");
                c.setModel(scanner.next());
                System.out.print("Enter Speed : ");
                c.setSpeed(scanner.next());
                System.out.print("Enter Acceleration : ");
                c.setAcceleration(scanner.next());
                System.out.print("Enter Price : ");
                c.setPrice(scanner.next());
                System.out.print("\n");
            }
            
            for(Benz c:BenzList){
                System.out.println("Brand : Benz");
                System.out.println("Model : "+c.getModel());
                System.out.println("Speed : "+c.getSpeed());
                System.out.println("Acceleration : "+c.getAcceleration());
                System.out.println("Price : "+c.getPrice());
                System.out.println("");
            }
            
        }else if(entry.equalsIgnoreCase("bmw")){
            Bmw Bmw1=new Bmw();
            Bmw Bmw2=new Bmw();
            Bmw Bmw3=new Bmw();
            Bmw Bmw4=new Bmw();
            Bmw Bmw5=new Bmw();
            
            ArrayList<Bmw> BmwList=new ArrayList<>();
            
            BmwList.add(Bmw1);
            BmwList.add(Bmw2);
            BmwList.add(Bmw3);
            BmwList.add(Bmw4);
            BmwList.add(Bmw5);
            
            for(Bmw c:BmwList){
                System.out.print("Enter Model : ");
                c.setModel(scanner.next());
                System.out.print("Enter Speed : ");
                c.setSpeed(scanner.next());
                System.out.print("Enter Acceleration : ");
                c.setAcceleration(scanner.next());
                System.out.print("Enter Price : ");
                c.setPrice(scanner.next());
                System.out.print("\n");
            }
            
            for(Bmw c:BmwList){
                System.out.println("Brand : Bmw");
                System.out.println("Model : "+c.getModel());
                System.out.println("Speed : "+c.getSpeed());
                System.out.println("Acceleration : "+c.getAcceleration());
                System.out.println("Price : "+c.getPrice());
                System.out.println("");
            }
        }
    }
    
}
