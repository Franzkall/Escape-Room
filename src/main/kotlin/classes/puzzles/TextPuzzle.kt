
package classes.puzzles

// Die Klasse TextPuzzle ist eine Unterklasse von PuzzleLogic
// Dise Klasse repräsentiert ein Rätsel, bei dem der Benutzer einen Text in einer Frage beantworten muss
class TextPuzzle(number: Int, difficultyLevel: Int, private val question: String, private val answer: String) : PuzzleLogic(number, difficultyLevel) {
	// askQuestion ist eine Funktion zum Drucken der Rätsel-Frage
	override fun askQuestion() {
		println(question)
	}
	// checkAnswer ist eine Funktion zum Überprüfen, ob die Antwort korrekt ist
	// Es überprüft, ob die Eingabe mit der Antwort übereinstimmt (ignoriert die Groß- und Kleinschreibung)
	override fun checkAnswer(input: String): Boolean {
		return input.trim().equals(answer, ignoreCase = true)
	}
}
