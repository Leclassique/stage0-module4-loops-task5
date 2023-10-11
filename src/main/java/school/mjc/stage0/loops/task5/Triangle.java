package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength+1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            for (int j = i; j < cathetusLength+1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
