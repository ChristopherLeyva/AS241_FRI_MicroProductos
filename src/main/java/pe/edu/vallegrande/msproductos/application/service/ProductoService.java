package pe.edu.vallegrande.msproductos.application.service;

import org.springframework.stereotype.Service;
import pe.edu.vallegrande.msproductos.application.port.in.ProductoServicePort;
import pe.edu.vallegrande.msproductos.application.port.out.ProductoRepositoryPort;
import pe.edu.vallegrande.msproductos.domain.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoService implements ProductoServicePort {

    private final ProductoRepositoryPort repositoryPort;

    public ProductoService(ProductoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    public Flux<Producto> findAll() {
        return repositoryPort.findAll();
    }

    @Override
    public Mono<Producto> findById(Long id) {
        return repositoryPort.findById(id);
    }

    @Override
    public Mono<Producto> save(Producto product) {
        return repositoryPort.save(product);
    }

    @Override
    public Mono<Void> delete(Long id) {
        return repositoryPort.deleteById(id);
    }

}
