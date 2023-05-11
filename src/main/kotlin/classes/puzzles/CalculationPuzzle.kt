package classes.puzzles
//// Eigenschaften und Funktionen der Rätsel
class CalculationPuzzle(nummer: Int, schwierigkeitsgrad: Int, private val question: String, private val answer: Int) : PuzzleLogic(nummer, schwierigkeitsgrad) {
	override fun askQuestion() {
		println(question)
	}
	
	override fun checkAnswer(input: String): Boolean {
		return input.trim().toIntOrNull() == answer
	}
}
