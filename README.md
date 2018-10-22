# dateproject
Dear Lorica Health Reviewer,

Please find the attached solution.

1) Assumption
- The Wikipedia definition of The Gregorian calendar has been used

2) Programming choices
- Implementation has not been started immediately, I have also not focused on calculating the range. I was rather thinking about what is the best way to represent a date and calculate a difference later.
- I've red some history about Gregorian calendar and understood how leap years are calculated.
- I stared thinking about the design but not too much as I knew that TDD will be used.
- The implementation started with representing a date as an integer (Starting from the January 1st, 0001 as the number one).
- code was evolving from a very simple (without counting a leap year) up to a bit more "complicated" but nicely documented with tests.
- after representing a date as a number, calculating the difference was easy.
- some of the tests from GregorianDateTest.class are redundant - I have left them  to show the Reviewer how the implementation was evolving.

3) Future improvements
- add a date validator for an inputted date
- for some variables the "short" type might be used

4) Other comments
- in the DaysElapsedTest class I have used real DaysElapsed objects (not mocking the GregorianDate).
  Sometimes that's bad as we want to test DaysElapsed class and not GregorianDate. But less code is good as well.
- Apache Cassandra open source best practices are saying:
     a) not to extend (if possible) hashcode and equals; I have extended those with lombok to write less code in tests
     b) not to add unnecessary interfaces if the class has only one implementation - I have sticked to this
- I am very open to improve my code and I know that some of the current decisions might be changed in the future.

5) How to run the application
- Java 8 and maven3 has to be installed
- Please execute in the command line: "java -jar /path_to_project_target_folder/date-project-1.0-SNAPSHOT-jar-with-dependencies.jar"
- It is a maven project "mvn package" will generate an executable jar

6) Example input:
03/01/1989 02/08/1983

03/01/1989 02/08/1982


Regards,
Konrad


