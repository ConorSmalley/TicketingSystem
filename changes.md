Changes Log
===========

This is a log of where we have had to differ from the class diagram, storyboards or sequence diagrams with an explanation of why we have had to do this

*   The Person class has the constructor Customer(String name) in the class diagram, this won't work so it has been changed to Person(String name)
*   In the class Transaction there is an enum TransactionType which is used to store the type of transaction, this is stored in a separate file to keep it separate from transaction as it may be required in other classes
*   Function int getId() added to UserAccount so that UserAccountManager can run deleteUserAccountById(int Id)
*   Function List<Token> getTokens() added to UserAccount so that tokens can be matched to a user.
*   Function String getName() added to Person so that a UserAccount can be fount by name using UserAccountManager.
*   Function List<Pass> getAllPasses added to UserAccount so that UserAccountManager can deactivate invalid passes.
*   Function boolean isValid() added to PassPlan so that it can check weather the PassPlan is valid;
*   Function PassPlan getPassPlan() added to Pass as to check it is valid you need to access the PassPlan.
*   In Gateway instance variable paymentHub added.
*   Token change to be a base class for Ticket and Pass classes. TicketPassPool therefore will be change to TokenPool.
*   UserAccountManager class change to a singleton class.
*   startAutomatedPayment now passed an account and called from within canUserLeave in the event of a valid ticket