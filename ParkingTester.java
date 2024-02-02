public class ParkingTester {
    public static void main(String[] args){
        
        ParkingLot lot = new ParkingLot();
        lot.toString();

        Car InfinitiA = new Car( "A",  "Infiniti", true);
        lot.park(InfinitiA);
        lot.toString();

        Car CadiliacB = new Car( "B",  "Cadiliac", false);
        lot.park(CadiliacB);
        lot.toString();

        lot.leave(0);
        lot.toString();
    }
}
