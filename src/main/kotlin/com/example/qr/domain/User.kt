package com.example.qr.domain

import javax.persistence.*

@Table(name = "tbl_user")
@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
)