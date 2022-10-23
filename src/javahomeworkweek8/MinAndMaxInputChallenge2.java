package javahomeworkweek8;
/*Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
        -Before the user enters the number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        number.
        Hint:
        -Use an endless while loop.
        -Create a class with the name MinAndMaxInputChallenge.*/

        import java.util.Scanner;

public class MinAndMaxInputChallenge2 {

    public static void method1(int[] a) {
        int max = 0;
        int min = 0;
        int i = 0;

        while (i < a.length) {
            if (i == 0)
            max = min = a[i];
        else if (a[i] > max) {
                max = a[i];
            } else if (a[i] > min) {
                min = a[i];
                i++;
            }
        }
        System.out.println("this is maximum number: " + max);
        System.out.println("this is minimum number: " + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of aray");
        int sizeofArray = scanner.nextInt();

        if (sizeofArray < 0)
        System.out.println("invalid number");
        else{
            int a[] = new int[sizeofArray];
            int i = 0;
            while (i < a.length) {
                System.out.println("Please enter number" + (i + 1) + ":");
                a[i] = scanner.nextInt();
                i++;
            }
            method1(a);
        }
    }

}