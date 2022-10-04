/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nc.NCAUPER.Service;

import java.util.List;

import nc.NCAUPER.entity.Producto;

/**
 *
 * @author HP
 */
public interface ProductoService {
    
public List<Producto> findAll();

public Producto findById( Long id);

public Producto save (Producto producto);

public void delete (Producto producto);

public void deleteById (Long id);


}