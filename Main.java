import java.util.Scanner;
import java.util.ArrayList;

class Main{
    static void main(){

        ArrayList<String> taskList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---------------Sakura---------------");
        System.out.println("----What can I do for you today?----");
        System.out.println("------------------------------------");
        System.out.println("");
        
        System.out.println("Type 1 to add tasks.");       
        System.out.println("Type anything else to finish the program.");

        System.out.print("Your answer: ");
        String input = scan.nextLine();

        // Task creation 
        // To-do: Make this a method
        if (input.equals("1")){
            boolean addMore = true;
            while (addMore){ 
                System.out.println("What is your task?");
                System.out.print("Task: ");
                taskList.add(scan.nextLine());
                System.out.println("");

                System.out.print("Do you want to add more tasks? Type 'y' if you do: ");
                addMore  = scan.nextLine().equals("y");
                System.out.println("");
            }
        } else {
            return;
        }

        // Display
        // To-do: Make this a method
        System.out.println("Your tasks were:");
        for (String task: taskList){
            System.out.println(task);
        }
    }
}
