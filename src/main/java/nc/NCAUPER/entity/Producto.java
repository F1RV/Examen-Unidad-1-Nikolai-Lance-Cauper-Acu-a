/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nc.NCAUPER.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP
 */
@Entity
@Data
@Table (name= "producto" )

public class Producto implements Serializable {
@Id
@Column(name= "prod_id")
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long persId;

@Column(name = "prod_nombre")
private String prodNombre; 

@Column(name = "prod_precio")
private String prodPrecio; 

@Column(name = "prod_stock")
private String prodstock; 



@ManyToOne
@JoinColumn(name = "cat_id")
private Categoria categoria;



}