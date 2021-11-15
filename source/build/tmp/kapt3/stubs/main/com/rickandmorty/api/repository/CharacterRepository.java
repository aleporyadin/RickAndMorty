package com.rickandmorty.api.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/rickandmorty/api/repository/CharacterRepository;", "Lorg/springframework/data/repository/CrudRepository;", "Lcom/rickandmorty/api/entity/Character;", "", "deleteById", "", "id", "findByName", "", "name", "", "api"})
@org.springframework.stereotype.Repository
public abstract interface CharacterRepository extends org.springframework.data.repository.CrudRepository<com.rickandmorty.api.entity.Character, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.rickandmorty.api.entity.Character> findByName(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    @java.lang.Override
    public abstract void deleteById(int id);
}