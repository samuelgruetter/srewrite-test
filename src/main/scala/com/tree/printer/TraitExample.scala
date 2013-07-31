package com.tree.printer

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 7/31/13
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
class TestClass1

class TestClass2(val a: String)

trait A

trait B extends TestClass1

trait C extends TestClass2

trait D extends B with A

