import kotlin.concurrent.thread

fun main() {
    println("....Wo bin ich...")
    Thread.sleep(3000)
    println("...Ich kann mich an nicht erinnern...")
    Thread.sleep(3000)




    val playerOne = Player(41, "John Xmas", "Spezial Einheit (Militär)")
    playerOne.introduce()

    println(" ------------------Willkommen----------------")
    Thread.sleep(4000)
    println("Du befindest dich auf unbekannterweise in der Raum der..Vergessene Götter")
    println("-------------------Escape Room---------------------")
    Thread.sleep(4000)
    println("Zu entkommen musst du drei Rätsel lösen")
    Thread.sleep(3000)
    println("Dafür musst du erstmal 3 Gegenstände nutzen")
    Thread.sleep(3000)
    println("--------------------Viel glück--------------------")


    val raetsel1 = MathematikRaetsel(1, "Was ist die Wurzel aus 144?", 12)
    val raetsel2 = WortRaetsel(2, "Ich bin schwer zu tragen, aber nicht schwer zu finden. Was bin ich?", "Geheimnis")
    val raetsel3 = WortRaetsel(3, "Ich habe einen Kopf und einen Schwanz, aber kein Körper. Was bin ich?", "Münze")

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
    }

    println("Herzlichen Glückwunsch! Du hast es aus dem Raum der Vergessenen Götter geschafft!")
}


