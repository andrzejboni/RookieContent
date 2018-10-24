package Strategy.Zadanie1;

public class EcoMode implements Mode {


    @Override
    public double howMuchIncreaseSpeed() {
        return 3;
    }


    @Override
    public double howMuchShouldEngineBeWear() {
        return 0.01;
    }

    @Override
    public double howManyGasShouldBeReleased() {
        return 0.01;
    }


    @Override
    public double howMuchDecreaseSpeed() {
        return -3;
    }

    @Override
    public double howMuchBreaksShouldBeGear() {
        return 0.01;
    }
}
