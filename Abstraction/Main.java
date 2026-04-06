

class Main{
    public static void main(String args[]){
        TwoNumCalc t = new TwoNumCalc();
        t.add(5,6);
        t.subract(6,5);
        t.multiply(7,8);
        t.divide(10,5);
    }
}


abstract class Calculator{
    abstract void add(int x,int y);
    abstract void subract(int x,int y);
    abstract void multiply(int x,int y);
    abstract void divide(int x,int y);
}

class TwoNumCalc extends Calculator{
    void add(int x,int y){
        System.out.println(x+y);
    }
    void subract(int x, int y){
        System.out.println(x-y);
    }
    void multiply(int x, int y){
        System.out.println(x*y);
    }
    void divide(int x, int y){
        System.out.println(x/y);
    }
}