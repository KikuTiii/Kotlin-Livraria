package estudos.livraria.extension

import Model.BookModel
import Model.CustomerModel
import estudos.livraria.controller.request.PostBookRequest
import estudos.livraria.controller.request.PostCustomerRequest
import estudos.livraria.controller.request.PutBookRequest
import estudos.livraria.controller.request.PutCustomerRequest
import estudos.livraria.enums.BookStatus

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.name)
}

fun PutCustomerRequest.toCustomerModel(id: String): CustomerModel {
    return CustomerModel(id = this.id, name = this.name, email = this.name)
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