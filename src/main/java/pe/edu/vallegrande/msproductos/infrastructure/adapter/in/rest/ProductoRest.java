package pe.edu.vallegrande.msproductos.infrastructure.adapter.in.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.vallegrande.msproductos.application.port.in.ProductoServicePort;
import pe.edu.vallegrande.msproductos.domain.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/productos")
public class ProductoRest {

    private final ProductoServicePort servicePort;

    public ProductoRest(ProductoServicePort servicePort) {
        this.servicePort = servicePort;
    }

    @GetMapping
    public Flux<Producto> findAll() {
        return servicePort.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Producto> findById(@PathVariable Long id) {
        return servicePort.findById(id);
    }

    @PostMapping
    public Mono<Producto> save(@RequestBody Producto producto) {
        return servicePort.save(producto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return servicePort.delete(id);
    }

}
