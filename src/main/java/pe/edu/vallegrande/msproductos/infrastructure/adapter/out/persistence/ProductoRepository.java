package pe.edu.vallegrande.msproductos.infrastructure.adapter.out.persistence;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.msproductos.domain.model.Producto;

public interface ProductoRepository extends ReactiveCrudRepository<Producto, Long> {

}
