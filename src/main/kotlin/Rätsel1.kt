class Puzzle1 : Puzzle("Was wird nass, während es trocknet?", "Handtuch") {
    // Eigenschaften und Funktionen des ersten Rätsels
    fun solve(character: Character) : Boolean {
        if (character.hasMatches) {
            println("Das Streichholz ist angezündet und das Rätsel wurde gelöst!")
            return true
        } else {
            println("Du brauchst Streichhölzer, um dieses Rätsel zu lösen.")
            return false
        }
    }
}
