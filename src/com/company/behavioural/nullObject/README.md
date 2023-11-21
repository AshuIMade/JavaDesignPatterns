# Null object design Pattern
* the motivation is that when component A uses component B, it typically assumes that B is non-null
* you inject B not some Option<B> type
* you do not check null on every call
* there is no option of A not to use an Instance of B
* thus, we build a no-op, non-functioning inheritor of B ( some inteface that b implements  and pass it in to A
## A no-op object that conforms to the required interface, satisfying a dependency requirement  of some other obejct
