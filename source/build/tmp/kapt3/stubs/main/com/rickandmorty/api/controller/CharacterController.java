package com.rickandmorty.api.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0017J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\tH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/rickandmorty/api/controller/CharacterController;", "", "repositoryService", "Lcom/rickandmorty/api/service/CharacterService;", "(Lcom/rickandmorty/api/service/CharacterService;)V", "getRepositoryService", "()Lcom/rickandmorty/api/service/CharacterService;", "characterJson", "", "Lcom/rickandmorty/api/entity/Character;", "saveCharacters", "Lorg/springframework/http/ResponseEntity;", "", "updateCharacter", "character", "Companion", "api"})
@org.springframework.web.bind.annotation.CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"characters"})
@org.springframework.web.bind.annotation.RestController
public class CharacterController {
    @org.jetbrains.annotations.NotNull
    private final com.rickandmorty.api.service.CharacterService repositoryService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.rickandmorty.api.controller.CharacterController.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHARACTER_URL = "https://rickandmortyapi.com/api/character";
    
    public CharacterController(@org.jetbrains.annotations.NotNull
    com.rickandmorty.api.service.CharacterService repositoryService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.rickandmorty.api.service.CharacterService getRepositoryService() {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/rickandmorty/api/controller/CharacterController$Companion;", "", "()V", "CHARACTER_URL", "", "api"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}