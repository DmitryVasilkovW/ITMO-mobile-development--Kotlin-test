fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer.orders
        .filter { it.isDelivered }
        .flatMap { it.products }
        .maxByOrNull { it.price }
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers
        .flatMap { it.getOrderedProducts() }
        .count { it == product }
}

fun Customer.getOrderedProducts(): List<Product> {
    return orders.flatMap { it.products }
}
