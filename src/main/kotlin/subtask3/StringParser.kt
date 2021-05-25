package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val result = arrayListOf<String>()
        var finalSeparator: Char?
        var deepCounter: Int

        for ((index, letter) in inputString.withIndex()) {
            if (separators.contains(letter)) {

                deepCounter = 0
                finalSeparator = separators[letter]

                for (subIndex in index..inputString.lastIndex) {

                    if (inputString[subIndex] == letter) { deepCounter++ }
                    if (inputString[subIndex] == finalSeparator) {
                        deepCounter--
                        if (deepCounter == 0) {
                            result.add(inputString.substring(index+1 until subIndex))
                            break
                        }
                    }

                }
            }
        }

        return result.toTypedArray()
    }

    companion object {
        private val separators = mapOf<Char, Char>('<' to '>', '[' to ']', '(' to ')')
    }
}
