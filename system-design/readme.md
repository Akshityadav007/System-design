## Java

### Abstract class
- An abstract class is a restricted base class in object-oriented programming that cannot be instantiated (used to create objects) and is designed to be inherited by subclasses. 
- It acts as a blueprint, allowing for a mix of abstract methods (without bodies) and concrete methods (with implementations) to enforce a common, mandatory structure for child classes.
- They can contain abstract methods (must be implemented by subclasses) and concrete methods (regular methods with code).
- Subclasses must implement all abstract methods, or they must also be declared abstract.

### Interface
- An Interface in Java is an abstract type that defines a set of methods a class must implement.
- By default, all variables in an interface are final and static. This is because we don't instantiate an interface, we implement it, also it doesn't have memory allocated to it.
- By default, all declared methods in an interface are public and abstract.