package com.jpotts18.generator;

import com.jpotts18.generator.models.Data;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.io.StringWriter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

            /*  first, get and initialize an engine  */
        VelocityEngine ve = new VelocityEngine();
        ve.init();

        /*  next, get the Template  */

        Template t = null;

        try {
//            t = ve.getTemplate("./src/com/jpotts18/generator/resources/java_class.vm");
//            t = ve.getTemplate("./src/com/jpotts18/generator/resources/js_class.vm");
//            t = ve.getTemplate("./src/com/jpotts18/generator/resources/python_class.vm");
//            t = ve.getTemplate("./src/com/jpotts18/generator/resources/php_class.vm");
//            t = ve.getTemplate("./src/com/jpotts18/generator/resources/objc_class.vm");
            t = ve.getTemplate("./src/com/jpotts18/generator/resources/ruby_class.vm");
        } catch (ResourceNotFoundException e){
            e.printStackTrace();
        }

        /*  create a context and add data */
        VelocityContext context = new VelocityContext();
        context.put("packageName", "com.jpotts18.generator");
        context.put("username", "jpotts18");
        context.put("date", new Date().toString());

        context.put("model", Data.getCarModel());

//        context.put("modelName", "User");
//        context.put("propertyType", "List");
//        context.put("propertyModel", "Property");
//        context.put("propertyName", "propertyList");

        /* now render the template into a StringWriter */
        StringWriter writer = new StringWriter();
        t.merge( context, writer );
        /* show the World */
        System.out.println( writer.toString() );

        System.exit(0);

    }
}
