# demo-airline-managemnet-system-console-app

A demo console based application for an Airline bookin system using pure java. This is done as part of a project for the Objective Oriented Programming using Java course.


Introduction

The Airline Reservation System is a Java console application that simulates a basic airline reservation system for both administrators and passengers. The system allows administrators to manage flights and passengers, while passengers can log in and book flights.


Classes:

Flight

The Flight class represents flight information. It contains attributes such as flight number, an array to store seat availability, starting point, destination, and time. The Flight class is used to add and display flight details.
Passenger

The Passenger class represents passenger information. It includes attributes like name, age, ID, password, and a status flag. The status flag indicates whether the passenger has booked a flight. By default, passengers are marked as "unbooked."
FlightGroup

The FlightGroup class manages a collection of flights using a Vector. It allows administrators to add flights and display flight details. You can also retrieve flights departing from a specific starting point or arriving at a specific destination.
PassengerGroup

The PassengerGroup class manages a collection of passengers using a Vector. It enables the addition of passenger records and retrieval of passenger information.
Main

The Main class is the main driver of the Airline Reservation System. It provides a menu system for both administrators and passengers. Administrators can add flights and passengers, while passengers can log in, book flights, and view available flights.
Functionality
Admin Features

    Add Flight: Administrators can add flight information, including flight number, starting point, destination, and time.
    Get Flights: Administrators can view a list of available flights.
    Add Passenger: Administrators can add passenger details, including name, age, ID, and password.
    Get Passengers: Administrators can view a list of registered passengers.

Passenger Features

    Login: Passengers can log in using their ID and password.
    Book Flight: Passengers can book a flight by selecting the flight number.
    Get Flights: Passengers can view a list of available flights.

Usage

    When the program starts, it presents a menu with options to log in as an administrator or passenger or exit.
    Administrators can log in using a password.
    Administrators can add flights, passengers, and view flight and passenger lists.
    Passengers can log in using their ID and password.
    Passengers can book flights, view available flights, and exit the system.
