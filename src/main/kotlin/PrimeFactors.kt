import kotlin.math.sqrt

object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> =
            primeFactors(int.toLong()).map { it.toInt() }

    fun primeFactors(long: Long): List<Long> {

        if (long == 1L) return emptyList()

        (2..sqrt(long.toDouble()).toLong()).map {
            if (long % it == 0L) {
                return listOf(it).plus(primeFactors(long / it))
            }
        }

        return listOf(long)
    }
}
