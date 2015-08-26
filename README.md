Once the CardShuffler project has been cloned, it can be build and run off a command line:

gradle clean build
gradle jettyRun

If the project is imported into an Eclipse workspace, run the following command:

gradle eclipse

I am still learning how Gradle works, and it may or may not be necessary to run the following command:

gradle dependencies

AdvancedRestClient can be used to hit the following endpoints:

1) Get a list of all decks in memory
	GET
	/decks

2) Get a deck by deckId
	GET
	/decks/{deckId}

3) Create a new deck in sorted order
	PUT
	/decks

4) Delete a deck by deckId
	DELETE
	/decks/{deckId}

5) Shuffle a deck by deckId
	POST
	/decks/{deckId}

*) Initialize the temporary database with four decks:
	POST
	/decks

Scope reduction includes:
I have not yet stubbed a persistence layer for the database.
The cards' suits and faces are still being displayed only as integers instead of their english equivalents.
The project is inadequately unit tested.

Project bugs include:
The decks' ids are not being displayed in the JSON returned from the calls.

Resources used:
https://github.com/ziroby/jetty-gradle-hello-world
http://howtodoinjava.com/2014/06/17/google-gson-tutorial-convert-java-object-to-from-json/
http://www.javacreed.com/simple-gson-example/
http://www.dawnseeker8.com/jersey-2-spring-4-crud-example/
http://pages.cs.wisc.edu/~hasti/cs302/examples/Exception/Deck.java
