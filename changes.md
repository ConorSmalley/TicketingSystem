Changes Log
===========

This is a log of where we have had to differ from the class diagram, storyboards or sequence diagrams with an explanation of why we have had to do this

*   The Person class has the constructor Customer(String name) in the class diagram, this won't work so it has been changed to Person(String name)
*   In the class Transaction there is an enum TransactionType which is used to store the type of transaction, this is stored in a separate file to keep it separate from transaction as it may be required in other classes
