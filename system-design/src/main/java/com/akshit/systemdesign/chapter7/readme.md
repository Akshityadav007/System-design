## Introduction to Behavioral pattern
- Focus is on object interaction and responsibility delegation.

### Types
1. **Chain of responsibility (COR)**
2. **Command**
3. **Observer**
4. Mediator
5. Iterator
6. Visitor
7. **Strategy** ⭐
8. State - Different from Strategy
9. Template

### 1. Chain of responsibility
- Focus is on propagation of requests to different objects within the system.
- All objects in chain must have a common interface to execute this pattern.
- Every object has a reference of the next object in line.
![img.png](img.png)

### 2. Command pattern
- Focus is on decoupling two objects - 1. object that requests (invoker), 2. object that fulfills (receiver).
- We can perform Undo, logging, queueing, callbacks, timeout commands using this pattern.
![img_1.png](img_1.png)