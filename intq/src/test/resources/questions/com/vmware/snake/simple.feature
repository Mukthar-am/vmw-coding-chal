Feature: Solving Simple Snake Game
  As a snake game developer solver developer solve easy scenarios first.
  Aim of the game is to eat food with out cutting snake body itself
  Following are few of the conventions
  Head of the Snake is marked as H, Body and tail is marked as X
  Food is indicated by F

  Scenario: Start Game
    Given a new game 5 by 5 game
    When I ask where is snake head
    Then it should show following state
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   | H |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |

  Scenario: Offer food 1
    Given the following state of snake game
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   | H |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
    When I offer food using
      | F |   |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
    Then it should show following state
      | H | X |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |


  Scenario: Offer food 2
    Given the following state of snake game
      | H | X |   |   |   |
      |   | X |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
    When I offer food using
      |   |   | F |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
    Then it should show following state
      |   |   | H |   |   |
      |   |   | X |   |   |
      |   | X | X |   |   |
      |   |   |   |   |   |
      |   |   |   |   |   |
