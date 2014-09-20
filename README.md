Generator
=========

This is a model generator that creates objects in the following languages:

* Java
* JavaScript
* Objective-c
* Python
* PHP

## Getting Started

```java

    // Create properties
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

    // Create methods
    List<Method> methodList = new ArrayList<Method>();

    Method getName = new Method(PUBLIC, "String", "getName");

    Arguments arguments = new Arguments("String", "name");
    List<Arguments> nameArgs = new ArrayList<Arguments>();
    nameArgs.add(arguments);

    Method setName = new Method(PUBLIC, "void", "setName", nameArgs);

    Method getColor = new Method(PUBLIC, "String", "getColor");

    Arguments arguments1 = new Arguments("String", "color");
    List<Arguments> colorArgs = new ArrayList<Arguments>();
    colorArgs.add(arguments1);

    Method setColor = new Method(PUBLIC, "void", "setColor", colorArgs);

    methodList.add(getName);
    methodList.add(setName);
    methodList.add(getColor);
    methodList.add(setColor);

    // Create a new model
    AmazingModel carModel = new AmazingModel(Access.PRIVATE, "Car", propertyList, methodList;


```




## Java

```java

package com.jpotts18.generator;

/**
 * Created by jpotts18 on Sat Sep 20 11:41:26 MDT 2014.
 */
private class Car {

    private int id;
    private String name;
    private String color;
    private int year;
    private boolean isFast;
    private float milesPerGallon;

    public String getName() {
        return
    }
    public void setName(String name) {
        return
    }
    public String getColor() {
        return
    }
    public void setColor(String color) {
        return
    }

}

```

## Javascript

```javascript

function Car {
    this.id = ''
    this.name = ''
    this.color = ''
    this.year = ''
    this.isFast = ''
    this.milesPerGallon = ''
}

Car.prototype.getName = function(){
    return
}

Car.prototype.setName = function(){
    return
}

Car.prototype.getColor = function(){
    return
}

Car.prototype.setColor = function(){
    return
}

```

#Python

```python
class Car(object):

    _id = ''
    _name = ''
    _color = ''
    _year = ''
    _isFast = ''
    _milesPerGallon = ''

    def getName(self):
        return

    def setName(self, <args>):
        return

    def getColor(self):
        return

    def setColor(self, <args>):
        return

```

# PHP

```php

<?php

/**
 * Define Car
 */

class Car {
    private $id = '';
    private $name = '';
    private $color = '';
    private $year = '';
    private $isFast = '';
    private $milesPerGallon = '';

    public function getName() {
        return
    }
    public function setName(<args>) {
        return
    }
    public function getColor() {
        return
    }
    public function setColor(<args>) {
        return
    }

}
```
