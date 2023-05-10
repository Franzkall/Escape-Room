package classes.items

import classes.Player
import classes.rooms.Room

class Key : Item("Schlüssel") {
	// Eigenschaften und Funktionen der Schlüsselklasse
	fun use(character: Player, room: Room) {
		room.unlockRoom(character)
	}
}
