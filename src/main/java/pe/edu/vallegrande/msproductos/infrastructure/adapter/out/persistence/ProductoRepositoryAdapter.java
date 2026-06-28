package pe.edu.vallegrande.msproductos.infrastructure.adapter.out.persistence;

import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.msproductos.application.port.out.ProductoRepositoryPort;
import pe.edu.vallegrande.msproductos.domain.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ProductoRepositoryAdapter implements ProductoRepositoryPort {

    private final ProductoRepository repository;

    public ProductoRepositoryAdapter(ProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Flux<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Producto> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Producto> save(Producto product) {
        return repository.save(product);
    }

    @Override
    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }

}
