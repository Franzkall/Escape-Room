class Room(val name: String) {
    // Eigenschaften des Raums
    private var isLocked = true

    // Funktion zum Entsperren des Raums
    fun unlockRoom(character: Character) {
        if (character.occupation == "Soldat") {
            println("Der Raum '${name}' wurde von ${character.name} entsperrt.")
            isLocked = false
        } else {
            println("Du hast nicht die richtige Fähigkeit, um diesen Raum zu entsperren.")
        }
    }

    // Funktion, um mit dem Raum zu interagieren
    fun interactRoom(character: Character) {
        if (isLocked) {
            println("Der Raum '${name}' ist verschlossen.")
            unlockRoom(character)
        } else {
            println("Du hast den Raum '${name}' bereits entsperrt.")
        }
    }
}