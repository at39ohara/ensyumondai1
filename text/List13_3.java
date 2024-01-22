package text;

public abstract class List13_3 {
    

    public abstract String toString();


    public abstract void draw();


    public void print(){
        System.out.println(toString());
        draw();
    }
}