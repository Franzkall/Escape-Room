class MathematikRaetsel(schwierigkeitsgrad: Int, val frage: String, val loesung: Int) : Raetsel(schwierigkeitsgrad) {
    override fun loesen(): Boolean {
        println(frage)
        val antwort = readLine()?.toIntOrNull() ?: return false
        return antwort == loesung
    }
}
