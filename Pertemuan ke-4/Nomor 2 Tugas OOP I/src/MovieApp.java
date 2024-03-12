import java.util.ArrayList;
import java.util.UUID;

public class MovieApp {
//    Atibut
    ArrayList<Film> listFilm;
    ArrayList<Booking> listBooking;

    public MovieApp() {
        this.listFilm = new ArrayList<Film>();
        this.listBooking = new ArrayList<Booking>();
    }

//  Method untuk menambahkan film ke List Film
    void addFilm(Film film){
        listFilm.add(film);
    }

//  Method mencari film dengan menggunakna Judul Film
    void searchFilm(String title){
        boolean check = false;
        for (Film film: listFilm){
            if (film.title.equals(title)){
                check = true;
                System.out.println("Film Tersedia, Berikut Rincian Filmnya:");
                System.out.println(film.title+" - "+film.genre+" - Duration: "+film.duration+" mins - Avaible Seats: "+film.avaibleSeats+"\n");
                break;
            }
        }
        if (!check){
            System.out.println("Film Tidak Tersedia\n");
        }

    }

//   Method untuk menampilkan semua film yang berada di List Film
    void displayAllFilms(){
        System.out.println("List of Films;");
        for (Film film: this.listFilm){
            System.out.println(film.title+" - "+film.genre+" - Duration: "+film.duration+" mins - Avaible Seats: "+film.avaibleSeats);
        }
        System.out.println();
    }

//  Method untuk booking film
    void bookFilm(Film film, int jumlah_tiket, String payment){
        UUID uuid = UUID.randomUUID();
        String randomId = uuid.toString();

        Booking booking = new Booking(randomId, film, jumlah_tiket, payment);
        listBooking.add(booking);

        if (jumlah_tiket <= film.avaibleSeats){
            System.out.println("Pesanan berhasil, dengan detail pesanan:");
            System.out.println("Film: "+film.title);
            System.out.println("Jumlah tiket: "+jumlah_tiket);
            System.out.println("Booking id: "+randomId+"\n");
        }
        else{
            System.out.println("Pesanan tidak dapat diproses. Kursi tidak tersedia\n");
        }
    }

//   Method mencari pesanan dengan menggunakna Kode Pesanan (Booking id)
    void searchBooking(String booking_id){
        boolean checker = false;
        for (Booking booking: listBooking){
            if (booking.booking_id.equals(booking_id)){
                checker = true;
                System.out.println("Pesanan ditemukan, berikut detail pesanannya:");
                System.out.println("Film: "+booking.film.title);
                System.out.println("Pembayaran menggunakan : "+booking.payment);
                System.out.println("Jumlah tiket: "+booking.jumlah_tiket);
                System.out.println("Booking id: "+booking.booking_id+"\n");
            }
        } if (!checker){
            System.out.println("Pesanan tidak ditemukan");
        }
    }
}
