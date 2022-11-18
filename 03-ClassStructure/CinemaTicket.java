
public class CinemaTicket
{
    //Atrybuty obiektu
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row,seat;
    double price;
    
    //Metody obiektu
    public void displayticket(){
        System.out.println("Bilet w kinie:" + CinemaTicket.cinemaName 
        + " na film: " + filmTitle + ", rząd:" 
        + row + ",miejsce: " + seat + ", cena:" + price); 
    }
    
    public CinemaTicket(String filmTitle,int row,int seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if (row > 2){
            price = 25;
        }
        else {
        price = 10;
        }
    
    }
    
    public static void main(String [] args) {
        CinemaTicket ticket1 = new CinemaTicket(filmTitle: "Gladiator", row:7, seat:15);
        CinemaTicket ticket2 = new CinemaTicket(filmTitle: "Gladiator", row:2, seat:16);
        ticket1.displayticket();
        ticket2.displayticket();
        
    }
    
}
