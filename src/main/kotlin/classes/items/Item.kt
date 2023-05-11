package classes.items

import classes.Player
import classes.rooms.Room

open class Item(val name: String) {

	// Eigenschaften des Gegenstands
    open fun use(character:Player,room: Room?) {

    }
}

