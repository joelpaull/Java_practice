package Project3;

public class BookRunner {
    
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerProgramming.read_book();

        artOfComputerProgramming.setCopies(70);
        effectiveJava.setCopies(50);
        cleanCode.setCopies(75);

        effectiveJava.increaseCopies(10);
        effectiveJava.decreaseCopies(20);
        System.out.println(effectiveJava.getCopies());
    }
}
