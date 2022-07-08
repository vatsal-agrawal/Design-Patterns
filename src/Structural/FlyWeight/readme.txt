The intent of the Flyweight Pattern is to use sharing to support a large number of objects
that have part of their internal state in common while the other part of state varies.

 A common practice is to keep state in external data structures and pass them to the Flyweight Object when needed.
 Each Flyweight Object is divided into two pieces:
 the state-dependent (extrinsic) part, and the state-independent (intrinsic) part.