package com.rickandmorty.api.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001d\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH&J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&\u00a8\u0006\u0015"}, d2 = {"Lcom/rickandmorty/api/service/CharacterService;", "", "deleteAllCharacter", "", "deleteCharacter", "id", "", "getCharacterByFirstName", "", "Lcom/rickandmorty/api/entity/Character;", "name", "", "getCharacterById", "getCharacters", "", "saveCharacter", "character", "saveCharacters", "characters", "", "updateCharacter", "api"})
@org.springframework.stereotype.Service
public abstract interface CharacterService {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.rickandmorty.api.entity.Character saveCharacter(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.entity.Character character);
    
    public abstract void saveCharacters(@org.jetbrains.annotations.NotNull
    java.util.List<com.rickandmorty.api.entity.Character> characters);
    
    public abstract void deleteCharacter(int id);
    
    public abstract void deleteAllCharacter();
    
    @org.jetbrains.annotations.Nullable
    public abstract com.rickandmorty.api.entity.Character getCharacterById(int id);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Iterable<com.rickandmorty.api.entity.Character> getCharacters();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.rickandmorty.api.entity.Character> getCharacterByFirstName(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract void updateCharacter(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.entity.Character character);
}