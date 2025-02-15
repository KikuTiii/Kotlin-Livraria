package estudos.livraria.service

import Model.BookModel
import estudos.livraria.enums.BookStatus
import estudos.livraria.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRepository
) {
    fun create(book: BookModel) {
        bookRepository.save(book)
    }

    fun findActives(): List<BookModel> {
        return bookRepository.findByStatus(BookStatus.ATIVO)
    }

    fun findAll(): List<BookModel> {
        return bookRepository.findAll().toList()
    }

    fun findById(id: Int): BookModel {
        return bookRepository.findById(id).orElseThrow()
    }

    fun delete(id: Int) {
        val book = findById(id)

        book.status = BookStatus.CANCELADO

        bookRepository.save(book)
    }

}
