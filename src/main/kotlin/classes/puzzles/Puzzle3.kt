package classes.puzzles

import classes.Player
import classes.items.Key

class Puzzle3 : Puzzle("Ich habe Schlüssel, aber keine Schlösser. Was bin ich?", "Tastatur") {
	// Eigenschaften und Funktionen des dritten Rätsels
	fun solve(character: Player) : Boolean {
		val key : Key = Key()
		if (character.hasItem(character.gegenstaende,key)) {
			println("Du hast den Schlüssel gefunden und das Rätsel wurde gelöst!")
			return true
		} else {
			println("Du brauchst den Schlüssel, um dieses Rätsel zu lösen.")
			return false
		}
	}
}
