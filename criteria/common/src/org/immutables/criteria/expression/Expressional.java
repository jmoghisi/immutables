package org.immutables.criteria.expression;


/**
 * Means an object can be expressed as Abstract Syntax Tree (AST).
 */
public interface Expressional {

  /**
   * Expose expression used by an object.
   */
  Expression expression();

}
