import java.util.Scanner;
import java.util.ArrayList;

class Main{

    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<String> taskList = new ArrayList<>();
    
    static void main(){

        System.out.println();
        System.out.println("---------------Sakura---------------");
        System.out.println("----What can I do for you today?----");
        System.out.println("------------------------------------");
        System.out.println();

        while (true){
            
            // To-do: Make a method for menu display
            System.out.println("--------------Menu------------------");
            System.out.println("Type 1 to add tasks.");
            System.out.println("Type 2 to show tasks.");       
            System.out.println("Type any other number to end the program.");
            
            // To-do: exception handling
            System.out.print("Your answer: ");
            int  input = Integer.parseInt(scan.nextLine());
            System.out.println("------------------------------------");
            System.out.println();

            switch (input){
                case 1:
                    addTasks();
                    break;
                case 2:
                    // To-do: Make task display a method
                    System.out.println("Your tasks are:");
                    for (int i = 0; i < taskList.size(); i++){
                        System.out.println((i+1) + ". " + taskList.get(i));
                    }
                    System.out.println();
                    break;
                default:
                    return;
            }   
        }
    }

    private static void addTasks(){

        boolean addMore = true;
        while (addMore){
            System.out.print("Add task: ");
            taskList.add(scan.nextLine());
            System.out.print("Done! If you want to keep adding, type 'y': ");
            addMore = scan.nextLine().equals("y");
            System.out.println();
        }
    }
}
