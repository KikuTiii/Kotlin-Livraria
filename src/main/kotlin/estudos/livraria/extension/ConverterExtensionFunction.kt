package estudos.livraria.extension

import Model.CustomerModel
import estudos.livraria.controller.request.PostCustomerRequest

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.name)
}