import classes.Player
import classes.puzzles.CalculationPuzzle
import classes.puzzles.TextPuzzle

fun gameLogic(player : Player) {
	println()
	
	val calculationPuzzle1 = CalculationPuzzle(1,1, "Was ist die Wurzel aus 144?", 12)
	val textPuzzle = TextPuzzle(2,1, "Ich kann fliegen, aber keinen Flügel habe ich. Ich kann singen, aber ich habe keine Stimme. Was bin ich?", "Ein Brief")
	val calculationPuzzle2 = CalculationPuzzle(3,3, "Was ist das nächste Zahl in dieser Folge? 1, 1, 2, 3, 5, 8, ...", 13)
	
	var solution = 0
	while (solution < 3) {
		println("Wähle ein Rätsel aus: 1, 2 oder 3")
		val puzzleNumber = readln()?.toIntOrNull()?: continue
		if (puzzleNumber == 1) {
			calculationPuzzle1.askQuestion()
			val playerAnswer : String = readln()
			if (calculationPuzzle1.checkAnswer(playerAnswer)) {
				println("Rätsel gelöst!")
				solution++
			} else {
				println("Falsche Antwort. Versuch es nochmal.")
				continue
			}
			
		} else if (puzzleNumber == 2) {
			textPuzzle.askQuestion()
			val playerAnswer : String = readln()
			if (textPuzzle.checkAnswer(playerAnswer)) {
				println("Rätsel gelöst!")
				solution++
			} else {
				println("Falsche Antwort. Versuch es nochmal.")
				continue
			}
			
		} else if (puzzleNumber == 3) {
			calculationPuzzle2.askQuestion()
			val playerAnswer : String = readln()
			if (calculationPuzzle2.checkAnswer(playerAnswer))
			{
				println("Rätsel gelöst!")
				solution ++
			}
			else
			{
				println("Falsche Antwort. Versuch es nochmal.")
				continue
			}
		} else {
			println("""Die gewählte Eingabe funktioniert nicht.
                |Bitte versuche es erneut.
            """.trimMargin())
			continue
		}
		println("Herzlichen Glückwunsch! Du hast es aus dem Raum der Vergessenen Götter geschafft!")
	}
}
