package classes.items

import classes.Player
import classes.rooms.Room

class Knife : Item("Messer") {
	// Eigenschaften und Funktionen der Messerklasse
	override fun use(character: Player, room: Room?) {
		println("${character.name} benutzt das Messer.")

	}
	//fun use(character: Player) {
	//	println("${character.name} benutzt das Messer.")
	//}
}
