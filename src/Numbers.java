public enum Numbers {
    Positive("hello world",12),
    UNKNOWN(null,-1);
    int number;
    String text;
    Numbers(String a,int b){
        this.number=b;
        this.text=a;
    }
}
