fun Shop.nameToCustomerMap(): Map<String, Customer> {
        return customers.associateBy { it.name }
}

fun Shop.customerToCityMap(): Map<Customer, City> {
        return customers.associateWith { it.city }
}

fun Shop.customerNameToCityMap(): Map<String, City> {
        return customers.associate { it.name to it.city }
}
