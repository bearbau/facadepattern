public class HotelApp {
    public static void main(String[] args){
        HotelService valet = new Valet();
        FrontDesk frontDesk = new FrontDesk(valet);
        frontDesk.requestService;
    }
}