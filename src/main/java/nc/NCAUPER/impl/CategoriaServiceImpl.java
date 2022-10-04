/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nc.NCAUPER.impl;

import java.util.List;
import nc.NCAUPER.Service.CategoriaService;
import nc.NCAUPER.entity.Categoria;
import nc.NCAUPER.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {



@Autowired   
CategoriaRepository categoriaRepository;

@Override
public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }


    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    
    }


    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void delete(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }

    @Override
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
