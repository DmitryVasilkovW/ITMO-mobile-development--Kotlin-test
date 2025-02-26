fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
        return customers.all { it.city == city }
}

fun Shop.hasCustomerFrom(city: City): Boolean {
        return customers.any { it.city == city }
}

fun Shop.countCustomersFrom(city: City): Int {
        return customers.count { it.city == city }
}

fun Shop.findCustomerFrom(city: City): Customer? {
        return customers.find { it.city == city }
}
