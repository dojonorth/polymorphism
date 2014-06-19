javac -cp ./lib/junit-4.11.jar:./lib/hamcrest-core-1.3.jar src/uk/co/bbc/dojo/*.java test/uk/co/bbc/dojo/*.java
java -cp ./src:./test:./lib/junit-4.11.jar:./lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore uk.co.bbc.dojo.DecoderTest
