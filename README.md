Parameter-passing-in-java

This sample project is to demonstrate how java passes an argument to a nethod.
There are mainly two kinds of argument in java: a primitive value and a reference to an object (call-by-value vs call-by-reference)

When a primitive value is passed as an agument to a method in java, JVM create a copy of the argument and passes it to the parameter list of the source method during runtime. In this case any change made by the method to the argument list remains local and does not affect the original parameter. That's why the value of <a> and <b> remain the same both before and after 
the call to DividPrimitiveArg().

In the second case, when an object is passed to the DividObjectArg(), (it is the reference that's passed to the method indeed)
the method acts directly on the objet in the heap memory.In this case, the object is affected during runtime and causing the value of <a> and <b> to be different before and after the call to DividObjectArg().




Ce projet exemple est de démontrer comment java passe un argument à une méthode. Il existe principalement deux types d'arguments en java: une valeur primitive et une référence à un objet (call-by-value vs call-by-reference)

Lorsqu'une valeur primitive est passée comme un agument à une méthode en java, JVM crée une copie de l'argument et la transmet à la liste de paramètres de la méthode source pendant l'exécution. Dans ce cas, toute modification apportée par la méthode à la liste d'arguments reste locale et n'affecte pas les paramètres d'origine. C'est pourquoi la valeur de <a> et <b> restent les mêmes avant et après l'appel à DividPrimitiveArg ().

Dans le second cas, lorsqu'un objet est passé à DividObjectArg (), (c'est la référence qui est passée à la méthode en effet), la méthode agit directement sur l'objet dans la mémoire heap. Dans ce cas, l'objet est affecté pendant l'exécution Et fait que les valeurs de <a> et <b> soit différente avant et après l'appel à DividObjectArg ().

