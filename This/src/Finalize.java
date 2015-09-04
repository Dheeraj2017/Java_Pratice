/*The finalize( ) Method
Sometimes an object will need to perform some action when it is destroyed. For example, if
an object is holding some non-Java resource such as a file handle or character font, then you
might want to make sure these resources are freed before an object is destroyed. To handle
such situations, Java provides a mechanism called finalization. By using finalization, you can
define specific actions that will occur when an object is just about to be reclaimed by the
garbage collector.
To add a finalizer to a class, you simply define the finalize( ) method. The Java run time
calls that method whenever it is about to recycle an object of that class. Inside the finalize( )
method, you will specify those actions that must be performed before an object is destroyed.
The garbage collector runs periodically, checking for objects that are no longer referenced by
any running state or indirectly through other referenced objects. Right before an asset is freed,
the Java run time calls the finalize( ) method on the object.
The finalize( ) method has this general form:
protected void finalize( )
{
// finalization code here
}
Here, the keyword protected is a specifier that prevents access to finalize( ) by code defined
outside its class. This and the other access specifiers are explained in Chapter 7.
It is important to understand that finalize( ) is only called just prior to garbage collection.
It is not called when an object goes out-of-scope, for example. This means that you cannot
know when—or even if—finalize( ) will be executed. Therefore, your program should provide
other means of releasing system resources, etc., used by the object. It must not rely on finalize( )
for normal program operation.
     */
public class Finalize {

}
/*If you are familiar with C++, then you know that C++ allows you to define a destructor for
a class, which is called when an object goes out-of-scope. Java does not support this idea or provide
for destructors. The finalize( ) method only approximates the function of a destructor. As you
get more experienced with Java, you will see that the need for destructor functions is minimal
because of Java’s garbage collection subsystem.
*/