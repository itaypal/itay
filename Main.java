import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        int input1=1;
        double input2;


        double dolar = 3.41;
        double euro = 3.53;
       // shkel = 1.0;

        while (input1 != 0) {


            System.out.println("""
                        Press  1 to convert a shekels to dollars
                        Press  2 to convert a dollars to shekels
                        Press  3 to convert a euro to shekels
                        Press  4 to convert a shekels to euros
                        press 0 to exit
                    """);



            input1 = sc1.nextInt();


            System.out.println("please enter amount");
            input2 = sc2.nextDouble();



            switch (input1) {
                case 1:
                    System.out.println("the resolute is: "+input2 / dolar + "$");
                    break;
                case 2:
                    System.out.println("the resolute is: "+input2 * dolar + "₪");
                    break;
                case 3:
                    System.out.println("the resolute is: "+input2 * euro + "₪");
                    break;
                case 4:
                    System.out.println("the resolute is: "+input2 / euro + "€");
                    break;
                default:
                    System.out.println("something goes wrong, try again");
            }


        }
        System.out.println("goodbye");
    }


    }

