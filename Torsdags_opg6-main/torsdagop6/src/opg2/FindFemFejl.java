package opg2;

import opg2.Cinema;

public class FindFemFejl {

    public static void main(String[] args) {
        Cinema biogrande = new Cinema(20, 10);

        // Reserver række 1, sæde 5
       // vi ændre talet til 4 da array starter på index 0
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(0, 4));

        // Print hele salen pænt
        System.out.println(biogrande);

        // Reserver det sidste sæde i den sidste række

        int numberOfRows = biogrande.getRows();
        int numberOfSeats = biogrande.getSeats();
        // her reservi vi et sæde og rekke
        biogrande.reserve(numberOfRows, numberOfSeats);
        System.out.println(biogrande);

        // Afbestil reservation på række 1, sæde 5
        //vi ændre talet til 4 da array starter på index 0
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(0, 4));
        System.out.println(biogrande);
    }
}
