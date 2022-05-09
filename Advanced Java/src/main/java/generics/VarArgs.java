package generics;

public class VarArgs {

    public static void main(String[] args) {
        printList();
        printList("Ham","Eggs");
        printList("Ham", "Eggs", "Cheese", "Butter");
    }

    public static void printList(String... items){
        for (String i : items) {
            System.out.println(i);
        }
    }
}
