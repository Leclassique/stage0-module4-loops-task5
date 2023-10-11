package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){

            for (int j = 1; j <= length; j++) {
                System.out.print(8);
            }
            System.out.println();
            for (int i = 1; i <= height - 2; i++) {
                System.out.print(8);
                for (int j = 1; j <= length - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(8);
            }
            for (int j = 1; j <= length; j++) {
                System.out.print(8);
            }
        }
    }
}
