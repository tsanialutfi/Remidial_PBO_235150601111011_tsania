public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketLists;
    private int ticketCount; // untuk menghitung jumlah ticket yang sudah ditambahkan
    private final int MAX_TICKET = 10; // Example value

    public User(String email, String password, String fullName, double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
        this.ticketLists = new Ticket[MAX_TICKET];
        this.ticketCount = 0; // inisialisasi ticketCount menjadi 0
    }

    public boolean addTicket(Ticket ticket) {
        if (ticketCount < MAX_TICKET) { // cek apakah array ticketLists masih memiliki ruang
            ticketLists[ticketCount] = ticket;
            ticketCount++; // increment ticketCount
            return true;
        } else {
            return false; // array ticketLists sudah penuh
        }
    }

    public void displayAllTickets() {
        if (ticketCount > 0) { // cek apakah array ticketLists tidak kosong
            for (int i = 0; i < ticketCount; i++) {
                System.out.println(ticketLists[i].toString()); // assuming Ticket has a toString method
            }
        } else {
            System.out.println("No tickets available.");
        }
    }

    public boolean isMatch(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}