Joshua Standing-Harvey T-00183089 Use Cases

Vision Statement 

Project is an E-Game Application system.  This is an application in which e games can be downloaded or ordered and the eGames can also be managed. This system also enables the user to view their activities in downloading or ordering eGames.  the application will also allow the user to view worldwide leader boards on each games and view their achievements.  The user can leave a comment/review of the game which in turn can be viewed by all users that use the application.

 Use Case
 |--------|----------------|------|---------------|
 |Use case | Description    | Risk | Business Value|
 |--------|----------------|------|---------------|
 |  1     | Login          |  2   |      4        |
 |  2     | Register       |  2   |      4        |
 |  3     | View Account   |  1   |      2        |
 |  4     | Purchase       |  4   |      4        |
 |  5     | Refund         |  4   |      4        |
 |  6     | Review         |  3   |      2        |
 |  7     | Top Sales      |  1   |      2        |
 |  8     | Top Scores     |  1   |      1        |
 |  9     | View Categories|  2   |      3        |
 |  10    | View Purch Logs|  2   |      4        |
 |  11    | View Library   |  3   |      3        |
 |  12    | Download Game  |  4   |      4        |
 |  13    | Amend Account  |  3   |      3        |
 |  14    | Add Discount   |  2   |      3        |
 |  15    | Add Game-Store |  4   |      4        |
 |--------|----------------|------|---------------|
 
 Because this is the cleanest version of the use cases we are using this table to describe the use cases across all 3 of our documents
 
 The 5 use cases that i will be taking on myself are: 
  (Brief: Purchase, Review, Top Sales, View Purch Logs, Add Game-Store)
 (Casual: Purchase, Review, View Purch Logs)
 (fully Case: Purchase)
 
 
 Purchase
 1.User will have a full cart at the start of the transaction 
    1.1 if the user has nothing in cart then they cannot progress.  
 2. the system will display a list of items as well as their prices. At the bottom there will be a total amount.
 3. The user will have to confirm they are happy with what is in their cart by pressing continue button. 
 4. the user will be prompted to choose what payment type ie. Card, Funds on account or Bitcoin
 5. Once the user has chosen their payment method money is taken from the relevant place and the transaction is complete
    5.1 if there is insufficient funds in the users account an error message will show and the user will be taken back to the cart (for a swift telling off)
 6. games from the list will then be added to the users library
 
 Review
 0.1 One important pre requisite for this use case is that the user actually needs to have the game in their library before they can review
 1. user goes to game page in their library
 2. user types in text box their review of the game
 3. user presses review button and the review is stored
 4. text box resets
 
 Top Sales
 1. admin invokes the top sales by pressing the top sales button from the admin menu
 2. The system pulls top 10 sales in order of amount from highest to lowest
 
 View Purch Logs
 1. Admin invokes purchase logs by pressing the purchase logs button on the admin menu
 2. the system brings up an all inclusive list of every sale that has happened on the system
 
 add game to system
 1. admin invokes the add game function using a button in the admin menu
 2. a gui is displayed to the admin with text boxes that he/she must insert the information of the new game into
 3. once the information is in the text boxes the admin pressed the add game button  and the game is added to the library. 
 
 ---------------------------------------------------------------------------------------------------------------------------
 
 Use Case (Casual Format)
 
 .Add Game to System
 
 - Success
  . Game is added to the system without any issues
  
  
-Alternate Scenarios
 . Admin enters a game system that is not correct 
   . Throws an error for the admin to read and amend issue
 . Admin leaves one of the fields empty
   . System throws an error explaining the issue. 
 . Admin enters a game already in the system
   . System throws an error explaining the game is already in the system
 
 ---------------------------------------------------------------------------------------------------------------------------
 
 Use Case (Casual Format)
 
 . Review
 
 -Success
  . The user adds the review to the system and refreshes the text box

 - Alternative Scenarios
  .The user leaves the review box empty and presses the button to review
   . the system will tell the user they cannot leave the box empty
    . Alternative to this the button could be not push able until there is data in the box
 
 ---------------------------------------------------------------------------------------------------------------------------
 
Use Case (Casual Format)

-Purchase Game

-Success
 . User completes purchase and game/games are added to users library

-Alternative Scenarios
 . Users debit card gets declined and the system brings the user back to the 
 . User does not have enough in personal account and would be asked to use a different form of payment
 . User presses the cancel payment button
   . The system returns the user back to the previous screen
---------------------------------------------------------------------------------------------------------------------------


 Use Case (fully Dressed)
 
 Use Case: Purchase Game
 
 Primary  Actor: 
  -User
 
 Stakeholder and Interests:
  - user: Wants to purchase game from the system.
 Preconditions: 
  . User must have account
  . User must have something in their cart
  
  Success Guarantee (postconditions)
  . Sale is completed and game is added to users library and money is taken from users account.
  
  Main Success Scenario (basic flow)
  
   1.User will have a full cart at the start of the transaction 
    1.1 if the user has nothing in cart then they cannot progress.  
   2. the system will display a list of items aswell as their prices. At the bottom there will be a total amount.
   3. The user will have to confirm they are happy with what is in their cart by pressing continue button 
   4. the user will be prompted by the system to choose what payment type ie. Card, Funds on account or BitCoin
   5. The user selects payment type from a box and presses the pay button
   6. assuming the payment went through the system adds a copy of the game/games that the user has purchased into their library
 
   Alternative Flows: 
   . Users debit card gets declined and the system brings the user back to the 
   . User does not have enough in personal account and would be asked to use a different form of payment
   . User presses the cancel payment button
   . The system returns the user back to the previous screen+
   
   Technology Used
   basic pc input output device (ie mouse, keyboard)