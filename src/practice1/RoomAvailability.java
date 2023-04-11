package practice1;

import java.time.LocalDate;
import java.util.Arrays;

public class RoomAvailability {
    static LocalDate ld = LocalDate.now();
    static Rooms[] roomsGrid;

    public static void setRoomsGrid(){
        roomsGrid = new Rooms[ld.lengthOfMonth()];
        for (int i = 0; i < roomsGrid.length; i++) {
            roomsGrid[i] = new Rooms();
        }
    }
    public static void main(String[] args) {
        setRoomsGrid();
        for (int i = 0; i < roomsGrid.length; i++) {
            System.out.println("[" + (i + 1) + "] = " + roomsGrid[i].toString());
        }
        roomsGrid[15].presidentialSuite = 0;
        System.out.println(roomsGrid[15].toString());
        System.out.println(roomsGrid[16].toString());

    }
}
