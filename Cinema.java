public class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
        this.listUsers = new User[20];
        this.listStudio = new Studio[20];
        init();
    }

    public void init() {
    }

    public boolean registerUser(String user ) {
        
        return false;
    }

    public User authenticateUser(String email, String password) {
        for (User user : listUsers) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void displayListStudio() {
        System.out.println("-".repeat(20));
        for (int i = 0; i < studioCapacity; i++) {
            if (listStudio[i] == null) {
                System.out.print("|");
                System.out.printf("%d ", i + 1);
                System.out.println();
                break;
            }
        }
        System.out.println("-".repeat(20));
    }

    public void displayStudioDetail(int studioNumber) {
        if (studioNumber >= 0 && studioNumber < listStudio.length) {
            int studio = listStudio.length;
            System.out.println("Detail Studio " + studioNumber + ":");
            System.out.println("Type: " + studio.getType());
            System.out.println("Movie Title: " + studio.getTitle());
        } else {
            System.out.println("Studio tidak ditemukan.");
        }
    }

    public boolean addStudioWithMovies (String studioType, String movieTitle, double movieRating, String[] movieGenres) {
        Studio newStudio = new Studio(studioType);
        Movie newMovie = new Movie(movieTitle,movieRating,movieGenres);
        Studio.Movie(newMovie);
        return true;
    }

    public boolean bookTicket(User user, int studioNumber, char row, int col) {
        if (studioNumber >= 0 && studioNumber < listStudio.length) {
            Studio studio = listStudio[studioNumber];
            if (studio.isSeatAvailable(row, col)) {
              Ticket ticket = new Ticket(studio.getMovie(), studioNumber, row + "" + col);
              user.addTicket(ticket);
              studio.setSeat(row, col);
              return true;
            } else {
              System.out.println("Seat is not available.");
            }
          } else {
            System.out.println("Studio not found.");
          }
          return false;
    }

    public String getName() {
        return name;
    }
}