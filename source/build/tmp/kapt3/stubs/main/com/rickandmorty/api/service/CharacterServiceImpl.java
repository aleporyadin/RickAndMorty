package com.rickandmorty.api.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/rickandmorty/api/service/CharacterServiceImpl;", "Lcom/rickandmorty/api/service/CharacterService;", "()V", "repository", "Lcom/rickandmorty/api/repository/CharacterRepository;", "getRepository", "()Lcom/rickandmorty/api/repository/CharacterRepository;", "setRepository", "(Lcom/rickandmorty/api/repository/CharacterRepository;)V", "deleteAllCharacter", "", "deleteCharacter", "id", "", "getCharacterByFirstName", "", "Lcom/rickandmorty/api/entity/Character;", "name", "", "getCharacterById", "getCharacters", "saveCharacter", "character", "saveCharacters", "characters", "updateCharacter", "api"})
@org.springframework.stereotype.Service
public class CharacterServiceImpl implements com.rickandmorty.api.service.CharacterService {
    @org.springframework.beans.factory.annotation.Autowired
    public com.rickandmorty.api.repository.CharacterRepository repository;
    
    public CharacterServiceImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.rickandmorty.api.repository.CharacterRepository getRepository() {
        return null;
    }
    
    public void setRepository(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.repository.CharacterRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.rickandmorty.api.entity.Character saveCharacter(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.entity.Character character) {
        return null;
    }
    
    @java.lang.Override
    public void saveCharacters(@org.jetbrains.annotations.NotNull
    java.util.List<com.rickandmorty.api.entity.Character> characters) {
    }
    
    @java.lang.Override
    public void deleteCharacter(int id) {
    }
    
    @java.lang.Override
    public void deleteAllCharacter() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.rickandmorty.api.entity.Character getCharacterById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.rickandmorty.api.entity.Character> getCharacters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.rickandmorty.api.entity.Character> getCharacterByFirstName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override
    public void updateCharacter(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.entity.Character character) {
    }
}