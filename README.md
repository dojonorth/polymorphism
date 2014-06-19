polymorphism
============

The idea of this Dojo is to deal with a case of polymorphism.

That is a case where we want a given piece of code to behave differently depending on the context.

The tests are provided, you need to implement the code to make the tests pass.

The key tests are in DecoderTest.

These tests use a MediaFactory (which you need to implement) to return Media objects that are decoded in different ways. Don't worry about being clever in the implementation of the MediaFactory, if you end up with a big if statement that's okay.

You will then need to implement the methods on the Decoder class to decode the different media objects in different ways.

You are free to simply have the Decoder class call corresponding methods on the Media objects if you wish.

Approaches you may wish to consider:

Inheritance Composition A big if statement Visitors A custom dispatch mechanism Anything else you can think of

Try implementing the problem 2 or 3 times

Once you've implemented the Decoder problem twice, trying making the LicenseCheckerTest pass for your approaches.
