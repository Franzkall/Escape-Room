package classes.items

import classes.Player

class Knife : Item("Messer") {
	// Eigenschaften und Funktionen der Messerklasse
	fun use(character: Player) {
		println("${character.name} benutzt das Messer.")
	}
}
