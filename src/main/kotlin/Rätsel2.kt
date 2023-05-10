class Puzzle2 : Puzzle("Ich bin groß, wenn ich stehe, aber ich bin klein, wenn ich liege. Was bin ich?", "Kerze") {
    // Eigenschaften und Funktionen des zweiten Rätsels
    fun solve(character: Character) : Boolean {
        if (character.hasKnife) {
            println("Das Messer wurde verwendet und das Rätsel wurde gelöst!")
            return true
        } else {
            println("Du brauchst ein Messer, um dieses Rätsel zu lösen.")
            return false
        }
    }
}