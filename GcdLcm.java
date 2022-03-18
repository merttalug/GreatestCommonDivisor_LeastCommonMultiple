import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean isError =false;
        int n1, n2;

        int gcd=1,lcm=1,i=1,k=1;

        do {
            System.out.println("Please input the first number: ");
            n1 = keyboard.nextInt();
            System.out.println("Please input the secon number");
            n2 = keyboard.nextInt();
            if (n1 >0 && n2 > 0){
                isError=true;
            }

        }
        while (!isError);



        while (i<=n1 && i<=n2){
            if (n1 %i ==0 && n2%i==0){
                gcd=i;
            }
            i++;

        }


        while (k<=n1*n2){
            if (k%n1==0 && k%n2==0){
                lcm=k;
                break;
            }
            k++;
        }

        System.out.println("The greatest common divisor(gdc) of the " +n1 +" and " +n2 +" is: " +gcd +"\nThe least common multiple(lcm) is: " +lcm);

        /*for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
                System.out.println(gcd);
                break;
            }
        }
        System.out.println("=========================");
        for (int m=1; m<=(n1*n2);m++) {
            if (m % n1 == 0 && m % n2 == 0) {
                lcm = m;
                break;
            }
        }
        System.out.println(lcm);
        *\

         */
    }
}
