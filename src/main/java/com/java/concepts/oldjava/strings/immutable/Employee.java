package com.java.concepts.oldjava.strings.immutable;

public final class Employee { //class can not be subclassed but can be instantiated

    final String id;

    public Employee(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }
}

/*

The above class is immutable because:
    1) The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
    2) The class is final so we cannot create the subclass.
    3) There are no setter methods i.e. we have no option to change the value of the instance variable.

Final class cannot be inherited by any subclass, if we try to inherit a final class,
then the compiler throws an error during compilation.
*/
