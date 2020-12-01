/*
    ___
    OOP - is a methodology of designing programs using objects and classes.
    4 main OOP concepts in Java:
    - Abstraction
    - Encapsulation
    - Inheritance
    - Polymorphism

    _____
    Class - is a blueprint for creating objects.

    Object - is an instance of a class.
    Objects inherit all of the attributes (variables) and methods of the class.
    We use dot(.) syntax to access/modify these attributes (if they are not final).

    Object has state (attributes), behavior (methods), identity (special name).

    static method - means we can access it w/o creating an object of that class,
                    because static is not a part of an object, but a part of a class.

    Constructor - is a special method (no return) used to initialise objects.
                    it can be used to set initial values for object attributes.

    Methods:
    1. private - helper methods, used to organise the code and keep it simple and readable
    2. public -  actual actions that the class can perform


    _____________
    Encapsulation - to make sure the sensitive data is hidden from the users.

                    To achieve this, we declare class variables/attributes as private,
                    and provide public getters and setters for this private variables
                    to access/modify them from other classes.

                    reason = security && better control in class interactions



    Access Modifiers -
    are used to set the access level for classes, attributes, methods and constructors.

    For classes:
    1. public     | (everywhere)
    2. default    | (inside one package)

    For all other:
    1. public     | (eveywhere)
    2. private    | (inside one class)
    3. default    | (inside one package)
    4. protected  | (inside one package and the same subclasses)


    Non-access modifiers - do not control access level. (don't work with constructors)

    For classes:
    1. final      | this class can't be inherited
    2. abstract   | this class can't be used to create objects

    For all other:
    1. final      | can't be overriden/modified
    2. static     | belong to the class, rather than to the object (used for a constant variable or a method that is same for every instance of a class, advnatge: memory management)
    3. abstract   | no body part (abstract method can only be used in abstract class)
    4. transient  | attributes and methods are skipped when serializing the object containing them
    5. synchronised | can only  be access by one single thread at a time
    6. volatile    | guarantees the visibility of the avriable for other threads of writes to that variable


    ___________
    Inheritance - when one class (child) inherits some attributes and methods from another class (parent).
                - extends keyword.

                reason = reusability

                - in parent class we use protected attributes instead of private.

                - use final class to protect class from being inherited.

                - Java doesn't support multiple inheritence, because of ambigutity that comes from
                    finding the right method out of two that came from two parent classes.

                    Instead use Interfaces. If there are two same names methods in
                    interfaces, we explicitly specify which we are going to use.

                - Child class does't have to override all of the methods of a parent class

    ____________
    Polymorphism - use the same word to mean different things in different contexts.

                    reason = reusability

                    allow us to perform a single action in different ways

                    overloading - multple methods have the same name, but with different parameters
                    overriding - child class overrides method that are inherited from a parent class or from interface.

    ___________
    Abstraction - is the process of hiding certain details and showing only essential information
                    to the user. We use either abstract classes or interfaces for that.

                    reason = security && avoid repeating the same code


                    Abstract class - is a class that can't be used to create objects.
                                    It can have both abstract and non-abstract methods.
                                    To access this class, it must be inherited.

                    Abstract method - can be used only in abstract class and it doesn't have a body.

                    Interface - is a completely abstract class with only abstract methods.
                            - interface && implements keywords.

                            - it defines what should be implemented, but not how.

                            - can't be used to create objects
                            - when we implement interface, we must override all of its methods
                            - interface can't have a constructor (as it can't be instantiated)
                            - interface methods by default are public and abstract

                            reason = security && instead of multiple inheritance


*/
