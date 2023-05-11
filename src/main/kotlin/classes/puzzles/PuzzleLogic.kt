package classes.puzzles

open class PuzzleLogic
(val number: Int, val difficultyLevel: Int) {
	open fun askQuestion() {}
	open fun checkAnswer(input: String): Boolean = false
	open fun solve(): Boolean {
		askQuestion()
		val answer = readln()?.trim() ?: return false
		return checkAnswer(answer)
	}
}
