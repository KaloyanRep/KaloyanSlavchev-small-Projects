import java.util.Scanner;

public class Proj2_2MadLibsClone {

    public static void main (String[] args){

        Scanner keyboard=new Scanner(System.in);

        String adj;
        String girlname;
        String adj2;
        String occupation;
        String place;
        String clothes;
        String hobby;
        String adj3;
        String occupation2;
        String boyName;
        String manName;



        System.out.print("Enter an adjective1 ?: "  );
        adj= keyboard.nextLine();

        System.out.print("Enter girls name ?: "  );
        girlname= keyboard.nextLine();

        System.out.print("Enter  adjective2 ?: "  );
        adj2= keyboard.nextLine();

        System.out.print("Enter an occupation ?: "  );
        occupation= keyboard.nextLine();

        System.out.print("Enter the name of a place ?: "  );
        place= keyboard.nextLine();

        System.out.print("Enter the name of piece of clothing ?: "  );
        clothes= keyboard.nextLine();

        System.out.print("Enter the name of a hobby ?: "  );
        hobby= keyboard.nextLine();

        System.out.print("Enter another adjective3 ?: "  );
        adj3= keyboard.nextLine();

        System.out.print("Enter another occupation2 ?: "  );
        occupation2= keyboard.nextLine();

        System.out.print("Enter a boy's name ?: "  );
        boyName= keyboard.nextLine();

        System.out.print("Enter a man's name ?: "  );
        manName= keyboard.nextLine();


        System.out.println("There once was a  " + adj + " girl named " + girlname + " who was a " + adj2 + " " + occupation + " in the Kingdom of Dehli " + place + ".");


        System.out.println("She loved to wear " + clothes + " and to " + hobby + "." +" She wanted to marry the " + adj3 + occupation2 + " named " + boyName + " but her father,King " + manName + " forbid her from seeing him.");






    }


}
