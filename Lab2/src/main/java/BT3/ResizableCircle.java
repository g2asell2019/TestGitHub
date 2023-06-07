package BT3;

import BT3.Circle;
import BT3.Resizable;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(int radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.radius *= percent/100.0;
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[%s]", super.toString());
    }
}
