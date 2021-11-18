package com.rickandmorty.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data
import javax.persistence.*

@Entity
@Table(name="`character`")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Character(
    id : Int,
    @Column(name = "`name`") var name: String? = "",
    @Column(name = "`status`") var status: String? = "",
    @Column(name = "`species`") var species: String? = "",
    @Column(name = "`type`") var type: String? = "",
    @Column(name = "`gender`") var gender: String? = ""
) {
    @Id
    @Column(name = "`id`", nullable = false)
    var id: Int = id
}