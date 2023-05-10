class Key : Item("Schlüssel") {
    // Eigenschaften und Funktionen der Schlüsselklasse
    fun use(character: Character, room: Room) {
        room.unlockRoom(character)
    }
}