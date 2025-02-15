package estudos.livraria.controller

import estudos.livraria.controller.request.PostBookRequest
import estudos.livraria.service.BookService
import estudos.livraria.service.CustomerService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(
    val bookService: BookService,
    val customerService: CustomerService
) {

    @PostMapping
    fun create(@RequestBody request: PostBookRequest) {

    }
}