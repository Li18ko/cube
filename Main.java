import java.util.Scanner;

public class Main {

    public static int n;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("1 - зарисовать, 2 - проволочный");
        n = in.nextInt();

        Cube cube = new Cube();
        cube.scale(60, 60, 60);
        cube.rotate(180, 30, 70);
        Screen screen = new Screen(cube);

    }
}