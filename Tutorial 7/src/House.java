import java.util.ArrayList;

public class House {
    private ArrayList<Room> ListOfRooms = new ArrayList<Room>();
    public String address;
    public static int NumRooms = 0;

    private House(String address, ArrayList<Room> listOfRooms) {
        this.ListOfRooms = listOfRooms;
        this.address = address;
    }

    private House(String address) {
        this.address = address;
    }

    public static void CreateHouse(String address){
        House house = new House(address);
    }

    void addRoom(Room room){
        ListOfRooms.add(room);
        NumRooms++;
    }

    void addRooms(ArrayList<Room> newRooms){
        for(int i = 0; i < newRooms.size(); i++){
            ListOfRooms.add(newRooms.get(i));
            NumRooms ++;
        }
    }

    public double getRoomCount(){
        return NumRooms;
    }
}
