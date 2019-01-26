# Markdown

Markdown is a plain-text file format. There are lots of programming tools that use Markdown, and it's useful and
easy to learn. Hash marks (the number sign) indicate headers. Asterisks indicate lists.

# List of code smells

## Code Smell 1: Dispensables

### Code Smell Category: Duplicate Code

### List of classes and line numbers involved: 

* Fish and Hungry Fish Most of the entirety of both classes are extremely similar. 

### Description:

[In your own words, explain how the description of the code smell applies to this particular code.]

### Solution: They can be combined to reduce the amount of code for both of these classes and
get rid of unneeded code.

[In your own words, explain how you might solve this code smell:
how would you refactor the code?]

### I  would create a superclass for these to classes so the duplicate code can get deleted
I would do this by having Fish be the parent of HungryFish and having some of the methods in 
HungryFish overide the parent class if needed.

[How does your solution get rid of the code smell? Write your explanation here.]
This would get rid of the duplicate code and make it much easier to read and it would 
shorten it so it would be simplify the structure of it.


============================================================
## Code Smell 2: Bloaters

### Code Smell Category: Long Method

### List of classes and line numbers involved:

* [Write a class and list of line numbers, one class per asterisk, that describe the smell]
    In HungryFish and Fish lines 64-82
### Description:

[In your own words, explain how the description of the code smell applies to this particular code.]
The method that is used is extremely long and does not turn the letters for the fish around 
properly. It is a whole bunch of code that would be hard to update if needed.
### Solution:

[In your own words, explain how you might solve this code smell:
how would you refactor the code?]
I would make a backAppearence string and keep the appearence string then when the fish needs
to turn I simply swap the backAppearence with the current appearence. Meaning there would be 
much less code than the orignal method.
### Explanation

[How does your solution get rid of the code smell? Write your explanation here.]
My solution would make the code clean and not bloated while making it easy to update
and easy to understand what the method is doing.


============================================================
## Code Smell 3: Long Method

### Code Smell Category: Seaweed

### List of classes and line numbers involved:

* Seaweed lines: 43-65, 
### Description:

This method does one simple thing but, it has many if statements which can be hard to read and it is
not very adaptable.

### Solution:

[In your own words, explain how you might solve this code smell:
how would you refactor the code?]
I would think about the function of the code and find a way that would do the same thing more efficiently,
I would start by seeing what if statements could be combined and if the is a more straight forward method
of accomplishing the same thing.

### Explanation
My solution would shorten the code and make it much easier to understand and work with. The code would
be more clean and simple afterward.
[How does your solution get rid of the code smell? Write your explanation here.]


============================================================
## Code Smell 4:  Switch Staments

### Code Smell Category: Object-Orientation Abusers

### List of classes and line numbers involved: Fish, HungryFish

*  In HungryFish and Fish lines 64-82

### Description:

The Method reverse appearence uses many switch Statements and if statements to accomplish a simple task. 
This is a unnecessary use of a switch statement, it is also hard to add a new condition you would need to
find all the switch code and modify it, which can be difficult.

### Solution: 
Rewrite the method without using a switch statement and use a different approach to accomplish the same
outcome. I would use a method that would swap strings which represent the appearance of each fish. 


### Explanation
By doing this the method could be changed easily and would be easy to read. Making the code short and 
simple. This eliminates the need for switch cases and extra work if someone wanted to make a change
to the method.


============================================================
## Code Smell 5: Divergent Change

### Code Smell Category: Change Preventers

### List of classes and line numbers involved:

* FishFrame lines 28-40
* FishTank 70-88
### Description:
For these Classes and methods if you were to add a new element to the fishtank you would have to change
how both of these methods work by adding new conditions and new changes to other classes to allow
them to work. For FishFram and Fishtank you would need to make changes to the if statements and possibly
to the other classes depending on how they might conflict with each other.

### Solution:

I would make it so that both of these methods don't have to know the functionality of the classes they 
are interacting with as that is not its job. If needed I would make a new class/classes and have it do 
the work the classes are both doing, by putting the fields and needed methods to make it functional.

### Explanation
My solution would make it more adaptable to add new classes and elements to the fishtank program. It would
reduce the amount of duplicate code throughout the program and reduce the complexity of working with the
project.



============================================================
