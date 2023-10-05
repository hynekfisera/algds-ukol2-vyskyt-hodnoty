import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int pocet = 0;
        if (a == 3) {
            pocet = pocet + 1;
        }
        if (b == 3) {
            pocet = pocet + 1;
        }
        if (c == 3) {
            pocet = pocet + 1;
        }
        if (d == 3) {
            pocet = pocet + 1;
        }
        System.out.println(pocet);

        /*int pocet = 0;
        if (a == 3) pocet++;
        if (b == 3) pocet++;
        if (c == 3) pocet++;
        if (d == 3) pocet++;
        System.out.println(pocet);*/

        /*int pocet = 0;
        int[] list = new int[]{a, b, c, d};
        for (int x : list
        ) {
            if (x == 3) pocet++;
        }
        System.out.println(pocet);*/

        /*int[] list = new int[]{a, b, c, d};
        int pocet = (int) Arrays.stream(list).filter(x -> x == 3).count();
        System.out.println(pocet);*/
    }
}