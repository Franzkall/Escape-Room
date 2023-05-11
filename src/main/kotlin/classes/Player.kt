package classes

import classes.items.Item

open class Player(val age: Int, val name: String, val profession: String, val items: List<Item>) {
    //Definiert eine offene Funktion namens introduce, die den Spieler vorstellt und einige Ausgaben auf der Konsole ausgibt
    open fun introduce() {

        println("              Hallo...")
        Thread.sleep(3000)
        println("              mein Name ist $name")
        Thread.sleep(3000)
        println("...           Wo zum Teufel sind wir.....God dam....")
        Thread.sleep(3000)
        println("              Unknow girl:...hallo John         ....es ist so Dunkel hier..und ich kann mich nicht bewegen..")
        Thread.sleep(3000)
        println("              (John):Ich sehe nach ob ich eine Lösung finde...")
        Thread.sleep(6000)

    }
    //// Eine Funktion, die prüft, ob ein bestimmtes Item in der Liste der Spieler-Items vorhanden ist
    fun hasItem(items1 : List<Item>, item : Item) : Boolean {
        val searchedItem : Item = item
        
        return items1.contains(searchedItem)
    }
}
