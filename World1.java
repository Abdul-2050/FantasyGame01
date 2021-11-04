import java.util.Scanner;
public class World1 {
    static String name;
    static int age;
    static int items;
    World1(String name, int age, int items){
       World1.name = name;
       World1.age = age;
       World1.items = items;
    }

    static Scanner scan = new Scanner(System.in);

    public static void ForestStart(){

        System.out.println();

        String txt = "You are now in the forest. It´s really spooky... I can see a house on the east and I could follow the path on the north. What should I do?";
        String a = scan.nextLine();

        if(a.equals("e")||a.equals("E")){
             System.out.println();
             System.out.println("You have entered the house... It was worth it! I found an Diamond sword!");
             items++;

        }else if(a.equals("n")||a.equals("N")){
            System.out.println();
            System.out.println("You have followed the path and now you have to choose between the path to the city or an unknown path... What should I choose? (city = N, unknown = E)");
            String b = scan.nextLine();

            if(b.equals("n")||b.equals("N")){

                System.out.println("Welcome to the city!");
                new City();
            }else if(b.equals("e")||b.equals("E")){

            }

        }

    }
}
