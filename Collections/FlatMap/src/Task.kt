fun Customer.getOrderedProducts(): List<Product> {
        return orders.flatMap { it.products }
}

fun Shop.getOrderedProducts(): Set<Product> {
        return customers.flatMap { it.getOrderedProducts() }.toSet()
}
