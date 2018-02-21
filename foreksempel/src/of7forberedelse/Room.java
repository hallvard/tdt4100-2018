package of7forberedelse;

import java.util.ArrayList;
import java.util.List;

public class Room {

	private Room leftRoom, rightRoom; 
	private String name;
	
	public Room(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public void setRightRoom(Room room) {
		this.rightRoom = room; 
		room.leftRoom = this; 
	}
	public void setLeftRoom(Room room) {
		this.leftRoom = room; 
		room.rightRoom = this; 
	}
	
	public boolean canBeReachedFrom(Room room, List<Room> visitedRooms) {
		if (visitedRooms.contains(room)) {
			return false; 
		}
		System.out.println("Sjekker " + room);
		if (room == null) {
			return false;
		}
		if (room == this) {
			return true;
		}
		visitedRooms.add(room); 
		return this.canBeReachedFrom(room.leftRoom, visitedRooms) || this.canBeReachedFrom(room.rightRoom, visitedRooms);
	}
	
	public static void main(String[] args) {
		Room r1 = new Room("Rom 1");
		Room r2 = new Room("Rom 2");
		Room r3 = new Room("Rom 3");
		Room r4 = new Room("Rom 4");
		Room r5 = new Room("Rom 5");
		
		// Sett referanser
		r1.setRightRoom(r2);
		r2.setRightRoom(r3);
		
		r4.setLeftRoom(r5);
		
		System.out.println(r1.canBeReachedFrom(r3, new ArrayList<Room>()));
		
		
		System.out.println(r4.canBeReachedFrom(r1, new ArrayList<Room>()));
		
	}
	
}
