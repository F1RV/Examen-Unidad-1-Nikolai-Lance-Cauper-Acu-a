/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nc.NCAUPER.entity;

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
@Table (name= "categoria" )

public class Categoria {
@Id
@Column(name= "cat_id")
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long catId;

@Column(name = "cat_nombre")
private String catNombre; 

@Column(name = "cat_descripcion")
private String catDescripcion; 




}
