/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.negocio;

/**
 *
 * @author Keiry
 */
public class ClsCalcuProm {
    
    private Double numb1;
    private Double numb2;

    public Double getNumb1() {
        return numb1;
    }

    public void setNumb1(Double numb1) {
        this.numb1 = numb1;
    }

    public Double getNumb2() {
        return numb2;
    }

    public void setNumb2(Double numb2) {
        this.numb2 = numb2;
    }

    public Double notaP1 (Double data1, Double data2) {
       this.numb1 = data1;
       this.numb2 = data2;
       return (data1*0.40) + (data2*0.60) ;
        
    }

    public Double notaP2 (Double data1, Double data2) {
        this.numb1 = data1;
        this.numb2 = data2;
        return (data1*0.40) + (data2*0.60) ;
    }
    
    public Double notaP3 (Double data1, Double data2) {
        this.numb1 = data1;
        this.numb2 = data2;
        return (data1*0.40) + (data2*0.60);
    }
    
}