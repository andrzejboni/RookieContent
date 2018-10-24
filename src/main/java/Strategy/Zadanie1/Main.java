package Strategy.Zadanie1;

public class Main {
//
//    StrategyTypeCar strategyTypeCar= new StrategyTypeCar(new Adding());
//        System.out.println(formulaExecutor.execute(1,3));

    public static void main(String[] args) {


        Car samochod = new Car(new TurboMode());
        Car s3 = new Car(new TurboMode());
        Car s2= new Car(new TurboMode());
        Car s4= new Car(new TurboMode());

        s3.decreaseSpeed();
        s3.increaseSpeed();


    }
}
