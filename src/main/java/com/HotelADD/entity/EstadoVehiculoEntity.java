/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "tb_estadosvehiculos", schema = "servicios")
public class EstadoVehiculoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estadovehiculo_id")
    private Long estadoVehiculoId;
    
    @Column(name = "estadovehiculo_descripcion")
    private String estadoVehiculoDescripcion;
    
    @OneToMany(mappedBy = "estadoVehiculoFk")
    private List<VehiculoEntity> vehiculo;

    public Long getEstadoVehiculoId() {
        return estadoVehiculoId;
    }

    public void setEstadoVehiculoId(Long estadoVehiculoId) {
        this.estadoVehiculoId = estadoVehiculoId;
    }

    public String getEstadoVehiculoDescripcion() {
        return estadoVehiculoDescripcion;
    }

    public void setEstadoVehiculoDescripcion(String estadoVehiculoDescripcion) {
        this.estadoVehiculoDescripcion = estadoVehiculoDescripcion;
    }
    
}
