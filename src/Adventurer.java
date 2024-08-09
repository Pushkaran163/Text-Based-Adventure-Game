import java.util.ArrayList;

public class Adventurer{
    private ArrayList<String> inventory;

    public Adventurer(){
        inventory = new ArrayList<>();
    }
    public void addItem(String item){
        if(item != null){
            inventory.add(item);
            System.out.println("You have taken the " + item);
        }else{
            System.out.println("There is nothing to take.");
        }
    }

    public String removeItem(String item){
        if(inventory.remove(item)){
            System.out.println("You have dropped the " + item);
            return item;
        }else{
            System.out.println("You don't have that item.");
            return null;
        }
    }

    public ArrayList<String> getInventory(){
        return inventory;
    }
}