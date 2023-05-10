package classes.puzzles

open class PuzzleLogic
(val nummer: Int, val schwierigkeitsgrad: Int) {
	open fun frageStellen() {}
	open fun antwortPruefen(input: String): Boolean = false
	open fun loesen(): Boolean {
		frageStellen()
		val antwort = readLine()?.trim() ?: return false
		return antwortPruefen(antwort)
	}
}
