package com.robin;



public class A {

        void sum(String a){System.out.println("number arg method invoked");}

    }

    class B extends A{

        void sum(Object a){System.out.println("integer arg method invoked");}

        void print(Object a){System.out.println("Object arg method invoked");}
        void print(String a){System.out.println("String arg method invoked");}
      //void print(StringBuilder a){System.out.println("StringBuilder arg method invoked");}

        public static void main(String args[]){


           A obj3=new B();
            //overriding, dynamic binding, dynamic time polymorphism
            obj3.sum(null);

             B obj=new B();
             //overloading, static binding, compile time polymorphism
             obj.print(null);
        }

        Designing RESTFUL WEBSERVICE :
        First, a REST resource to GET list of all animals
        http://www.singtel.com/animals
        Next, a REST resource to GET details of an animal with "name" (Ex: Duck)
        http://www.singtel.com/animals/duck
        Representations:
        Here is an XML respresentation of GET response of an animal with "name"
        <animal>
        <type>bird</type>
        <name>duck</name>
        <swim>I am swimming</swim>
        <walk>I am walking</walk>
        <sing>Quack, quack</sing>
        <fly>I am flying</fly>
        </animal>
        OR
        A JSON respresentation of a response—GET animal from "name":
        {"animal":{"type":"bird","name":"duck","swim":"I am swimming","walk":"I am walking","sing":"Quack, quack","fly":"I am flying"}}

}
