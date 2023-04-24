package Project5;

public class Switch {
    

    public static void main(String[] args) {
        System.out.println(determineNameOfMonth(3));
        System.out.println(isWeekDay(0));
    }

    public static boolean isWeekDay(int day) {
        boolean output = true;
        switch (day) {
            case 0:
                output = false; break;
            case 1-5:
                output = true; break;
            case 6:
                output = false; break;
        }
        return output;
    }

    public static String determineNameOfMonth(int month) {
        String output = "";
        switch(month) {
            case 1: 
                output = "January"; break;
            case 2: 
                output = "February"; break;
            case 3: 
                output = "March"; break;
            case 4: 
                output = "April"; break;
            case 5: 
                output = "May"; break;
            case 6: 
                output = "June"; break;
            case 7: 
                output = "July"; break;
            case 8: 
                output = "August"; break;
            case 9: 
                output = "September"; break;
            case 10: 
                output = "October"; break;
            case 11: 
                output = "November"; break;
            case 12: 
                output = "December"; break;
        }
        return output;
    }
}


