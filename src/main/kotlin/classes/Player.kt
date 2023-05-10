package classes

import classes.items.Item

open class Player(val age: Int, val name: String, val profession: String, val gegenstaende: List<Item>) {

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
    
    fun hasItem(gegenstaende : List<Item>, item : Item) : Boolean {
        val searchedItem : Item = item
        
        return gegenstaende.contains(searchedItem)
    }
}
