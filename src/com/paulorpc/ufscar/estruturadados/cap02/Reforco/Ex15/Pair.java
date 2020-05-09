package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex15;

public class Pair <A,B> {

    A a;
    B b;

    Pair(A a, B b){
        set(a, b);
    }

    public void set(A a, B b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return "[" + a.toString() + ", " + b.toString() + "]";
    }

}
