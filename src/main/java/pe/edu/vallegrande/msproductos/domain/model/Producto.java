package pe.edu.vallegrande.msproductos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("productos")
public class Producto {

    @Id
    private Long id;
    private String codigo;
    private String nombre;
    private Double precio;
    private Integer stock;

}
