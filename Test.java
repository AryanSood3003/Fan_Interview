import java.util.*;

public class Test {
    public static void main(String[] args) {
       Main chain = new Main();
       Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Press\n1 to change speed\n2 to change direction\n");
            int ch=sc.nextInt();
            chain.pull(ch);
        }
    }
}