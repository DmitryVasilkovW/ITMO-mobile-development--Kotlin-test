fun Shop.getCustomerWithMaxOrders(): Customer? {
        return customers.maxByOrNull { it.orders.size }
}

fun getMostExpensiveProductBy(customer: Customer): Product? {
        return customer.orders.flatMap { it.products }
                .maxByOrNull(Product::price)
}
