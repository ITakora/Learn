package Collections;

public class Main {
    public static void main(String[] args) {
        String[] todoItems = new  String[3];
        todoItems[0] = "Take out the Trash";
        todoItems[1] = "Do the Dishes";
        todoItems[2] = "Prep Dinner";

        for (String item: todoItems) {
            System.out.println(item);
        }
    }
}
