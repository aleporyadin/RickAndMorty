package com.rickandmorty.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data
import javax.persistence.*

@Entity
@Table(name="`character`")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Character(id: Int?,  name: String?,  status: String?,  species: String?, type: String?, gender: String?){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int?=id
    @Column(name = "`name`")
    val name: String?=name
    @Column(name="`status`")
    val status: String?=status
    @Column(name="`species`")
    val species: String?=species
    @Column(name="`type`")
    val type: String?=type
    @Column(name="`gender`")
    val gender: String?=gender

}