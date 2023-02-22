package com.ProyectoIntegrador.demo.service;

import com.ProyectoIntegrador.demo.exception.BadRequestException;
import com.ProyectoIntegrador.demo.exception.ResourceNotFoundException;
import com.ProyectoIntegrador.demo.model.Categoria;
import com.ProyectoIntegrador.demo.repository.CategoriaRepository;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    private static final Logger LOGGER = Logger.getLogger(CategoriaService.class);

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }


    public Categoria agregarCategoria(Categoria categoria) throws BadRequestException {
        LOGGER.info("Se inicio una operacion de guardado de la categoria con titulo " + categoria.getTitulo());
        return categoriaRepository.save(categoria);
    }

    public Categoria actualizarCategoria(Categoria categoria) throws BadRequestException{
        LOGGER.info("Se inicio una operacion de actualizado de categoria con ID= " + categoria.getId());
        return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> buscarCategoria(Long id) throws BadRequestException{
        LOGGER.info("Se inicio una operacion de busqueda de categoria con ID " + id);
        return categoriaRepository.findById(id);
    }


    public List<Categoria> listaCategoria(){
        LOGGER.info("Se inicio una operacion de listado de categorias ");
        return categoriaRepository.findAll();
    }

    public void eliminarCategoria(Long id) throws ResourceNotFoundException,BadRequestException {
        Optional<Categoria> categoriaAEliminar = buscarCategoria(id);
        if (categoriaAEliminar.isPresent()){
            categoriaRepository.deleteById(id);
            LOGGER.warn("Se realizo una operacion de eliminado de categoria con id " + id);
        }
        else {

            throw new ResourceNotFoundException("La categoria a eliminar no existe" +
                    " en la base de datos, se intentó encontrar sin éxito en id= "+id);
        }

    }
}
