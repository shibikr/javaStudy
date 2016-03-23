package store;

import org.junit.Test;
import store.ball.Ball;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BallTest {
    @Test
    public void checks_given_color_matches_ball_color_and_return_true() {
        Ball ball = new Ball(Colour.BLUE);
        assertTrue(ball.isSameColour(Colour.BLUE));
    }

    @Test
    public void checks_given_color_matches_ball_color_and_return_false() {
        Ball ball = new Ball(Colour.BLUE);
        assertFalse(ball.isSameColour(Colour.RED));
    }

}