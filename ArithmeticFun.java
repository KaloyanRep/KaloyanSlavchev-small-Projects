public class ArithmeticFun {
    public static void main(String[]args){

        int a = 10;
        int b =15;


        //e.g.. BINARY OPERATORS
                int result = a + b; // binary operator bcs it takes 2 operands
                                    // = assignment operator

        int difference = a- b;
        int product=a*b;
        int quotient=b/a;
        int remainder = b%a;



                System.out.println("result is " + result);
                System.out.println("difference is " + difference);
                System.out.println("product is " +product);
                System.out.println("quotient is " + quotient);
                System.out.println("remainder is " +remainder);

                result +=20; //result = result +20
                System.out.println("Result is now " + result);


                //UNARY OPERAND
                result++; // ++result(its the same)
                System.out.println("result++" +result);

                result--; // --result(its the same)
                System.out.println("result--" +result);

                product *= 2; //product = product * 2;
                System.out.println("final value of product is " +product);



    }
}
