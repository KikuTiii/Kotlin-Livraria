package estudos.livraria.extension

import Model.BookModel
import Model.CustomerModel
import estudos.livraria.controller.request.PostBookRequest
import estudos.livraria.controller.request.PostCustomerRequest
import estudos.livraria.controller.request.PutBookRequest
import estudos.livraria.controller.request.PutCustomerRequest
import estudos.livraria.enums.BookStatus
import estudos.livraria.enums.CustomerStatus

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.name, status = CustomerStatus.ATIVO)
}

fun PutCustomerRequest.toCustomerModel(previousValue: CustomerModel): CustomerModel {
    return CustomerModel(id = this.id, name = this.name, email = this.email, status = previousValue.status)
}

fun PostBookRequest.toBookModel(customer: CustomerModel): BookModel {
    return BookModel(
        name = this.name,
        price = this.price,
        status = BookStatus.ATIVO,
        customer = customer
    )
}

fun PutBookRequest.toBookModel(previousValue: BookModel): BookModel {
    return BookModel(
        id = previousValue.id,
        name = this.nome ?: previousValue.name,
        price = this.price ?: previousValue.price,
        status = previousValue.status,
        customer = previousValue.customer
    )
}