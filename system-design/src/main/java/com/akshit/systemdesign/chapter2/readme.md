* ## No design is wrong!

#  UML Basic notation

1. Class: The notation represents the attributes and methods of an object.
![img.png](img.png)
2. Objects: The notation refers to the instance of the class.
![img_1.png](img_1.png)
3. Interfaces: The notation represents the functionality without its implementation.
![img_2.png](img_2.png)
4. Use-case: This notation describes the user's goals and possible interactions with the system.
![img_3.png](img_3.png)
5. Actor: This notation represents the entities interacting with the system. They can be primary or secondary.
6. Components: This notation represents a section of the system. Basically the whole system is divided into multiple components.
7. Nodes: Similar to components, this notation represents the physical aspects of the system, such as server.
![img_4.png](img_4.png)
8. Activity diagram: These describe the various interactions performed by different components present in the system. These are just (flow-charts).
9. Interaction diagrams: These diagrams describe the message flow between the different components present in the system.
![img_5.png](img_5.png)

# Types of UML
1. Structural diagrams: These diagrams have static structure, i.e. they have components that don't change.
2. Behavioral diagrams: These diagrams have dynamic structure, i.e. they have components that can change.
- Most common used:
  - Class diagram
  - Use-case diagram
  - Sequence diagram
  - Activity diagram

## Use-Case Diagram
- This describes the specification of users and their possible interactions with the system. The possible interactions are called use cases.
![img_6.png](img_6.png)
- Primary actor is always on the left-side and secondary actor is always on the right-side in the diagram.
### Relationships in Use-case Diagrams
- Association - This is used to depict a normal relation among two use-cases.
![img_8.png](img_8.png)
- Generalisation - Inheritance. This is used to generalize a common feature that would be inherited by multiple use-cases. E.g. Payment
![img_7.png](img_7.png)
- ⭐ Include - This is used to depict dependency of one use-case on another. When to execute a use-case, the availability of another use-case is mandatory, we use this.
![img_9.png](img_9.png)
- ⭐ Extends - When to execute a use-case, the availability of another use-case may or may not be needed, we use this. It is depicted by using dotted lines with arrow in the opposite direction and <<extends>> above the lines.
![img_10.png](img_10.png)
### Benefits
![img_11.png](img_11.png)

## Class Diagram
![img_12.png](img_12.png)
![img_13.png](img_13.png)
![img_14.png](img_14.png)
![img_15.png](img_15.png)
![img_16.png](img_16.png)
![img_17.png](img_17.png)
![img_18.png](img_18.png)
![img_19.png](img_19.png)
![img_20.png](img_20.png)

## Sequence Diagram
![img_21.png](img_21.png)
![img_22.png](img_22.png)
![img_23.png](img_23.png)
![img_24.png](img_24.png)
![img_25.png](img_25.png)
![img_26.png](img_26.png)
![img_27.png](img_27.png)
![img_28.png](img_28.png)
![img_29.png](img_29.png)
![img_30.png](img_30.png)
![img_31.png](img_31.png)