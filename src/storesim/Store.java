package storesim;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){    
    this.name = name;
    this.earnings = 0;
    itemList = new ArrayList<Item>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  
  public double getEarnings(){
    return earnings;
  }
  
  public void sellItem(int index){
    if (index < itemList.size()) { // Check if store sells index (if it is within the itemList size)
       Item currentItem = itemList.get(index);
       String name = currentItem.getName();
       double price = currentItem.getCost();
       
       // Add cost of item to store's earnings
       this.earnings += price;
       System.out.println(name + " was sold by " + this.name + " for $" + price + "!"); // Print action
    } else {
       System.out.println(this.name + " does not sell that item!");
    }
  }
  
  public void sellItem(String name){
    boolean isSelling = false; 
    
    for (int i = 0; i < itemList.size(); i++) { // Loop over all of the items in itemList
        Item currentItem = itemList.get(i);
        if (currentItem.getName().equals(name)) { // If a name in itemList matches
            double price = currentItem.getCost();
            
            this.earnings += price;
            System.out.println(name + " was sold by " + this.name + " for $" + price + "!"); // Print action
            isSelling = true;
        }
    }
    
    if (!isSelling) {
        System.out.println(this.name + " does not sell " + name + "!");
    }
  }
  
  public void sellItem(Item i){    
    String name = i.getName();
    
    if (itemList.contains(i)) { // If item exists in store
        Item currentItem = itemList.get(itemList.indexOf(i));
        double price = currentItem.getCost();
        
        this.earnings += price; // Add cost to earnings
        System.out.println(name + " was sold by " + this.name + " for $" + price + "!"); // Print action
    } else {
        System.out.println(this.name + " does not sell " + name + "!");
    }
  }
  
  public void addItem(Item i){
    itemList.add(i);
  }
  
  public void filterType(String type){
    String output = "";
    
    output += "The " + type + " items at " + this.name + ":";
    output += "\n";
    
    for (int i = 0; i < itemList.size(); i++) { // Loop through all items in itemList
        Item currentItem = itemList.get(i);
        
        if (currentItem.getType().equals(type)) { // If type matches
            output += currentItem.getName();      // Add item name to output
            output += "\n";
        }
    }
    
    System.out.println(output); // Print all of output
  }
  
  public void filterCheap(double maxCost){
    
    String output = "";
    
    output += "Items lower than $" + maxCost + " at " + this.name + ":";
    output += "\n";
    
    for (int i = 0; i < itemList.size(); i++) { // Loop through all of items in itemList
        Item currentItem = itemList.get(i);
        
        if (currentItem.getCost() <= maxCost) { // If item is cheaper than maxCost
            output += currentItem.getName();    // Add item name to output
            output += "\n";
        }
    }
    
    System.out.println(output); // Print all of output
  }
  
  public void filterExpensive(double minCost){
    String output = "";
    
    output += "Items higher than $" + minCost + " at " + this.name + ":";
    output += "\n";
    
    for (int i = 0; i < itemList.size(); i++) { // Loop through all of items in itemList
        Item currentItem = itemList.get(i);
        
        if (currentItem.getCost() >= minCost) { // If item is more expensive than minCost
            output += currentItem.getName();    // Add item name to output
            output += "\n";
        }
    }
    
    System.out.println(output); // Print all of output
  }
  
  public static void printStats(){    
    System.out.println("-------------------------------");
    System.out.println("Earnings of all of the stores:");
    
    for (int i = 0; i < storeList.size(); i++) { // Loop through entire item list and print the name and earnings
        System.out.println(storeList.get(i).getName() + ": $" + storeList.get(i).earnings);
    }
    System.out.println("-------------------------------");
  }
}
