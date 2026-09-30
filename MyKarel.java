import stanford.karel.*;

public class MyKarel extends Karel {

    public void run() {
        move();
        move();
        turnLeft();
        move();
        doubleTheBeepers();
    }
    public void doubleTheBeepers() {
        putDoubleBeeperOnNextDoor();
//        moveBeeperOnNextDoorBack();
    }

    private void putDoubleBeeperOnNextDoor() {
        while(beepersPresent()){
            pickBeeper();
            move();
            putBeeper();
            putBeeper();
            turnAround();
            move();
            turnAround();
        }
    }

    private void turnAround() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}
