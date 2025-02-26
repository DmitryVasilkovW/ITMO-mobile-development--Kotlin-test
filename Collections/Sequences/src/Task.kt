fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer.orders
        .asSequence()
        .filter { it.isDelivered }
        .flatMap { it.products.asSequence() }
        .maxByOrNull { it.price }
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers
        .asSequence()
        .flatMap { it.getOrderedProducts().asSequence() }
        .count { it == product }
}

fun Customer.getOrderedProducts(): Sequence<Product> {
    return orders.asSequence()
        .flatMap { it.products.asSequence() }
}
