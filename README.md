# Text-Based Adventure Game

## Overview
The Text-Based Adventure Game is a console-based interactive fiction game built using Java. The player, represented by a character known as the "Adventurer," navigates through different rooms, interacts with objects, and experiences a textual adventure by typing commands like Go, Look, Take, Drop, Use, and Exit.

## Features
- *Interactive Gameplay*: The player controls the Adventurer by typing simple commands.
- *Exploration*: Move between different rooms and explore various descriptions and items.
- *Inventory Management*: Collect and manage items found in different rooms.
- *Simple Commands*: The game supports basic commands like Go, Look, Take, Drop, Use, and Exit.

## Technologies Used
- *Java Programming Language*: The entire game logic and functionality are implemented using Java.
- *Java Objects and Classes*: The game structure is object-oriented, with various classes representing different game components.
- *Data Structures*: Arrays and HashMaps are used to manage rooms, items, and game state.

## How to Play  
1. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).
2. Compile and run the TextAdventure class to start the game.
3. Follow the on-screen prompts to navigate through the game:
    - *Go*: Move to a different room (e.g., Go north).
    - *Look*: Get a description of the current room.
    - *Take*: Pick up an item (e.g., Take key).
    - *Drop*: Drop an item from your inventory (e.g., Drop key).
    - *Use*: Use an item from your inventory (e.g., Use key).
    - *Exit*: Quit the game.

## Project Structure
- TextAdventure.java: The main class that initializes and runs the game loop.
- AdventureModel.java: Manages the game state, including the current room and available commands.
- Adventurer.java: Represents the player and tracks inventory and location.
- Room.java: Represents different rooms in the game, each with unique descriptions and items.
