// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers.filter {
            val (above,below) = it.orders.partition { it.isDelivered }
            below.size > above.size
        }.toSet()
