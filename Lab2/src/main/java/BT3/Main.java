package BT3;


public class Main {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(15);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println(resizableCircle);

    }

}