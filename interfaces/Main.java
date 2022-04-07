package com.interfaces;

public class Main {

        static CocheCRUD cocheCRUD;

        public static void main (String[] args){

                cocheCRUD.findAll();
                cocheCRUD.save(new CocheCRUDImpl());
                cocheCRUD.delete(new CocheCRUDImpl());
        }

        }


