package com.example.employee.structure;

public interface EntityConverter<T extends DTO, U extends DAO> {
    
    public T convert(U u);

    public U convert(T t);

}
