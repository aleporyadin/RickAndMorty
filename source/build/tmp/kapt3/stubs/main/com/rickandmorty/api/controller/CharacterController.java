package com.rickandmorty.api.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0017J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\tH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/rickandmorty/api/controller/CharacterController;", "", "repositoryService", "Lcom/rickandmorty/api/service/CharacterServiceImpl;", "(Lcom/rickandmorty/api/service/CharacterServiceImpl;)V", "getRepositoryService", "()Lcom/rickandmorty/api/service/CharacterServiceImpl;", "characterJson", "", "Lcom/rickandmorty/api/entity/Character;", "parseJsonToObject", "", "resultsArray", "Lkotlinx/serialization/json/JsonElement;", "saveCharacters", "Lorg/springframework/http/ResponseEntity;", "", "updateCharacter", "character", "api"})
@org.springframework.web.bind.annotation.CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"characters"})
@org.springframework.web.bind.annotation.RestController
public class CharacterController {
    @org.jetbrains.annotations.NotNull
    private final com.rickandmorty.api.service.CharacterServiceImpl repositoryService = null;
    
    public CharacterController(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.service.CharacterServiceImpl repositoryService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.rickandmorty.api.service.CharacterServiceImpl getRepositoryService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public java.lang.Iterable<com.rickandmorty.api.entity.Character> characterJson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public org.springframework.http.ResponseEntity<java.lang.String> saveCharacters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PutMapping
    public org.springframework.http.ResponseEntity<java.lang.String> updateCharacter(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.rickandmorty.api.entity.Character character) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.rickandmorty.api.entity.Character> parseJsonToObject(@org.jetbrains.annotations.Nullable
    kotlinx.serialization.json.JsonElement resultsArray) {
        return null;
    }
}