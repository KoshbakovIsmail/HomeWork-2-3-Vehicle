public class Car extends Vehicle implements VehicleInterface {
    private double engineVolume;

    public Car(String modelName, int wheelsCount, double engineVolume) {
        super(modelName, wheelsCount);
        this.engineVolume = engineVolume;
    }

    @Override
    public void infoService() {
        System.out.println("Обслуживаем автомобиль: " + this.getModelName());
    }

    @Override
    public void updateTyre() {
        for (int i = 1; i <= this.getWheelsCount(); i++)
            System.out.println(i + " - Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель - Объем двигателя: " + this.engineVolume);
    }

    public void checkTrailer() {
    }

}
