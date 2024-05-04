public class Car extends Vehicle {
    public enum Type{
        CITY_CAR, FAMILY_CAR, PREMIUM_CAR
    }

    private Type carType;

    public Type getCarType() {
        return carType;
    }

    public void setCarType(Type carType) {
        this.carType = carType;
    }

    public Car(String brand, int year, double rentalPrice, Type typeCar) {
        super(brand, year, rentalPrice);
        this.carType = typeCar;
    }

    @Override
    public double calculateDiscount() {
        double diskon = super.calculateDiscount();
        if (this.carType == Type.FAMILY_CAR) {
            return diskon+(super.getRentalPrice()*0.05);
        } else if (this.carType == Type.PREMIUM_CAR) {
            return diskon+(super.getRentalPrice()*0.1);
        }else{
            return 0;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Detail Mobil : ");
        super.displayInfo();
        System.out.println("Tipe Mobil : "+this.carType);
        System.out.println("Total Diskon : "+this.calculateDiscount());
        System.out.println("Harga sewa setelah diskon : "+(super.getRentalPrice()-this.calculateDiscount()));
        System.out.println("---------------------------------------------------------");
    }
}
