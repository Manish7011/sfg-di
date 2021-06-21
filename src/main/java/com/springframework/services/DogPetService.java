package com.springframework.services;
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
