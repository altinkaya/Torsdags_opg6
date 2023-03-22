package opg2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        this.seats[0][0] = "X";

        // her opretter vi sæde og rækker med et for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (i != 0 || j != 0) { // og her ser vi bort fra den første sæde
                    this.seats[i][j] = "O";
                }
            }
        }
    }

    public final int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat)

    {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("x")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        //ændre null til blank så den ikke printer den med ud
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
