package com.rickandmorty.api.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u001a"}, d2 = {"Lcom/rickandmorty/api/service/CharacterService;", "", "repository", "Lcom/rickandmorty/api/repository/CharacterRepository;", "(Lcom/rickandmorty/api/repository/CharacterRepository;)V", "getRepository", "()Lcom/rickandmorty/api/repository/CharacterRepository;", "setRepository", "deleteAllCharacter", "", "deleteCharacter", "id", "", "getCharacterByFirstName", "", "Lcom/rickandmorty/api/entity/Character;", "name", "", "getCharacterById", "getCharacters", "saveCharacter", "character", "saveCharacters", "characters", "", "updateCharacter", "api"})
@org.springframework.stereotype.Service
public class CharacterService {
    @org.jetbrains.annotations.NotNull
    private com.rickandmorty.api.repository.CharacterRepository repository;
    
    public CharacterService(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.repository.CharacterRepository repository) {
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
    public com.rickandmorty.api.entity.Character saveCharacter(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.entity.Character character) {
        return null;
    }
    
    public void saveCharacters(@org.jetbrains.annotations.NotNull
    java.util.List<com.rickandmorty.api.entity.Character> characters) {
    }
    
    public void deleteCharacter(int id) {
    }
    
    public void deleteAllCharacter() {
    }
    
    @org.jetbrains.annotations.NotNull
    public com.rickandmorty.api.entity.Character getCharacterById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.rickandmorty.api.entity.Character> getCharacters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.rickandmorty.api.entity.Character> getCharacterByFirstName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    public void updateCharacter(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.entity.Character character) {
    }
}