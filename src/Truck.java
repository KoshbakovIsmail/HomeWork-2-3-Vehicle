public class Truck extends Vehicle implements VehicleInterface {
    private double engineVolume;
    private int additionalTrailer;

    public Truck(String modelName, int wheelsCount, double engineVolume, int additionalTrailer) {
        super(modelName, wheelsCount);
        this.engineVolume = engineVolume;
        this.additionalTrailer = additionalTrailer;
    }

    @Override
    public void infoService() {
        System.out.println("Обслуживаем: " + this.getModelName());
    }

    @Override
    public void updateTybe() {
        if (this.additionalTrailer == this.additionalTrailer) {
            this.additionalTrailer += this.additionalTrailer;
        }
        int num = this.additionalTrailer + this.getWheelsCount();
        for (int i = 1; i <= num; i++)
            System.out.println(i + " - Меняем покрышку");

    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель - Объем двигателя: " + this.engineVolume);
    }

    @Override
    public void checkTrailer() {
        int extraTrailer = 1;
        if (this.additionalTrailer == this.additionalTrailer) {
            for (int i = 1; i < this.additionalTrailer; i++) {
                this.additionalTrailer = this.additionalTrailer - extraTrailer;
            }
        }
        System.out.println("Проверяем прицеп - Количество прицепа: " + this.additionalTrailer);
    }


}


