public class Booking {
    String booking_id;
    Film film;

    int jumlah_tiket;
    String payment;

    public Booking(String booking_id, Film film, int jumlah_tiket, String payment) {
        this.booking_id = booking_id;
        this.film = film;
        this.jumlah_tiket = jumlah_tiket;
        this.payment = payment;
    }
}
