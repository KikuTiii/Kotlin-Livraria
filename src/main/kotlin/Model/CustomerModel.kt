package Model

import jakarta.persistence.*

@Entity(name = "customer")
data class CustomerModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null,

    @Column
    var name: String,

    @Column
    var email: String
)