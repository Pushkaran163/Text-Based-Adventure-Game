import java.util.ArrayList;
import java.util.HashMap;

public class Room{
    private String description;
    private ArrayList<String> items;
    private HashMap<String, Room> exits;

    public Room(String description){
        this.description = description;
        items = new ArrayList<>();
        exits = new HashMap<>();
    }

    public String getDescription(){
        return description;
    }
    public void addItem(String item){
        items.add(item);
    }

    public String removeItem(String item){
        if(items.remove(item)){
            return item;
        }else{
            return null;
        }
    }

    public ArrayList<String> getItems(){
        return items;
    }

    public void setExits(String direction, Room room){
        exits.put(direction, room);
    }
    public Room getExit(String direction){
        return exits.get(direction);
    }
}