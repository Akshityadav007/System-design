# Design problem 1
![img.png](img.png)

## Steps to solve (approach):
1. Identify requirements. (It is already provided here, in the interview ask questions).
2. List down all the **use cases** (payment, parking lot full, etc.). Think this all out loud.
3. **Class diagram** creation.
4. Sequence diagram (optional, create only when you need to clarify a particular feature to the interviewer).
5. Activity diagram (optional, create only when you need to clarify a particular feature to the interviewer).
6. Code it! First only focus on mandatory features.

## Parking Lot System
![img_1.png](img_1.png)
- Use-case diagram
  - Actors:]
      ![img_2.png](img_2.png)
  - Use-cases
    ![img_3.png](img_3.png)
  - Relationship (Association, Generalisation, etc.)
    ![img_4.png](img_4.png)
- Class diagram
  - First create all small classes.
    ![img_5.png](img_5.png)
    ![img_6.png](img_6.png)
    ![img_7.png](img_7.png)
    ![img_8.png](img_8.png)
  - Then combine all of them.
    ![img_9.png](img_9.png)
- Using singleton pattern for this.


**Note**: The more you spend time on creating the class diagram, the less time you will spend on coding.