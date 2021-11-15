package com.rickandmorty.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data
import javax.persistence.*

@Entity
@Table(name="`character`")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Character(id: Int?,  name: String?="",  status: String?="",  species: String?="", type: String?="", gender: String?=""){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Int?=id
    @Column(name = "`name`")
    var name: String?=name
    @Column(name="`status`")
    var status: String?=status
    @Column(name="`species`")
    var species: String?=species
    @Column(name="`type`")
    var type: String?=type
    @Column(name="`gender`")
    var gender: String?=gender

}