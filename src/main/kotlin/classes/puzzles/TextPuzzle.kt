package classes.puzzles

class TextPuzzle(number: Int, difficultyLevel: Int, private val question: String, private val answer: String) : PuzzleLogic(number, difficultyLevel) {
	override fun askQuestion() {
		println(question)
	}
	
	override fun checkAnswer(input: String): Boolean {
		return input.trim().equals(answer, ignoreCase = true)
	}
}
