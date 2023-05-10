package classes.items

import classes.Player

class Matches : Item("Streichhölzer") {
	// Eigenschaften und Funktionen der Streichholzklasse
	fun use(character: Player) {
		println("${character.name} benutzt die Streichhölzer.")
	}
}
