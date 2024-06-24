package com.example.shoppingapptechwarriorsteam.data.order

sealed class OrderStatus(val status: String) {


    object Canceled: OrderStatus("Canceled")
    object Confirmed: OrderStatus("Confirmed")
    object Shipped: OrderStatus("Shipped")
    object Delivered: OrderStatus("Delivered")
    object Returned: OrderStatus("Returned")
    object Ordered: OrderStatus("Ordered")
}
fun getOrderStatus(status: String): OrderStatus {
    return when (status) {
        "Ordered" -> {
            OrderStatus.Ordered
        }
        "Canceled" -> {
            OrderStatus.Canceled
        }
        "Confirmed" -> {
            OrderStatus.Confirmed
        }
        "Shipped" -> {
            OrderStatus.Shipped
        }
        "Delivered" -> {
            OrderStatus.Delivered
        }
        else -> OrderStatus.Returned
    }
}