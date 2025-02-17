package estudos.livraria.controller.request

data class PutCustomerRequest (
    var id: Int,
    var name: String,
    var email: String
)
