package com.interfaces;

import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUDImpl cocheCRUD);

    List<CocheCRUDImpl> findAll();

    void delete(CocheCRUDImpl cocheCRUD);

}
