import java.util.Scanner;

public class Main {

    public static int n;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Cube cube = new Cube();
        cube.scale(60, 60, 60);
        cube.rotate(0, 0, 0);
        Screen screen = new Screen(cube);

    }
}