package felixwilking;

public class codewordchecker {
    private final String symbol;
    private final int min;
    private final int max;

    public codewordchecker(int min, int max, String symbol){
        this.min = min;
        this.max = max;
        this.symbol = symbol;
    }
    public codewordchecker(String symbol){
        this.min = 6;
        this.max = 20;
        this.symbol = symbol;
    }
    public boolean isValid(String str){
        if(str.contains(this.symbol)) return false;
        if((str.length() >= this.min) && (str.length() <= this.max)) return true;
        return false;
    }
}
