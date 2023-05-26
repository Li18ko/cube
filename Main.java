public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.scale(150, 150, 150);
        cube.rotate(0, 0, 0);
        Screen screen = new Screen(cube);
    }
}