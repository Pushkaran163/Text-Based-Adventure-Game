import java.util.HashMap;

public class AdventureModel{
    private Room currentRoom;
    private HashMap<String, Room> rooms;

    public AdventureModel(){
        rooms = new HashMap<>();
        initializeRooms();
        setCurrentRoom("hall");
    }

    private void initializeRooms(){
        Room hall = new Room("You are in a grand hall. There are doors to the north and east.");
        Room kitchen = new Room("You are in a kitchen. There are doors to the south and west.");
        Room library = new Room("You are in a library. There is a door to the west.");

        hall.setExits("north",kitchen);
        hall.setExits("east", library);
        kitchen.setExits("south", hall);
        kitchen.setExits("west", library);
        library.setExits("west", hall);

        rooms.put("hall", hall);
        rooms.put("kitchen", kitchen);
        rooms.put("library", library);
    }

    public void setCurrentRoom(String roomName){
        currentRoom = rooms.get(roomName);
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public void movePlayer(String direction){
        Room nextRoom = currentRoom.getExit(direction);
        if(nextRoom != null){
            currentRoom = nextRoom;
        }else{
            System.out.println("You can't go that way.");
        }
    }
}