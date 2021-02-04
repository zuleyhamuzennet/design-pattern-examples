package com.ba.designpattern.template.compiler;

public abstract class CrossCompiler {
    public final void crossCompile(){
        collectSource();
        compileToTarget();
    }

    protected abstract void compileToTarget();
    protected abstract void collectSource();
}
