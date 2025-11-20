package es.daw.productoapirest.exception;

public class ProductoNotFoundException extends RuntimeException{
    public ProductoNotFoundException(String id){
        super("No se puede encontrar el producto con el id: " + id);
    }
}
