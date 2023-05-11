import classes.Player
import classes.puzzles.CalculationPuzzle
import classes.puzzles.TextPuzzle
import classes.rooms.Room
// Hauptfunktion für die Spiellogik
fun gameLogic(player : Player) {
	// Ruft die Funktion für das erste Level auf
	level01(player)
	// Später kommt hier noch Level 02 etc. deshalb eigene Funktion für Game Logik außerhalb der Main.kt
}
// Funktion für das erste Level
private fun level01(player : Player)
{
	println("Ich werde ein Streichholz anzünden...")
	// Ruft die Funktion "use" des ersten Items des Spielers auf (um das Streichholz anzuzünden)
	val match = player.items[0]
	match.use(player, null)
	// Ruft die Funktion für die Rätsel-Schleife auf
	loopingPuzzles(player)
	
	println(
			"""Ein Schlüsselloch wird freigelegt.
		|${player.name} holt den ${player.items[2].name} aus seiner Tasche. Ob er passt?
		|Mit zitternden Fingern dreht ${player.name} ihn in seinen Händen, bis er tief durchatmet.
	""".trimMargin()
	       )
	// Erstellt ein neues Room-Objekt für das nächste Level
	val nextRoom : Room = Room("Verlassenes Irrenhaus")
	
	player.items[2].use(player, nextRoom)
}
// Funktion für die Rätsel-Schleife
private fun loopingPuzzles(player : Player)
{
	// Erstellt drei Rätsel-Objekte
	val calculationPuzzle1 = CalculationPuzzle(1, 1, "Was ist die Wurzel aus 144?", 12)
	val textPuzzle = TextPuzzle(
			2,
			1,
			"Ich kann fliegen, aber keinen Flügel habe ich. Ich kann singen, aber ich habe keine Stimme. Was bin ich?",
			"Ein Brief"
	                           )
	val calculationPuzzle2 =
			CalculationPuzzle(3, 3, "Was ist das nächste Zahl in dieser Folge? 1, 1, 2, 3, 5, 8, ...", 13)
	
	var solution = 0
	// Schleife, die so lange läuft, bis der Spieler alle drei Rätsel gelöst hat
	while (solution < 3)
	{
		println("Wähle ein Rätsel aus: 1, 2 oder 3")
		val puzzleNumber = readln()?.toIntOrNull() ?: continue
		// Wenn Rätsel 1 ausgewählt wurde
		if (puzzleNumber == 1)
		{
			calculationPuzzle1.askQuestion()
			val playerAnswer : String = readln()
			if (calculationPuzzle1.checkAnswer(playerAnswer))
			{
				solution = isSolved(solution)
			}
			else
			{
				isNoSolution()
				continue
			}
			
		}
		else if (puzzleNumber == 2)
		// Wenn Rätsel 2 ausgewählt wurde
		{
			textPuzzle.askQuestion()
			val playerAnswer : String = readln()
			if (textPuzzle.checkAnswer(playerAnswer))
			{
				solution = isSolved(solution)
			}
			else
			{
				attackMonster(player)
				continue
			}
			
		}
		else if (puzzleNumber == 3)
		// Wenn Rätsel 3 ausgewählt wurde
		{
			calculationPuzzle2.askQuestion()
			val playerAnswer : String = readln()
			if (calculationPuzzle2.checkAnswer(playerAnswer))
			{
				solution = isSolved(solution)
			}
			else
			{
				isNoSolution()
				continue
			}
		}
		else
		// Wenn eine ungültige Rätselnummer ausgewählt wurde
		{
			println(
					"""Die gewählte Eingabe funktioniert nicht.
                |Bitte versuche es erneut.
            """.trimMargin()
			       )
			continue
		}
		println("Herzlichen Glückwunsch!")
	}
}

private fun isNoSolution()
//Funktion namens isNoSolution, die aufgerufen wird, wenn der Spieler eine falsche Antwort gibt. Sie gibt eine Fehlermeldung aus und kehrt zur Aufrufstelle zurück.
	{
		println("Falsche Antwort. Versuch es nochmal.")
		return
	}

	private fun isSolved(solution : Int) : Int
//Funktion namens isSolved, die aufgerufen wird, wenn der Spieler das Rätsel richtig löst. Sie erhöht die Lösungszahl um eins und gibt eine Erfolgsmeldung aus.
{
		var solution1 = solution
		println("Rätsel gelöst!")
		solution1 ++
		return solution1
	}

	private fun attackMonster(player : Player)
	//Funktion namens attackMonster, die aufgerufen wird, wenn der Spieler das Rätsel falsch beantwortet und somit eine Bestie beschwört. Sie gibt eine Beschreibung des Kampfes aus, verwendet das zweite Item des Spielers, um die Bestie anzugreifen, und gibt eine Warnung aus, das Rätsel erneut zu lösen.
	{
		println("Falsche Antwort.")
		println(
			"""Ein Schauer läuft den beiden Protagonisten über den Rücken.
					|Es scheint sich etwas in der Finsternis zu regen.
					|Zwei rot glühende Höllenbälle erleuchten und schleichen sich näher.
					|
					|Plötzlich stürzt sich das Etwas mit einem Zischen auf seine Opfer.
					|Scharfe Krallen kratzen über den Steinboden, als ${player.name} ausweicht.
					|Fieberhaft durchwühlt er seine Taschen.
					|Er hatte doch ein ${player.items[1].name} bei sich gehabt?
					|
					|Gerade als die roten Bälle sich grollend über ihn erheben, ertasten seine klammen Finger den mit Stoff umwickelten Griff.
				""".trimMargin()
		)

		player.items[1].use(player, null)

		println(
			"""Die grausige Bestie kreischt auf, als sich die Klinge in den in der Finsternis verborgenen Körper bohrt.
					|${player.name} Muskeln schreien vor Anstrengung während er immer wieder das Messer herauszieht und zusticht.
					|Erst, als sich das Etwas nicht mehr rührt und ${player.name} nichts mehr von ihm hört, lässt er von der Bestie ab.
					|Sein Keuchen erfüllt die Kammer.
				""".trimMargin()
		)

		println("Versuch das Rätsel erneut zu lösen und nicht nochmal eine Bestie heraufzubeschwören.")

		println("")
	
	println(
			"""Hier weitere Hinweise:
					|Ich lebe nicht, aber ich kommuniziere und habe einen Körper.
					|Bewegen tut sich dieser nicht von alleine.
				""".trimMargin()
	       )
	
	println("")
}
