package Project4;

public class MyChar {
    char char1;

    public MyChar(char char1) {
        this.char1 = char1;
    }
    
    public boolean isVowel() {
        if(char1 == 'a' || char1 == 'e' || char1 == 'i' || 
        char1 == 'o' || char1 == 'u'){
            return true;
        } else {
            return false;
        }
    }

    public boolean isConsonant() {
        if(isVowel() || isDigit()){
            return false;
        } else {
            return true;
        }
    }

    public boolean isDigit() {
        if(char1 >= 48 && char1 <= 57){
            return true;
        } else {
            return false;
        }
    }
}
