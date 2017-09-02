/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.marketplace.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author IAN
 */
@Entity
public class factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura;
    private Date fechaCompra;
    private int precioTotal;
    private List<Object> productosCompra = new ArrayList<>();;
    private List<Object> tipoTarjeta = new ArrayList<>();;

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public List<Object> getProductosCompra() {
        return productosCompra;
    }

    public void setProductosCompra(List<Object> productosCompra) {
        this.productosCompra = productosCompra;
    }

    public List<Object> getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(List<Object> tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof factura)) {
            return false;
        }
        factura other = (factura) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.marketplace.entities.Factura[ id=" + idFactura + " ]";
    }

}
