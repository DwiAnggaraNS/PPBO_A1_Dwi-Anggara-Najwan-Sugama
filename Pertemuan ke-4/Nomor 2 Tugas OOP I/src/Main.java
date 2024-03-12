import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Film avengers = new Film("Avengers", "Action", 180,50);
    Film doraemon = new Film("Doraemon", "Fantasy", 120,60);

    MovieApp movieApp = new MovieApp();
    movieApp.addFilm(avengers);
    movieApp.addFilm(doraemon);

    movieApp.displayAllFilms();

    movieApp.searchFilm("Doraemon");
    movieApp.searchFilm("Avatar");

    movieApp.bookFilm(avengers, 20, "Cash");
    movieApp.bookFilm(doraemon, 100, "eBanking");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Masukkan kode booking pesanan yang dicari: ");
    String booking_id = scanner.nextLine();
    movieApp.searchBooking(booking_id);

    }
}
