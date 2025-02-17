package estudos.livraria.controller.request

import java.math.BigDecimal

data class PutBookRequest (
    var nome: String?,
    var price: BigDecimal?
)
