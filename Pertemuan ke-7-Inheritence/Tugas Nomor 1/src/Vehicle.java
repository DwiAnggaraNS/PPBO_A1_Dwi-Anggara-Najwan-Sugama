public class Vehicle {
    private String brand;
    private int year;
    private double rentalPrice;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Vehicle(String brand, int year, double rentalPrice) {
        this.brand = brand;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public double calculateDiscount(){
        if (this.year < 2010){
            return this.rentalPrice*0.1;
        } return 0;
    }

    public void displayInfo(){
        System.out.println("Merk : "+this.brand);
        System.out.println("Tahun : "+this.year);
        System.out.println("Harga Sewa  : "+this.rentalPrice);
    }
}