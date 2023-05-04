import java.util.*

class WortRaetsel(schwierigkeitsgrad: Int, val beschreibung: String, val loesung: String) : Raetsel(schwierigkeitsgrad) {
    override fun loesen(): Boolean {
        println(beschreibung)
        val antwort = readLine()?.trim()?.lowercase(Locale.getDefault()) ?: return false
        return antwort == loesung
    }
}
