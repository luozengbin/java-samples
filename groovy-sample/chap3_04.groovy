#!/usr/bin/env groovy

a = 1
def b = 2
def foo() {
    println a    // => 1
    println b    // => groovy.lang.MissingPropertyException: No such property: b for class: ch03_04
}

foo()
