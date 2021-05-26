package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty()){
            return sadArray
        }

        var tempArray: ArrayList<Int> = sadArray.toCollection(ArrayList<Int>())
        //println(tempArray)

        while (isStillSad(tempArray)) {
            tempArray = makeHappy(tempArray)
        }

        return tempArray.toIntArray()
    }

    private fun makeHappy(array: ArrayList<Int>): ArrayList<Int> {
        val newArray = ArrayList<Int>()

        for (i in 0 until array.size){
            if (i == 0 || i == array.size-1) { newArray.add(array[i])}
            else {
                if ((array[i-1] + array[i+1]) > array[i]){
                    newArray.add(array[i])
                }
            }
        }
        return newArray
    }

    private fun isStillSad(array: ArrayList<Int>): Boolean{
        for (i in 1..array.size-2) {
            if ((array[i-1] + array[i+1]) < array[i]){
                return true
            }
        }
        return false
    }
}
