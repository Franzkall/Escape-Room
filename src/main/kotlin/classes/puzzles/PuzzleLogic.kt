package classes.puzzles

// Die abstrakte Basisklasse für Puzzle-Logik
open class PuzzleLogic
// Abstrakte Funktion, um die Frage zu stellen
(val number: Int, val difficultyLevel: Int) {
	open fun askQuestion() {}
	// Abstrakte Funktion, um die Antwort zu überprüfen
	open fun checkAnswer(input: String): Boolean = false
	// Funktion, um das Puzzle zu lösen, stellt die Frage und überprüft die Antwort
	open fun solve(): Boolean {
		askQuestion()
		val answer = readln()?.trim() ?: return false
		return checkAnswer(answer)
	}
}
