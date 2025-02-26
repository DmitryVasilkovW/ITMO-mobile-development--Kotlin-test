class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            private var current = start

            override fun hasNext(): Boolean {
                return current <= end
            }

            override fun next(): MyDate {
                if (!hasNext()) {
                    throw NoSuchElementException()
                }
                val result = current
                current = current.followingDate() // Get the next date
                return result
            }
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}