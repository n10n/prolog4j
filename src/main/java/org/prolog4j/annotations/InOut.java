package org.prolog4j.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Denotes an input/output argument of a goal. It can be specified for a formal
 * argument of a goal method. The argument of the annotation is the name of a
 * Prolog variable occurring the goal. The actual arguments will be bound to the
 * Prolog variable before searching for the solutions. The value(s) that get(s)
 * bound to the variable in course of solving the goal can be achieved through
 * the return value of the goal method.
 */
@Target(ElementType.PARAMETER)
public @interface InOut {

    /**
     * The name of a Prolog variable in the goal. The value of the actual
     * argument will be bound to the variable before solving the goal.
     * 
     * @return The name of a Prolog variable occurring in the goal.
     */
    String value();

}
