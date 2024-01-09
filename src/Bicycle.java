public class Bicycle extends Vehicle implements VehicleInterface {
    private int basket;

    public Bicycle(String modelName, int wheelsCount, int basket) {
        super(modelName, wheelsCount);
        this.basket = basket;
    }

    @Override
    public void infoService() {
        System.out.println("Обслуживаем: " + this.getModelName());
    }

    public void updateTybe() {
        for (int i = 1; i <= this.getWheelsCount(); i++)
            System.out.println(i + " - Меняем покрышку");
    }

    public void checkEngine() {
    }

    public void checkTrailer() {
        if (this.basket == 1) {
            System.out.printf("Проверяем наличие корзинки - Есть %d переднаяя корзина \n", this.basket);
        } else if (this.basket == 2) {
            System.out.printf("Проверяем наличие корзинки - Есть %d переднаяя и заднаяя корзина \n", this.basket);
        } else {
            System.out.println("Проверяем наличие корзинки - Корзинки нет");
        }
    }
}
