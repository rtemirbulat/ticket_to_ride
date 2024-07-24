Ticket to Ride Web Application

You are chosen to create a web application called "Ticket to ride".
Main objects:
Segment - part of a route.
Route - set of segments (1+), representing a route between two towns.
Ticket - a permission for a Traveller to travel via a certain route. Has a price.
Traveller - a person who takes a ticket from town A to town B.
The price of the travel through 1 segment is 5 GBP.
The price of the travel through 2 segments is 7 GBP.
The price of the travel through 3 segments is 10 GBP.

![image](https://github.com/user-attachments/assets/6e642c7c-dca1-4744-b129-55f6af9f5c7d)

You need to provide an API with 2 functions (endpoints) for a traveller:
1. Calculate the price of a most optimal travel between two towns in GBP.
2. Save the ticket to a storage if a traveller has enough money.<br>
Requirements:<br>
● The API to calculate the price should be public.<br>
● The service should have layered architecture.<br>
● The service should be able to save successfully bought ticket.<br>
Nice to have:<br>
● An ability to persist the ticket to a database.<br>
● The API to buy a ticket should be private. It should be protected with
username and password.<br>
● Logging.<br>
● Java Docs<br>
● Readme file<br>
Stack:<br>
Java 21, Spring Boot, Spring Data, Spring Security, JUnit 5, Mockito, PostgreSQL,
Maven/Gradle

