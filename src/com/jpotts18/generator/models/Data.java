package com.jpotts18.generator.models;

import java.util.ArrayList;
import java.util.List;

import static com.jpotts18.generator.models.Access.*;
import static com.jpotts18.generator.models.DataType.*;

/**
 * Created by jpotts18 on 9/19/14.
 */
public class Data {

    public static AmazingModel getCarModel(){

        String modelName = "Car";

        AmazingModel carModel = new AmazingModel(Access.PRIVATE, "Car", getCarPropertyList(), getCarMethodList());

        return carModel;

    }

    public static List<Property> getCarPropertyList(){

        List<Property> propertyList = new ArrayList<Property>();

        Property id = new Property(PRIVATE, "int", "id");
        Property name = new Property(PRIVATE, "String", "name");
        Property color = new Property(PRIVATE, "String", "color");
        Property year = new Property(PRIVATE, INT, "year");
        Property isFast = new Property(PRIVATE, BOOLEAN, "isFast");
        Property mpg = new Property(PRIVATE, FLOAT, "milesPerGallon");

        propertyList.add(id);
        propertyList.add(name);
        propertyList.add(color);
        propertyList.add(year);
        propertyList.add(isFast);
        propertyList.add(mpg);

        return propertyList;
    }

    public static List<Method> getCarMethodList(){
        List<Method> methodList = new ArrayList<Method>();

        Method getName = new Method(PUBLIC, "String", "getName");

        Arguments arguments = new Arguments("String", "name");
        List<Arguments> nameArgs = new ArrayList<Arguments>();
        nameArgs.add(arguments);

        Method setName = new Method(PUBLIC, "void", "setName", nameArgs);

        Method getColor = new Method(PUBLIC, "String", "getColor");
        Method privateColor = new Method(PRIVATE, "String", "privateColor");

        Arguments arguments1 = new Arguments("String", "color");
        List<Arguments> colorArgs = new ArrayList<Arguments>();
        colorArgs.add(arguments1);

        Method setColor = new Method(PUBLIC, "void", "setColor", colorArgs);

        methodList.add(getName);
        methodList.add(setName);
        methodList.add(getColor);
        methodList.add(setColor);
        methodList.add(privateColor);

        return methodList;
    }
}
