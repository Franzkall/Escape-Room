import classes.Player
import classes.items.Key
import classes.items.Knife
import classes.items.Matches
import utils.*

fun gameIntroduction() : Player
//Funktion gameIntroduction() führt die Spielerin oder den Spieler in das Spiel ein. Sie gibt einen Player zurück.
{
	println("....                  (Girl):Wo bin ich...")
	Thread.sleep(1500)
	println("...                   (Girl):Ich kann mich an nicht erinnern...")
	Thread.sleep(1500)
	//Variablen match, blade und key vom Typ Matches, Knife und Key erstellen jeweils ein Objekt
	val match : Matches = Matches()
	val blade : Knife = Knife()
	val key : Key = Key()
	
	val playerOne = Player(41, "John Xmas", "Soldat", listOf(match, blade, key))
	//Funktion Player() erstellt eine neue Spielerin oder einen neuen Spieler mit einem Alter von 41 Jahren, einem Namen "John Xmas", einem Beruf "Soldat" und einer Liste von Gegenständen, die mit den zuvor erstellten Gegenstandsobjekten initialisiert wird.
	playerOne.introduce()
	//Funktion introduce() ist eine Methode der Klasse Player, die den Spieler oder die Spielerin in der Konsole vorstellt.
	
	println("------------------            Willkommen                      ----------------")
	//Die Zeilen, die mit println() beginnen, geben Text in der Konsole aus. Die Ausgabe kann durch Escape-Sequenzen wie $red und $reset farblich formatiert werden.
	Thread.sleep(3000)
	println("Du befindest dich auf unbekannterweise in der Raum der..Vergessene Götter")
	
	println("$red                                         /..")
	println("$red                                        /....")
	println("$red                                       /.....\\")
	println("$red                                      /.......\\")
	println("$red                                     /.........\\")
	println("$red                                    /...........\\")
	println("$red                                   /.............\\")
	println("$red                                  / ..............\\")
	println("$red                                 /.................\\")
	println("$red                                / ..................\\")
	println("$red                               /.....................\\")
	println("$red                              /.......................\\")
	Thread.sleep(2000)
	
	println("$red                                     ESCAPE ROOM$reset")
	
	Thread.sleep(1000)
	
	println("Zu entkommen musst du drei Rätsel lösen")
	Thread.sleep(1500)
	
	println("Dafür musst du erstmal 3 Gegenstände nutzen")
	Thread.sleep(1500)
	
	println("-------------------------------Viel glück--------------------")
	
	return playerOne
}
