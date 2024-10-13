//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter your name and surname :");
//        String name = input.next();
//        String surname = input.next();
//        System.out.println("Hi there " + surname + " " + name );

//        String name = "johnson" ;
//        String upper_case = name.toUpperCase();
//        System.out.println(name);

//        Scanner input = new Scanner(System.in);
//        int number = 0;
//        switch (number) {
//            case 1:
//                System.out.println("Monday ");
//                break;
//            System.out.println("Enter a number between 0-7");
//            number = input.nextInt();
//            case 2:
//                System.out.println("tuesday ");
//                break;
//            case 3:
//                System.out.println("wednesday ");
//                break;
//            case 4:
//                System.out.println("thursday  ");
//                break;
//            case 5:
//                System.out.println("Friday ");
//                break;
//            default:
//                System.out.println("Weekend");
//                break;

//        }
//        int number = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 0-7");
//        number = input.nextInt();
//
//        switch (number) {
//             case 1:
//               System.out.println("Monday ");
//               break;
//            case 2:
//                System.out.println("tuesday ");
//                break;
//            case 3:
//                System.out.println("wednesday ");
//                break;
//            case 4:
//                System.out.println("thursday  ");
//                break;
//            case 5:
//                System.out.println("Friday ");
//                break;
//            case 6 ,7 :
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Please enter a number between 0-7");
//
//        }
//        int number = 6 ;
//        switch (number){
//            case 1 :
//                System.out.println("Audi");
//                break;
//            case 2 :
//                System.out.println("BMW");
//                break;
//            case 3 :
//                System.out.println("Tesla");
//                break;
//            case 4 :
//                System.out.println("Honda");
//                break;
//            case 5 :
//                System.out.println("Toyota");
//                break;
//            default:
//                System.out.println("Please input within 5");
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("I like to ");
//            int j = 1;
//            while (j <= 2) {
//                System.out.println("Move it");
//                j++;
//                i++;
//
//
//            }
//        }
//        int i = 132;
//
//        do {
//            System.out.println("hello " + i);
//            i++;
//        }while (i<=4);
//        for (int x = 4; x >0 ; x--)
//        {
//            System.out.println("HELLO " + x);
//            for (int i = 0 ; i <= 10 ; i++)
//            {
//                System.out.println("  "  + (i+5));
//            }
//        }
            int r = 4;
            int p = 8;

            calculater calc = new calculater();

            int result = calc.addvalue(r,p);

//            int result = x + y ;
            System.out.println(result);
          }
          static class calculater {

        public int addvalue (int x , int y){

            int i = x + y ;
            return i;
        }
          }
}

