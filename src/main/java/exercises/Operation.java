package exercises;

public enum Operation {
    PLUS,MINUS,TIMES,DIVIDE;
    double eval(double x,double y){
        switch(this){
            case PLUS:
                return x+y;
            case MINUS:
                return  x-y;
            case TIMES:
                return  x*y;
            case DIVIDE:
                return  x/y;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(3,6));
        System.out.println(Season.SUMMER.ordinal());
        for (Season value : Season.values()) {
            System.out.println(value);
        }
    }
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER;
}