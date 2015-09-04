// Construct one String from another.
class MakeString {
public static void main(String args[]) {
char c[] = {'J', 'a', 'v', 'a'};
String s1 = new String(c);
String s2 = new String(s1);
System.out.println(s1);
System.out.println(s2);
}
}

/*The String Constructors
The String class supports several constructors. To create an empty String, you call the default
constructor. For example,
String s = new String();
will create an instance of String with no characters in it.

Frequently, you will want to create strings that have initial values. The String class
provides a variety of constructors to handle this. To create a String initialized by an array
of characters, use the constructor shown here:

String(char chars[ ])

Here is an example:

char chars[] = { 'a', 'b', 'c' };
String s = new String(chars);


This constructor initializes s with the string “abc”.

You can specify a subrange of a character array as an initializer using the following
constructor:



String(char chars[ ], int startIndex, int numChars)

Here, startIndex specifies the index at which the subrange begins, and numChars specifies
the number of characters to use. Here is an example:


char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
String s = new String(chars, 2, 3);


This initializes s with the characters cde.

You can construct a String object that contains the same character sequence as another

String object using this constructor:


String(String strObj)
Here, strObj is a String object. Consider this example:



*/