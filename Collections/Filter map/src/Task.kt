fun Shop.getCustomerCities(): Set<City> {
        return customers.map { it.city }
                .toSet()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
        return customers.filter { it.city == city }
}