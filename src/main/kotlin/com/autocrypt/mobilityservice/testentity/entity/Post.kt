package com.autocrypt.mobilityservice.testentity.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table
class Post (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column(nullable = false)
        var title: String = "",

        @Column(nullable = false, columnDefinition = "TEXT")
        var content: String = "",

        @Column
        var type: BoardType = BoardType.COMMON,

        @Column(nullable = false)
        val createDate: LocalDateTime = LocalDateTime.now(),

        @Column(nullable = false)
        var updated: LocalDateTime = LocalDateTime.now()
) {
        enum class BoardType(
                type: String
        ) {
                COMMON("일반"),
                LOCK("잠금")
        }
}