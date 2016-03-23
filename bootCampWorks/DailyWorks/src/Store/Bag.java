package store;

import exceptions.BagExceededException;
import exceptions.ColourException;
import store.ball.Ball;

import java.util.ArrayList;

public class Bag {
    private final ArrayList<Ball> bag = new ArrayList();
    private final int bagSize = 12;
    private final int maxGreenBalls = 3;
    private int greenBalls = 0;
    private int redBalls = 0;
    private int yellowBalls = 0;
    private int blueBalls = 0;


    public void addBall(Ball ball) throws BagExceededException, ColourException {
        if (bag.size() > bagSize - 1) {
            throw new BagExceededException();
        } else {
            validateAndAddBalls(ball);
        }
    }

    public int numberOfBallsAdded() {
        return bag.size();
    }

    private void validateAndAddBalls(Ball ball) throws ColourException {

//        if (ball.isSameColour(Colour.GREEN) && greenBalls < maxGreenBalls) {
//            bag.add(ball);
//            greenBalls++;
//        } else if (ball.isSameColour(Colour.RED) && redBalls < greenBalls * 2) {
//            bag.add(ball);
//            redBalls++;
//        } else if (ball.isSameColour(Colour.BLUE)) {
//            bag.add(ball);
//            blueBalls++;
//        } else if (ball.isSameColour(Colour.YELLOW) && yellowBalls < Math.floor(bag.size() * 40 / 100)) {
//            bag.add(ball);
//            yellowBalls++;
//        } else {
//            throw new ColourException();
//        }
    }

    public String getSummary() {
        int totalBalls = bag.size();
        String summary = "";
        String[] details = {"BAG : ", "RED : ", "GREEN : ", "BLUE : ", "YELLOW : "};
        int[] noOfBalls = {totalBalls, redBalls, greenBalls, blueBalls, yellowBalls};
        for (int i = 0; i < details.length; i++) {
            summary += details[i] + noOfBalls[i] + " BALLS\n";
        }
        return summary;
    }

}
