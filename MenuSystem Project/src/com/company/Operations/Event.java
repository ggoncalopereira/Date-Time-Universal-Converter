package com.company.Operations;

@FunctionalInterface
public interface Event<T>
{
    T Run();
    default T Execute() throws Exception {
        T result = Run();
        if(result == null)
            throw new Exception();
        return result;
    }
}

