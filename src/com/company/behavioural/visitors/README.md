# Visitor Design Pattern
Allows to add extra behaviours to classes and hierarchies of classes
## need to modify a new operation on an entire class of hierarchies 
* we do not want to keep modifying the entire class of hierarchies
* need access to the non-common aspects of classes in the hierarchy
* create an external component to handle rendering but avoid type checks  
## Visitor pattern is where a component visitor is allowed to traverse the entire inheritance hierarchy. Implemented by
## propagating a single visit() method throughout the entire hierarchy.