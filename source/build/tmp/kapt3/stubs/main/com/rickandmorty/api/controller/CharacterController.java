package com.rickandmorty.api.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0017J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u000bH\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/rickandmorty/api/controller/CharacterController;", "", "()V", "repositoryService", "Lcom/rickandmorty/api/service/CharacterServiceImpl;", "getRepositoryService", "()Lcom/rickandmorty/api/service/CharacterServiceImpl;", "setRepositoryService", "(Lcom/rickandmorty/api/service/CharacterServiceImpl;)V", "characterJson", "", "Lcom/rickandmorty/api/entity/Character;", "parseJsonToObject", "", "resultsArray", "Lkotlinx/serialization/json/JsonElement;", "saveCharacters", "Lorg/springframework/http/ResponseEntity;", "", "updateCharacter", "character", "api"})
@org.springframework.web.bind.annotation.CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"characters"})
@org.springframework.web.bind.annotation.RestController
public class CharacterController {
    @org.springframework.beans.factory.annotation.Autowired
    public com.rickandmorty.api.service.CharacterServiceImpl repositoryService;
    
    public CharacterController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.rickandmorty.api.service.CharacterServiceImpl getRepositoryService() {
        return null;
    }
    
    public void setRepositoryService(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.service.CharacterServiceImpl p0) {
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