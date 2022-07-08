Make Singleton reflection proof
In above Singleton class, by using reflection you can create more than one instance. If you don’t know what is the Java Reflection API is, Java Reflection is a process of examining or modifying the run-time behavior of a class at run time.

You can make the new instance of the Singleton class by changing the constructor visibility as public in run-time and create new instance using that constructor. Run the below code and see it our Singleton class survives?


Use volatile keyword:
On the surface, this method looks perfect, as you only need to pay price for synchronized block one time, but it still was broken, until you make sSoleInstance variable volatile.

Without volatile modifier, it’s possible for another thread in Java to see half initialized state of sSoleInstance
variable, but with volatile variable guaranteeing happens-before relationship,
all the write will happen on volatile sSoleInstance before any read of sSoleInstance variable.

https://medium.com/@kevalpatel2106/how-to-make-the-perfect-singleton-de6b951dfdb0

https://www.youtube.com/watch?v=WH5UvQJizH0 -- what is volatile