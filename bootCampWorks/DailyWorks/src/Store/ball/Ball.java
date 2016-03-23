package store.ball;

import store.Colour;

public class Ball {
    private Colour color;

    public Ball(Colour color) {
        this.color = color;
    }

    public boolean isSameColour(Colour otherColor) {
        return color.equals(otherColor);
    }

}
