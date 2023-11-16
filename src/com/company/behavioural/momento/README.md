# Momento Design pattern 
An object or a system goes through changes. there are different ways of navigating 
those changes.
one way is to record every change (command) and teach a command to undo itself.
Another is to simply save snapshots of the system.
## Momento: 
A token/handle representing the system state. lets us roll back
to the state when the token was generated. May or may not directly expose state
information.
* may use to interact with other languages library 
