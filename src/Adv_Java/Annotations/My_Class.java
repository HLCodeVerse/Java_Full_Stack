package Adv_Java.Annotations;

import java.lang.reflect.Method;

public class My_Class {
    @MyCustomeAnnotation ( value = 10  )
    public void sayHello() {
        System.out.println ("My costume annotation" );
    }
    public static void main ( String[] args ) throws Exception {
        My_Class h=new My_Class();
        Method m=h.getClass ().getMethod("sayHello");
        MyCustomeAnnotation myCustomeAnnotation=m.getAnnotation ( MyCustomeAnnotation.class );
        System.out.println ("Value is"+ myCustomeAnnotation.value () );
    }
}
