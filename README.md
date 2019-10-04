# OOPAssignments

# Assignments-02
## part 1
Use naïve-ticket-machine project and perform tasks in the given order.

1. Create an instance of TicketMachine class and observe the difference as
   compared to Circle Class in previous lab. Examine the newly created instance from
   object bench of BkueJ. Which Methods are there?
2. Call getPrice method on the above created instance and note what happened on
   execution of this method
3. Call insertMoney method
4. Call getBalance method
5. Now repeat task3 and 4 multiple times and see what happened every time you call
   getBalance method
6. Call printTicket method
7. What happens if you call getBalanceafterprintTicketmethod.
8. Observe the behavior of machine by inserting multiple amounts and calling
   getBalance and printTicket method.
9. Now create multiple instance of TicketMachine, repeat above tasks on all
   instances simultaneously with different amounts, and observe the behavior.
   10.Change the code statement public class TicketMachine to class public
   TicketMachine and compile by clicking on compile button. Note, Does the
   sequence of words in statement matter or not?
   11.What happened if the word public or class is skipped from the outer wrapper of
   TicketMachine class?
   12.Add a data field discount of type int in class TicketMachine. Make sure that the
   discount value is initialized in constructor of class. Write a method setDiscount to
   change the discount amount. Change the ticket price after discount. Now call
   getPrice method.
   13.What is the meaning of Scope and lifetime? Define scope and lifetime differences
   for “instance variable”, “Parameters” and “Local variables”.
   14.What is the purpose of a Constructor in a class and how it is different from other
   methods? Can you define the difference between constructor space and method
   space.
   15.You have a constructor in class TicketMachine that takes a single parameter. Write
   two more constructors one without parameter and sets the price value to default
   value of your choice. Second constructor with two parameters one amount that
   sets the value of price and other disc_amount that sets the value of discount. User
   appropriate data types for these parameters.
   16.What is the difference between “Accessor” and “Mutator Methods”? List the
   Accessor and Mutator methods in the TicketMachine class.
   17.Write a new method getTotal in Ticketmachine class. The method prints the value
   of total field.
   18.Write a method called prompt to the TicketMachine class. The body of the
   method should print the following single line of output:
   Please insert the correct amount of money.
   Use appropriate return type.
   19.Modify the insertMoney method. If user enter an amount less then or equals to
   zero then call prompt method to display message.
   20.What is the error in the following methods
   public int refundBalance()
   {
   return balance;
   balance = 0;
   }
   public void getAge()
   {
   return age;
   }
   21.Add a new method, emptyMachine, that is designed to simulate emptying the
   machine of money. It should reset total to be zero but also return the value that
   was stored in total before it was reset.
   22.Rewrite the printTicketmethod so that it declares a local variable,
   amountLeftToPay. This should then be initialized to contain the difference between
   Price and balance. Rewrite the test in the conditional statement to check the value
   of amountLeftToPay. If its value is less than or equal to zero, a ticket should be
   printed; otherwise, an error message should be printed stating the amount left to
   pay. Test your version to ensure that it behaves in exactly the same way as the
   original version. Make sure that you call the method more than once, when the
   machine is in different states, so that both parts of the conditional statement will
   be executed on separate occasions
   ## PART – II
   Use the Code of Digital Clock discussed in the previous Lecture.
10. Change the clock from a 24-hour clock to a 12-hour clock. Be careful: This is
    not as easy as it might at first seem. In a 12-hour clock, the hours after midnight
    and after noon are not shown as 00:30, but as 12:30. Thus, the minute display
    shows values from 0 to 59, while the hour display shows values from 1 to 12!
11. There are (at least) two ways in which you can make a 12-hour clock. One
    possibility is to just store hour values from 1 to 12. On the other hand, you can
    simply leave the clock to work internally as a 24-hour clock but change the
    display string of the clock display to show 4:23or 4.23pmwhen the internal value
    is 16:23. Implement both versions. Which option is easier? Which is better?
    Why?
