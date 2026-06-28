package pe.edu.vallegrande.mspedidos.application.port.out;

import org.springframework.stereotype.Repository;

import pe.edu.vallegrande.mspedidos.domain.model.Producto;
import reactor.core.publisher.Mono;

@Repository
public interface IProductoClientPort {

    Mono<Producto> findById(Long id);  
    Mono<Producto> decreaseStack(Long id, Integer quantity); 
}