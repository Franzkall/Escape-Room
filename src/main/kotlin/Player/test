fun main() {
    println("....                  (Girl):Wo bin ich...")
    Thread.sleep(3000)
    println("...                   (Girl):Ich kann mich an nicht erinnern...")
    Thread.sleep(3000)
    val red = "\u001B[31m"
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val blue = "\u001B[34m"
    val purple = "\u001B[35m"
    val cyan = "\u001B[36m"
    val reset = "\u001B[0m"

    val streichhoelzer = Streichhoelzer()
    val messer = Messer()
    val schluessel = Schluessel()

    val playerOne = Player(41, "John Xmas", "Spezial Einheit (Militär)", listOf(streichhoelzer, messer, schluessel))
    playerOne.introduce()

    println(" ------------------            Willkommen                      ----------------")
    Thread.sleep(4000)
    println("Du befindest dich auf unbekannterweise in der Raum der..Vergessene Götter")

    println("${red}                                 /..")
    println("${red}                                /....")
    println("${red}                               /.....\\")
    println("${red}                              /.......\\")
    println("${red}                             /.........\\")
    println("${red}                            /...........\\")
    println("${red}                           /.............\\")
    println("${red}                          / ..............\\")
    println("${red}                         /.................\\")
    println("${red}                        / ..................\\")
    println("${red}                       /.....................\\")
    println("${red}                      /.......................\\")
    Thread.sleep(3000)

    println("${red}                             ESCAPE ROOM${reset}")

    Thread.sleep(4000)

    println("Zu entkommen musst du drei Rätsel lösen")
    Thread.sleep(3000)

    println("Dafür musst du erstmal 3 Gegenstände nutzen")
    Thread.sleep(3000)

    println("-------------------------------Viel glück--------------------")


    val raetsel1 = MathematikRaetsel(1,1, "Was ist die Wurzel aus 144?", 12)
    val raetsel2 = TextRaetsel(2,1, "Ich kann fliegen, aber keinen Flügel habe ich. Ich kann singen, aber ich habe keine Stimme. Was bin ich?", "Ein Brief")
    val raetsel3 = MathematikRaetsel(3,3, "Was ist das nächste Zahl in dieser Folge? 1, 1, 2, 3, 5, 8, ...", 13)

    var geloest = 0
    while (geloest < 3) {
        println("Wähle ein Rätsel aus: 1, 2 oder 3")
        val raetselNummer = readLine()?.toIntOrNull() ?: continue
        val raetsel: Raetsel = when (raetselNummer) {
            1 -> raetsel1
            2 -> raetsel2
            3 -> raetsel3

            else -> continue
        }
        if (raetsel.loesen()) {
            println("Rätsel gelöst!")
            geloest++
        } else {
            println("Falsche Antwort. Versuch es nochmal.")
        }
        println("Herzlichen Glückwunsch! Du hast es aus dem Raum der Vergessenen Götter geschafft!")
    }
}
//Player.kt:
open class Player(val age: Int, val name: String, val profession: String, val gegenstaende: List<Gegenstand>) {





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
}
Rätselmath.kt:
open class Raetsel(val nummer: Int, val schwierigkeitsgrad: Int) {
    open fun frageStellen() {}
    open fun antwortPruefen(input: String): Boolean = false
    open fun loesen(): Boolean {
        frageStellen()
        val antwort = readLine()?.trim() ?: return false
        return antwortPruefen(antwort)
    }
}

class MathematikRaetsel(nummer: Int, schwierigkeitsgrad: Int, private val frage: String, private val loesung: Int) : Raetsel(nummer, schwierigkeitsgrad) {
    override fun frageStellen() {
        println(frage)
    }

    override fun antwortPruefen(input: String): Boolean {
        return input.toIntOrNull() == loesung
    }
}

class TextRaetsel(nummer: Int, schwierigkeitsgrad: Int, private val frage: String, private val antwort: String) : Raetsel(nummer, schwierigkeitsgrad) {
    override fun frageStellen() {
        println(frage)
    }

    override fun antwortPruefen(input: String): Boolean {
        return input.equals(antwort, ignoreCase = true)
    }
}

//Items.kt:
open class Gegenstand(val name: String)

open class Streichhoelzer : Gegenstand("Streichhölzer")

open class Messer : Gegenstand("Messer")

open class Schluessel : Gegenstand("Schlüssel")