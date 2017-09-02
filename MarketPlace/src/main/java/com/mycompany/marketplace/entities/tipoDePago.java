/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author IAN
 */
@Entity
public class tipoDePago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoDePago;
    private String TipoDePago;

    public Long getIdTipoDePago() {
        return idTipoDePago;
    }

    public void setIdTipoDePago(Long idTipoDePago) {
        this.idTipoDePago = idTipoDePago;
    }

    public String getTipoDePago() {
        return TipoDePago;
    }

    public void setTipoDePago(String TipoDePago) {
        this.TipoDePago = TipoDePago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDePago != null ? idTipoDePago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof tipoDePago)) {
            return false;
        }
        tipoDePago other = (tipoDePago) object;
        if ((this.idTipoDePago == null && other.idTipoDePago != null) || (this.idTipoDePago != null && !this.idTipoDePago.equals(other.idTipoDePago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.marketplace.entities.tipoDePago[ id=" + idTipoDePago + " ]";
    }

}
