package com.interfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

        //1. atributos
        String marca;
        String modelo;
        int año;
        double precio;
        boolean gasolina;

        //2. constructores
        public CocheCRUDImpl(){}

        public CocheCRUDImpl(String marca, String modelo, int año, double precio, boolean gasolina){
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
            this.precio = precio;
            this.gasolina = gasolina;
        }
        //3. metodos


    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                ", gasolina=" + gasolina +
                '}';
    }

    @Override
    public void save(CocheCRUDImpl cocheCRUD) {

    }

    @Override
    public List<CocheCRUDImpl> findAll() {
        return null;
    }

    @Override
    public void delete(CocheCRUDImpl cocheCRUD) {

    }
}
