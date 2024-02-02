public class ParkingLot {
    public ParkingSpot[] spots;

    public ParkingLot(){
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < 10; i++){ 
            if (i <= 1){
                this.spots[i] = new ParkingSpot(true);
            }
            else{
                this.spots[i] = new ParkingSpot(false);
            }
        }
    }

    public int park(Car car){
        for(int i = 0; i < 10; i++){
            if (car.handicap == spots[i].handicap){
                spots[i].parkedCar = car;
                return i;
            }
        }
        return -1;
    }

    public Car leave(int spot){
        Car car = spots[spot].parkedCar;
        spots[spot].parkedCar = null;
        return car;
    }

    public String toString(){
        int X = 0;
        int Y = 0;
        
        for(int i = 0; i < 2; i++){ 
            if (spots[i].parkedCar == null){
                X++;
            }
        }

        for(int i = 2; i < 10; i++){ 
            if (spots[i].parkedCar == null){
                Y++;
            }
        }
        
        System.out.println(X + " " + Y);

        return "";
    }
}
