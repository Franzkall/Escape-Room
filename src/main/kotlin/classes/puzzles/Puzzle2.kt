package classes.puzzles

import classes.Player
import classes.items.Knife

class Puzzle2 : Puzzle("Ich bin groß, wenn ich stehe, aber ich bin klein, wenn ich liege. Was bin ich?", "Kerze") {
	// Eigenschaften und Funktionen des zweiten Rätsels
	fun solve(character: Player) : Boolean {
		val knife : Knife = Knife()
		if (character.hasItem(character.gegenstaende,knife)) {
			println("Das Messer wurde verwendet und das Rätsel wurde gelöst!")
			return true
		} else {
			println("Du brauchst ein Messer, um dieses Rätsel zu lösen.")
			return false
		}
	}
}
