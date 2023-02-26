package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        if (cathetusLength < 1)
            System.out.print("");
        else {

            int initialOffset = cathetusLength-1;
            String initialOutput = "1";
            String spaces = " ".repeat(initialOffset);
            System.out.print(spaces+initialOutput+"\n");
            String currOutput="";
            for(int i = 2; i <= cathetusLength; i++) {

                currOutput = (i + initialOutput + i);
                int currOffset = initialOffset - i + 1;
                spaces = " ".repeat(currOffset);
                System.out.print(spaces + currOutput + "\n");
                initialOutput = currOutput;
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
