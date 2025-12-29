//To practice all data types and basic OOP
package com.transport;
import java.util.*;
public class Inventory {
    public static void main(String args[]){
        Map<Integer,Item> dataHolder = new HashMap<>();
        int serialNumber = 1;
        Scanner newScanner = new Scanner(System.in);

        while (true) {
            System.out.printf("\nEnter more Items of Inventory,now at Item no.%d(y/n):",serialNumber);  
            char choice = newScanner.next().charAt(0);
            if(choice == 'y'){
                System.out.printf("\nEnter the product name: ");
                String product_name = newScanner.next();
                System.out.printf("\nEnter the if Fragile(true/false): ");
                Boolean Fragile = newScanner.nextBoolean();
                System.out.printf("\nEnter the stock amount: ");
                int quantity = newScanner.nextInt();
                System.out.printf("\nEnter the warehouse zone number: ");
                short warehouseZone = newScanner.nextShort();
                System.out.printf("\nEnter the weight: ");
                float weight = newScanner.nextFloat();
                System.out.printf("\nEnter the shipping grade('A','B','C'): ");
                char shippingGrade = newScanner.next().charAt(0);
                System.out.printf("\nEnter the storage temperature: ");
                double temp = newScanner.nextDouble();
                System.out.printf("\nEnter the tracking number: ");
                long trackingNumber = newScanner.nextLong();
                System.out.printf("\nEnter the category: ");
                byte category = newScanner.nextByte();
                Item temp1 = new Item();
                temp1.productName = product_name;
                temp1.isFragile = Fragile;
                temp1.quantity = quantity;
                temp1.warehouseZone = warehouseZone;
                temp1.weight = weight;
                temp1.shippingGrade = shippingGrade;
                temp1.temp = temp;
                temp1.trackingNumber = trackingNumber;
                temp1.Category = category;
                dataHolder.put(serialNumber,temp1);

            }
            else{
                break;
            }
        }
        System.out.println("Welcome to Item Search");
        while(true){    
            System.out.printf("\nWant to Search more items(y/n): ");
            char choice = newScanner.next().charAt(0);
            if(choice == 'y'){
                System.out.printf("\nEnter Item No: ");
                int itemNo = newScanner.nextInt();
                if(!(dataHolder.get(itemNo)==null)){
                    Item temp = dataHolder.get(itemNo);
                    System.out.printf("\nCategory:%d",temp.Category);
                    System.out.printf("\nProduct Name:%s",temp.productName);
                    System.out.printf("\nFragile Status:%s",temp.isFragile?"true":"false");
                    System.out.printf("\nStock:%d",temp.quantity);
                    System.out.printf("\nWarehouse Zone Number:%d",temp.warehouseZone);
                    System.out.printf("\nWeight:%f",temp.weight);
                    System.out.printf("\nShipping Grade:%c",temp.shippingGrade);
                    System.out.printf("\nTracking Number:%d",temp.trackingNumber);
                    System.out.printf("\nStorage Temperature:%f",temp.temp);


                }
                else{
                    System.out.printf("\nItem not found");
                }
            }
            else{
                newScanner.close();
                break;
            }
        }
    }
}
