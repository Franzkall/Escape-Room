class Puzzle3 : Puzzle("Ich habe Schlüssel, aber keine Schlösser. Was bin ich?", "Tastatur") {
    // Eigenschaften und Funktionen des dritten Rätsels
    fun solve(character: Character) : Boolean {
        if (character.hasKey) {
            println("Du hast den Schlüssel gefunden und das Rätsel wurde gelöst!")
            return true
        } else {
            println("Du brauchst den Schlüssel, um dieses Rätsel zu lösen.")
            return false
        }
    }
}