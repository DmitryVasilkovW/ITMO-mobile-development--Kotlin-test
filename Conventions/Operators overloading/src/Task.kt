data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
    addTimeIntervals(timeInterval, 1)

data class TimeIntervalWithAmount(val timeInterval: TimeInterval, val amount: Int)

operator fun TimeInterval.times(n: Int): TimeIntervalWithAmount =
    TimeIntervalWithAmount(this, n)

operator fun MyDate.plus(intervalWithAmount: TimeIntervalWithAmount): MyDate =
    addTimeIntervals(intervalWithAmount.timeInterval, intervalWithAmount.amount)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
}
