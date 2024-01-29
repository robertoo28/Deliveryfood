package com.example.appdeliveryfood.Cliente;

import com.example.appdeliveryfood.Modelo.Contabilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.persistence.*;

@Repository
public interface ContabilidadRepository extends JpaRepository <Contabilidad,Long>{

}
