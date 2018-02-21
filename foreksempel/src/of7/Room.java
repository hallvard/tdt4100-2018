package of7;

import java.util.ArrayList;
import java.util.Collection;

public class Room {
	private Room leftRoom, rightRoom; 
	private String name; 
	
	public Room(String name) {
		this.name= name; 
	}
	
	public void setRightRoom(Room room) {
		if(this.rightRoom==room) {
			return ; 
		}
		//Passer på at det eksisterende høyrerommet ikke peker på noe
		Room oldRoom = this.rightRoom ; 
		//Oppdaterer her for å ikke få en evig løkke
		this.rightRoom = room; 
		if(oldRoom!=null) {
			oldRoom.setLeftRoom(null);}
		
		//Oppdaterer andre rommet til å ha dette som venstre rom
		if (room!= null) {
			room.setLeftRoom(this);
		}
		
	}
	//Tilsvarende skjer i setLeftRoomMetoden
	public void setLeftRoom(Room room) {
		if(this.leftRoom==room) {
			return; 
		}
		
		Room oldRoom = this.leftRoom ; 
		this.leftRoom = room; 
		if(oldRoom!=null) {
			oldRoom.setRightRoom(null);
		}
	
		if(room!=null) {
			room.setRightRoom(this);}
	}
	//Visited passer på at du sjekker hvert rom kun ett gang
	public boolean canBeReachedFrom(Room room, Collection<Room> visitedRooms) {
		
		if(room == null) {
			return false; 
		}
		if(visitedRooms.contains(room)) {
			return false; 
		}
		System.out.println("Sjekker rom " + room.name);
		if(room==this) {
			return true; 
		}
		visitedRooms.add(room);
		return this.canBeReachedFrom(room.leftRoom, visitedRooms) || this.canBeReachedFrom(room.rightRoom, visitedRooms); 
		
	}
	
	public static void main(String[] args) {
		Room r1 = new Room("R1"); 
		Room r2 = new Room("R2"); 
		Room r3 = new Room("R3");
		
		Room f1 = new Room("F1");
		r1.setRightRoom(r2);
		r2.setRightRoom(r3);
		r3.setLeftRoom(r1);
		
		System.out.println(r3.canBeReachedFrom(f1, new ArrayList<>()));
	}

}
