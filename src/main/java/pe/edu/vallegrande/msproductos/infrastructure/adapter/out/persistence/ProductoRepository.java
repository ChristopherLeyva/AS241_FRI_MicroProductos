package pe.edu.vallegrande.msproductos.infrastructure.adapter.out.persistence;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.msproductos.domain.model.Producto;
import reactor.core.publisher.Flux;

public interface ProductoRepository extends ReactiveCrudRepository<Producto, Long> {

    Flux<Producto> findByActiveTrue();
}
