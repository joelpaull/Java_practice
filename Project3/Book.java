package Project3;

public class Book {

    //state
    private int copiesOfBook;

    //methods
    public void setCopies(int copyCount){
        this.copiesOfBook = copyCount;
    }

    public int getCopies() {
        return this.copiesOfBook;
    }

    public void increaseCopies(int amount){
        this.copiesOfBook = this.copiesOfBook += amount;
    }
    
    public void decreaseCopies(int amount){
        if(this.copiesOfBook - amount > 0)
            this.copiesOfBook = this.copiesOfBook +- amount;
    }
    
    public void read_book() {
        System.out.println("Reading Book");
    }
}
