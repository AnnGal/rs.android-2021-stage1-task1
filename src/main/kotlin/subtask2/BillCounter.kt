package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        if (bill.isEmpty()) { return okWord }

        val sumMustPay = (bill.sum() - bill[k]) / 2

        return if (sumMustPay == b) {
            okWord
        } else {
            (b - sumMustPay).toString()
        }
    }

    companion object {
        private const val okWord = "Bon Appetit"
    }
}
