import classes.Player
import classes.items.Key
import classes.items.Knife
import classes.items.Matches
import utils.*

fun gameIntroduction() : Player
{
	println("....                  (Girl):Wo bin ich...")
	Thread.sleep(3000)
	println("...                   (Girl):Ich kann mich an nicht erinnern...")
	Thread.sleep(3000)
	
	val match : Matches = Matches()
	val blade : Knife = Knife()
	val key : Key = Key()
	
	val playerOne = Player(41, "John Xmas", "Spezial Einheit (Militär)", listOf(match, blade, key))
	playerOne.introduce()
	
	println("------------------            Willkommen                      ----------------")
	Thread.sleep(4000)
	println("Du befindest dich auf unbekannterweise in der Raum der..Vergessene Götter")
	
	println("$red                                         /..")
	println("$green                                      /....")
	println("$yellow                                    /.....\\")
	println("$red                                      /.......\\")
	println("$blue                                    /.........\\")
	println("$red                                    /...........\\")
	println("$red                                   /.............\\")
	println("$red                                  / ..............\\")
	println("$red                                 /.................\\")
	println("$red                                / ..................\\")
	println("$cyan                              /.....................\\")
	println("$purple                           /.......................\\")
	Thread.sleep(3000)
	
	println("$red                                 ESCAPE ROOM$reset")
	
	Thread.sleep(4000)
	
	println("Zu entkommen musst du drei Rätsel lösen")
	Thread.sleep(3000)
	
	println("Dafür musst du erstmal 3 Gegenstände nutzen")
	Thread.sleep(3000)
	
	println("-------------------------------Viel glück--------------------")
	
	return playerOne
}
