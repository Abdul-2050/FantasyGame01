import java.util.Scanner;

public class PlayGame {

    static Scanner scan = new Scanner(System.in);
    static int items = 0;

    public static void main(String[] args) {
        printStory();
        PlyOrCancel();
    }

    public static void printStory() {
        String ANSI_GREEN = "\u001B[32m";

        String txt = "A Boy living alone, hears an Goblin shouting: " + " The princess is gone! She got kidnapt by Lord Lucifer \n" + "So he takes his armor and starts his adventure. He gets stronger he starts to beat bosses. \n" + "On the way he gets help from people by helping them. \n" + "After he saves the princess he gets alot of honor and marriers her. ";
        try {
           for(int a=0;a<=txt.length()-1;a++){
               System.out.print(ANSI_GREEN + txt.charAt(a));
               Thread.sleep(30);
           }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
    public static void PlyOrCancel(){

        System.out.println();
        System.out.println();
        System.out.print("PLAY or CANCEL");
        System.out.println();
        System.out.println("Enter P for Play and C for Cancel");
        String chose = scan.nextLine();

        if(chose.equals("p") || chose.equals("P")){
            start();
        }else if (chose.equals("c") || chose.equals("C")){
            System.out.println("You have left the game ");
            exit();
        }else{
            System.out.println("You have entered the wrong letter...");
            PlyOrCancel();
        }
    }
    public static void exit(){
        System.exit(0);
    }
    public static void start() {
        // These variables are for the authentication
        String name;
        int age;


        // input
        System.out.println();
        System.out.println("Enter your name ");
        name = scan.nextLine();
        System.out.println("Enter your age ");
        age = scan.nextInt();
        System.out.println();
        //System.out.println("So your name is: " + name + " and you are "+ age +  " old ? ");
        System.out.println();
        try {
            String txt= "Hello " + name + " Welcome to our game!";
            for (int a=0;a<=txt.length()-1;a++){
                System.out.print(txt.charAt(a));
                Thread.sleep(50);
            }
        }catch (InterruptedException ex){
            System.out.println(ex);
        }
        System.out.println();
        System.out.println();
        System.out.println("You are at your home. It's best to get dressed and take your items. The chest is west of you and the exit is north of you ");
        System.out.println("Your available commands are: ");
        System.out.println("West = w, East = e, North = n, South = s, Interact = i ");

        // this variable for stop the loop
        int x=1;

        Scanner scanner= new Scanner(System.in);

        do {
            String txt= scanner.nextLine();

            if(txt.equals("w")||txt.equals("W")) {
                System.out.println("You stand in front of the chest. Do you want to interact? (interact = i)");
                Scanner scanner1= new Scanner(System.in);
                String a = scanner1.nextLine();
                if(a.equals("i")||a.equals("I") ){
                    System.out.println("You got dressed and you have took your wooden sword and shield");
                    items = 2;
                    System.out.println("Now you can leave the house. The exit is in north");
                    System.out.println("Enter N for North ");

                    Scanner scanner2= new Scanner(System.in);
                    String n= scanner2.nextLine();

                    if(n.equals("n")){
                        System.out.println("You have left the house");
                        System.out.println("You can hear someone screaming... its a goblin. He is shouting: The princess got kidnapped by Lord Lucifer!!");
                        System.out.println();
                        System.out.println("Oh No! I have to help her... First I need to get to the city... Which way should I take? The forest or the Village?(Forest = West, Village = East)");
                        System.out.println("Forest: 'F', Village: 'E' ");
                        String vill= scanner.nextLine();
                        if(vill.equals("f")|| vill.equals("F")){
                            System.out.println("Welcome to Forest World");
                            new World1(name, age, items);
                        }else if(vill.equals("e")|| vill.equals("E")){
                            // new World2();
                            System.out.println("Welcome to the Village World");
                        }
                    }
                }else {
                    System.out.println("You have entered the wrong command. Enter the right one!");
                }

                break;

            }else if(txt.equals("n")||txt.equals("N")){
                if(x==1){
                    System.out.println("Are you sure? or do you want to go to the chest first");
                }
                if(x==2){
                    System.out.println("You have left the house");
                    System.out.println("You can hear someone screaming... its a goblin. He is shouting: The princess got kidnaped by Lord Lucifer!!");
                    System.out.println("Oh No! I have to help her... First I need to get to the city... Which way should I take? The forest or the Village? ");
                    System.out.println("Forest: 'F', Village: 'E' ");
                    String vill= scanner.nextLine();
                    if(vill.equals("f")|| vill.equals("F")){
                        System.out.println("Welcome to the Forest World");
                        new World1(name, age, items);
                    }else if(vill.equals("e")|| vill.equals("E")){
                        System.out.println("Welcome to the Village World");
                    }
                }
            }else{
                System.out.println("You have entered the wrong direction. Enter the right one!");
            }

            x++;
        }while (x!=3);
    }
}


