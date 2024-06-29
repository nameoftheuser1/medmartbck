package com.pioneers.medmartbck.NotFoundException;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id){
        super("Could not found product with " + id );
    }
    
}
