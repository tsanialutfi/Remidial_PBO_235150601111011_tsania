public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type) {
        this.type = type;
        seats = new boolean[10][10]; 
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = false;
            }
        }
    }

    public String getStudioInfo() {
        return "Studio Type: " + type + ", Movie: " + (movie != null ? movie.getTitle() : "No movie scheduled");
    }

    public int isBooked(char row, int col) {
        int rowIndex = row - 'A';
        if (rowIndex < 0 || rowIndex >= seats.length || col < 0 || col >= seats[rowIndex].length) {
            return -1; 
        }
        return seats[rowIndex][col] ? 1 : 0;
    }

    public boolean reserve(char row, int col) {
        int rowIndex = row - 'A';
        if (rowIndex < 0 || rowIndex >= seats.length || col < 0 || col >= seats[rowIndex].length) {
            return false; 
        }
        if (seats[rowIndex][col]) {
            return false; 
        }
        seats[rowIndex][col] = true; 
        return true;
    }

    public String getType() {
        return type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private void setSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = false;
            }
        }
    }

    public boolean isSeatAvailable(char row, int col) {
        throw new UnsupportedOperationException("Unimplemented method 'isSeatAvailable'");
    }

    public void setSeat(char row, int col) {
    }

    public static void Movie(Movie newMovie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Movie'");
    }
}
