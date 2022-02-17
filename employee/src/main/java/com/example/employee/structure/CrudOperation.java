package com.example.employee.structure;

import java.util.List;


public interface CrudOperation<T,R> {
        
    public List<R> listEntity(); 

    public R updateEntity(T t) ;

    public R createEntity(T t);

    public R deleteEntity(String id);

}
