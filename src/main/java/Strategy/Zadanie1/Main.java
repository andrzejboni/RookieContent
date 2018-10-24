package Strategy.Zadanie1;

public class Main {
//
//    StrategyTypeCar strategyTypeCar= new StrategyTypeCar(new Adding());
//        System.out.println(formulaExecutor.execute(1,3));

    public static void main(String[] args) {


        Car samochod = new Car(new TurboMode());
        Car s3 = new Car(new TurboMode());
        Car s2= new Car(new EcoMode());
        Car s4= new Car(new NormalMode());

        s3.decreaseSpeed();
        s3.increaseSpeed();

        s3.getSpeed();
        s2.getSpeed();
        s4.getSpeed();
        System.out.println(s3.getSpeed()+" "+ + s2.getSpeed()+" " + s4.getSpeed());
    }
}
