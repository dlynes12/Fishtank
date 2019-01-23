# Markdown

Markdown is a plain-text file format. There are lots of programming tools that use Markdown, and it's useful and
easy to learn. Hash marks (the number sign) indicate headers. Asterisks indicate lists.

# List of code smells

## Code Smell 1: Change Preventers

### Code Smell Category: [Write the code smell category name]

### List of classes and line numbers involved: Bubble.java

* public class bubble 1 line of code ;

### Description:

[In your own words, explain how the description of the code smell applies to this particular code.]

### Solution:

[In your own words, explain how you might solve this code smell:
how would you refactor the code?]

### Explanation

[How does your solution get rid of the code smell? Write your explanation here.]

============================================================

## Code Smell 2:  aFish and hungryFish share many functions.

### Code Smell Category: Design

### List of classes and line numbers involved: Fish HungryFish

* [Write a class and list of line numbers, one class per asterisk, that describe the smell]

### Description:

[In your own words, explain how the description of the code smell applies to this particular code.]

### Solution:

 I would make the classes inherit a parent class for cleaner code so the same functions don't
 have to be updated twice whenever something needs to get changed.
how would you refactor the code?]

### Explanation

[How does your solution get rid of the code smell? Write your explanation here.]

============================================================

## Code Smell 3: [Write the code smell name]

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

## Code Smell 4: Bloaters

### Code Smell Category: Long Method

### List of classes and line numbers involved:

* [Write a class and list of line numbers, one class per asterisk, that describe the smell]
    In HungryFish lines 64-82
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

## Code Smell 5: [Write the code smell name]

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
