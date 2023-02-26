package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        if (cathetusLength < 1)
            System.out.print("");
        else {
            int initialOffset = cathetusLength-2;
            String spaces = " ".repeat(initialOffset);
            String currOutput;
            String initialOutput = "*";
            System.out.println(spaces +" "+ initialOutput);
            for(int i = 1; i < cathetusLength; i++) {
                currOutput = ('*' + initialOutput);
                int currOffset = initialOffset - i + 1;
                spaces = " ".repeat(currOffset);
                System.out.println(spaces + currOutput);
                initialOutput = currOutput;
          }
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
