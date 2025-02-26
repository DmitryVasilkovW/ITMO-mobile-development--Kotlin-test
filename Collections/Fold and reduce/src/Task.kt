fun Shop.getProductsOrderedByAll(): Set<Product> {
    return customers.map { it.getOrderedProducts() }
        .reduce { acc, customerProducts -> acc.intersect(customerProducts) }
}

fun Customer.getOrderedProducts(): Set<Product> {
    return orders.flatMap { it.products }
        .toSet()
}
