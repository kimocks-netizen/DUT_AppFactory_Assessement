# DUT_AppFactory_Assessement
This assessment is for MOCKING KATA by implementing the character copier using mocks for the source and the destination

## MOCKING KATA
To continue my series on Mocking Katas (see Mocking Kata – Instrument Processor for the last Kata), 
I’ll show you a very simple Kata that I normally use in my Test Driven Development training courses to introduce mocks (created manually or dynamically with the use of a mocking framework): the CharacterCopier.

## CHARACTER COPIER
The character copier is a simple class that reads characters from a source and copies them to a destination one character at a time.

The character copier gets the source and destination injected in the constructor.
 
![alt text](https://github.com/kimocks-netizen/DUT_AppFactory_Assessement/uml.JPG?raw=true)

When the method Copy is called on the copier then it should read characters from the source and copy them to the destination until the source returns a newline (‘\n’).

The exercise is to implement the character copier using mocks for the source and the destination (try using manually written mocks and mocks written with a mocking framework.

## POINTS OF INTEREST
The following points make this exercise interesting:

- Good exercise to compare manually written mocks to generated ones.
- Ordering of calls on destination is important
- Small steps: first copy a single character, then multiples ending with \n
- Very concise
