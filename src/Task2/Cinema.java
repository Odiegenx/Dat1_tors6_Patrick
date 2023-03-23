package Task2;

public class Cinema {

        String[][] seats;

        // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
        // Sæder, der ikke er reserveret, har værdien "O"
        public Cinema(int rows, int seats) {
            this.seats = new String[rows][seats];  // 1st error. you need to declare first.
            for(int i = 0; i < rows;i++){          // 2end error. you need to fill the array.
             for(int j = 0; j < seats;j++){
                    this.seats[i][j] = "O";
                }
            }
            this.seats[0][0] = "X";
        }



        public int getRows() {
            return seats.length;
        }

        public int getSeats() {
            return seats[0].length;
        }

        // If the seat is not yet reserved, it's value is O.
        // In that case, change the value to X and return true.
        // If the seat is already reserved, return false.
        public boolean reserve(int row, int seat) {
            if (this.seats[row-1][seat-1].equals("O")) {       // 5th error need to -1 to make up for the array index starts at 0.
                this.seats[row-1][seat-1] = "X";
                return true;
            }
            return false;
        }

        public boolean cancelReservation(int row, int seat) {
            if (seats[row-1][seat-1].equals("X")) {             // 4th error equals is case sensitive
                seats[row-1][seat-1] = "O";
                return true;
            }
            return false;
        }

        public String toString() {
            String result="";                           // 3rd should not be null
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


/*
      for(int i = 0; i < rows;i++){
            for(int j = 0; j < seats;j++){
                this.seats[i][j] = "O";
            }
            this.seats[0][0] = "X";
        }
    }
 */