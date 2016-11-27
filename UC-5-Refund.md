UC-5 Refund

Brief:
This is where a user can get a refund for a game that he/she has purchased.

(Casual)
Refund:
1.User selects Refund
2.System will display list of games
3.User selects the game which is to be refunded
4.System checks to see if user is eligible for refund for game selected
    4.1 If game is not eligible for refund the system will display an error
5.The system will ask for a confirmation from user.
6.The game will be removed from the users account
7.The user will be refunded  
8.System returns to main screen

Fully Dressed Use Case:  

Use Case:  
•Refund

Primary Actor:
•User

Stakeholder and Interests:
•User wants to Refund a purchased game

Preconditions:
•User must have the game purchased
•User must meet game refund conditions
•Game must not be played more than Game refund policy minimum game hours

Success:
•Game will be deleted from library
•Monies will be refunded to user

Main Success Scenario:  
1.User selects Refund
2.System will display list of games the user has purchased
3.User selects the game which is to be refunded
4.System checks the time played by the user of the selected game in the Game status
    4.1 If the game is not eligible for refund the system will display an error
5.The User enterd his/hers details
6.System checks the users details to see if the user is eligible for a refund
    6.1 The user has not been a member for 6 months the system will display an error message
7.The system will ask for a confirmation from user. 
    7.1 The user selects cancel, user is returned to main menu
8.The user confirms with the system
9.The system checks the authenticity of the game from the online database of games sold
    9.1 The system finds that the game has not been purchased from this store as the unique game authonticy code does not match
    9.2The system shows an error message
10.The system removes the game from the users account and sends a digital ticket.
11.The user will be refunded  
12.System returns to main screen

Alternate Flows:
•The user is not eligible for refund
•The user has played the game for more than the minimum play time
•The game is not authentic  
•The user cancels the refund
•The user exits the refund screen