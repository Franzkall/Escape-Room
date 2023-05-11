package classes.items

import classes.Player
import classes.rooms.Room

class Matches : Item("Streichhölzer") {
	// Eigenschaften und Funktionen der Streichholzklasse
	override fun use(character: Player, room: Room?) {
		println("${character.name} benutzt die Streichhölzer.")
	}
	//fun use(character: Player) {
		//println("${character.name} benutzt die Streichhölzer.")
	//}
}
