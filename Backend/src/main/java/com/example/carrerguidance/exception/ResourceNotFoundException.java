package com.example.carrerguidance.exception;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String career, String id, long id1) {
        super(career + " not found with id " + id + " " + id1);
    }

    public ResourceNotFoundException(String career, String careerName, String careerName1) {
        super(career + " not found with careerName " + careerName + " " + careerName1);
    }
}
