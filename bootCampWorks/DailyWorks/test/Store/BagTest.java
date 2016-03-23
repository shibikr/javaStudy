package store;

import exceptions.BagExceededException;
import exceptions.ColourException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import store.ball.Ball;

import static org.junit.Assert.assertEquals;

public class BagTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addBall_adds_ball_to_the_bag() throws BagExceededException, ColourException {
        Bag bag = new Bag();
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.RED));

        assertEquals(bag.numberOfBallsAdded(), 2);
    }

    @Test
    public void addBall_prevents_adding_more_than_12_balls() throws ColourException, BagExceededException {
        thrown.expect(BagExceededException.class);
        thrown.expectMessage("You can not add more balls");

        Bag bag = new Bag();
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.RED));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.BLUE));
    }

    @Test
    public void adds_only_three_green_balls() throws BagExceededException, ColourException {
        thrown.expect(ColourException.class);
        thrown.expectMessage("no more balls of same color can be added");

        Bag bag = new Bag();
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
    }

    @Test
    public void can_not_add_red_ball_not_more_than_the_double_of_green_balls() throws ColourException, BagExceededException {
        Bag bag = new Bag();
        thrown.expect(ColourException.class);
        thrown.expectMessage("no more balls of same color can be added");

        bag.addBall(new Ball(Colour.RED));
    }

    @Test
    public void blue_balls_can_be_added_as_much_as_we_can() throws ColourException, BagExceededException {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.addBall(new Ball(Colour.BLUE));
        }

        assertEquals(bag.numberOfBallsAdded(), 12);
    }

    @Test
    public void only_40_percent_of_the_number_of_balls_can_be_added_as_yellow_balls() throws ColourException, BagExceededException {
        Bag bag = new Bag();
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.YELLOW));

        assertEquals(bag.numberOfBallsAdded(),5);

    }

    @Test
    public void more_than_40_percent_of_the_number_of_balls_can_not_be_added_as_yellow_balls() throws ColourException, BagExceededException {
       thrown.expect(ColourException.class);
        thrown.expectMessage("no more balls of same color can be added");

        Bag bag = new Bag();
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.YELLOW));
        bag.addBall(new Ball(Colour.YELLOW));
        bag.addBall(new Ball(Colour.YELLOW));
    }

    @Test
    public void summary_of_the_balls_contain_in_the_bag() throws ColourException, BagExceededException {
        Bag bag = new Bag();
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.GREEN));
        bag.addBall(new Ball(Colour.BLUE));
        bag.addBall(new Ball(Colour.YELLOW));
        String expected = bag.getSummary();
        String actual = "BAG : 5 BALLS\nRED : 0 BALLS\nGREEN : 3 BALLS\nBLUE : 1 BALLS\nYELLOW : 1 BALLS\n";

        assertEquals(expected,actual);
    }

//    @Test
//    public void detailed_summary_of_the_balls_contains_in_the_bag() throws ColourException, BagExceededException {
//        Bag bag = new Bag();
//        bag.addBall(new Ball(Colour.GREEN));
//        bag.addBall(new Ball(Colour.GREEN));
//        bag.addBall(new Ball(Colour.GREEN));
//        bag.addBall(new Ball(Colour.BLUE));
//        bag.addBall(new Ball(Colour.YELLOW));
//        bag.addBall(new Ball(Colour.BLUE));
//        bag.addBall(new Ball(Colour.BLUE));
//        String expected = bag.getDetailedSummary();
//        String actual = "BAG : 7 BALLS\n3G,1B,1Y,2B";
//
//        assertEquals(expected,actual);
//
//    }
}