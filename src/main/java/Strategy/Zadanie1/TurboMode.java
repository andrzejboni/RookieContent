package Strategy.Zadanie1;

public class TurboMode implements Mode {


    @Override
    public double howMuchIncreaseSpeed() {
        return 10;
    }


    @Override
    public double howMuchShouldEngineBeWear() {
        return 0.1;
    }

    @Override
    public double howManyGasShouldBeReleased() {
        return 0.05;
    }




    @Override
    public double howMuchDecreaseSpeed() {
        return -10;
    }

    @Override
    public double howMuchBreaksShouldBeGear() {
        return 0.1;
    }
}
