package estudos.livraria.repository

import Model.BookModel
import estudos.livraria.enums.BookStatus
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<BookModel, Int> {
    fun findByStatus(status: BookStatus): List<BookModel>
}