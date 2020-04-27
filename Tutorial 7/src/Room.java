import java.util.ArrayList;

public class Room {
    public ArrayList<Forniture> furniture = new ArrayList<Forniture>();
    public int Area;

    public Room(ArrayList<Forniture> furniture, int Area) {
        this.furniture = furniture;
        this. Area = Area;
    }

    public ArrayList<Forniture> getFurniture() {
        return furniture;
    }

    public double getTotalPrice(ArrayList<Forniture> furniture){
        double TotalPrice =0;
        for (int i =0; i < furniture.size(); i++){
           TotalPrice += furniture.get(i).getPriceVAT();
        }
        return TotalPrice;
    }
}
