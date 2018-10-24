package Strategy.Zadanie1;

public class NormalMode implements Mode {


    @Override
    public double howMuchIncreaseSpeed() {
        return 5;
    }


    @Override
    public double howMuchShouldEngineBeWear() {
        return 0.05;
    }

    @Override
    public double howManyGasShouldBeReleased() {
        return 0.02;
    }


    @Override
    public double howMuchDecreaseSpeed() {
        return -5;
    }

    @Override
    public double howMuchBreaksShouldBeGear() {
        return 0.05;
    }
}
