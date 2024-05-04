public class Truck extends Vehicle {
    private int cargoCapacity;

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Truck(String brand, int year, double rentalPrice, int cargoCapacity) {
        super(brand, year, rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateDiscount() {
        double diskon = super.calculateDiscount();
        if (this.getCargoCapacity()>2000){
            return diskon+(super.getRentalPrice()*0.1);
        }return 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Detail Truk : ");
        super.displayInfo();
        System.out.println("Kapasitas kargo : "+this.cargoCapacity);
        System.out.println("Total Diskon : "+this.calculateDiscount());
        System.out.println("Harga sewa setelah diskon : "+(super.getRentalPrice()-this.calculateDiscount()));
        System.out.println("---------------------------------------------------------");
    }
}
