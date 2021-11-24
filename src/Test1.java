import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Exception 1 : Enter the Exception 2: Enter the Exception 3: Enter the exception 4 :Enter the exception 5");
            int n = s.nextInt();
            switch (n) {
                case 1 -> {
                    try {
                        throw new ArithmeticException();
                    } catch (ArithmeticException e) {
                        System.out.println(e);
                    }
                }
                case 2 -> {
                    try {
                        throw new RuntimeException();
                    } catch (RuntimeException e) {
                        System.out.println(e);
                    }
                }
                case 3 -> {
                    try {
                        throw new ArrayIndexOutOfBoundsException();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                }
                case 4 -> {
                    try {
                        throw new NullPointerException();
                    } catch (NullPointerException e) {
                        System.out.println(e);
                    }
                }
                case 5 -> {
                    try {
                        throw new NumberFormatException();
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                    }
                }
                default ->
                        //throw new IllegalStateException("Invalid exception: ");
                        System.out.println("Exception not found");
            }
        }
    }
}

