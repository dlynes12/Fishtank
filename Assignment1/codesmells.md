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

## Code Smell 3: Shotgun Surgery

### Code Smell Category: [Write the code smell category name]

### List of classes and line numbers involved:

* [Write a class and list of line numbers, one class per asterisk, that describe the smell]

### Description:

[In your own words, explain how the description of the code smell applies to this particular code.]

### Solution:

[In your own words, explain how you might solve this code smell:
how would you refactor the code?]

### Explanation

[How does your solution get rid of the code smell? Write your explanation here.]

============================================================
## Code Smell 4:  Temporary Field

### Code Smell Category: 

### List of classes and line numbers involved: Fish HungryFish

* [Write a class and list of line numbers, one class per asterisk, that describe the smell]

### Description:

[In your own words, explain how the description of the code smell applies to this particular code.]

### Solution:


### Explanation

[How does your solution get rid of the code smell? Write your explanation here.]

============================================================

## Code Smell 5: Long Method

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
