class Knife : Item("Messer") {
    // Eigenschaften und Funktionen der Messerklasse
    fun use(character: Character) {
        println("${character.name} benutzt das Messer.")
    }
}