fun moneySpentBy(customer: Customer): Double {
        return customer.orders.flatMap { it.products }
                .sumOf { it.price }
}
