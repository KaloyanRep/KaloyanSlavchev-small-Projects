public class RelationalFun {
    public static void main (String[] args){
        boolean myBool = true;
        boolean yourBool = false;

        int myAge = 37;
        int yourAge=20;
        int bobsAge = 20;

        String myName="John";
        String yourName="Johny";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        boolean ageComparison = myAge > yourAge;
        System.out.println("MyAge > yourAge?: " + ageComparison);

        ageComparison = yourAge>bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge?: " + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names match?: " + nameComparison);


        int currentAge = 23;

        boolean isGreater21 =currentAge >=21;



        System.out.println("currentAge > your age?:" +isGreater21);

    }
}
