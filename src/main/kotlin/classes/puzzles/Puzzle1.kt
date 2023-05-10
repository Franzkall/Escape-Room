package classes.puzzles

import classes.Player
import classes.items.Matches

class Puzzle1 : Puzzle("Was wird nass, während es trocknet?", "Handtuch") {
	// Eigenschaften und Funktionen des ersten Rätsels
	fun solve(character: Player) : Boolean {
		val streichholz : Matches = Matches()
		if (character.hasItem(character.gegenstaende, streichholz)) {
			println("Das Streichholz ist angezündet und das Rätsel wurde gelöst!")
			return true
		} else {
			println("Du brauchst Streichhölzer, um dieses Rätsel zu lösen.")
			return false
		}
	}
}
