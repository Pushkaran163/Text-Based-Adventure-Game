import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args){
        AdventureModel model = new AdventureModel();
        Adventurer player = new Adventurer();
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("Welcome to the Text Adventure Game!");

        while (gameRunning){
            System.out.println(model.getCurrentRoom().getDescription());
            System.out.print("> ");
            String input = scanner.nextLine();
            String[] command = input.split(" ");

            switch (command[0].toLowerCase()){
                case "go":
                    if (command.length > 1){
                        model.movePlayer(command[1]);
                    }else{
                        System.out.println("Go where?");
                    }
                    break;
                case "look":
                    System.out.println(model.getCurrentRoom().getDescription());
                    break;
                case "take":
                    if (command.length > 1){
                        player.addItem(model.getCurrentRoom().removeItem(command[1]));
                    }else{
                        System.out.println("Take what?");
                    }
                    break;
                case "drop":
                    if(command.length > 1){
                        model.getCurrentRoom().addItem(player.removeItem(command[1]));
                    }else{
                        System.out.println("Drop what?");
                    }
                    break;
                case "use":
                    if(command.length > 1){
                        System.out.println("You use the " + command[1]);
                    }else{
                        System.out.println("Use what?");
                    }
                    break;
                case "exit":
                    gameRunning = false;
                    System.out.println("Thanks for playing!");
                    break;
                default:
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}