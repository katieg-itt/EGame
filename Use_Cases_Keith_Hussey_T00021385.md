Keith Hussey T00021385

Vision Statement:  

Our project is an E-Game System. The system enables a user to purchase a game for a specific console either by digital download or order a hard copy of the game. The system enables the user to view game progression, achievements, and compare status to other users on the game progression. The user can leave a comment and rate the game they have purchased for others to see.

Use Case

 |--------|----------------|------|---------------|
 |Use Case| Description    | Risk | Business Value|
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
 
The 5 Use Cases I will be taking in the project are: Refund, View Categories, View Libraries, Download Game, Amend Account

Brief: ALL

Casual: Refund, View Category, View Libraries.  

Fully Dressed: Download Game

Brief:

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


View Categories:  

1.User selects View Categories

2.The system will display a list of categories

3.The user can select a specific category

4.The system will display a list of games from the selected category


View Library:

1.User selects View library

2.The system displays the list of games that the user has purchased  


Download Game:  

1.The user selects the Download Game function

2.The system displays a list of games that the user has purchased but has not yet downloaded.  

3.The user selects a game to download.

4.The system proceeds to download the game

5.On completion the system exits


Amend Account:

1.The user selects Amend Account function

2.The system asks for the user’s password
    2.1 If incorrect password is entered the system displays an error message

3.The system displays the user’s details

4.The user can amend his/her details

5.The user selects the save function
    5.1 If any mandatory details are not filled in the system displays an error message.

6.The system saves the details and exits

Casual Brief Use Case:  

Refund:  

Success:  

•Game is deleted from game library and money is refunded


Alternate Scenarios:

•The user is not eligible for refund

•Game play time exceeds the minimum requirements

•Game was not purchased from the e-store


View Category:  

Success:  

•Games from selected category are displayed

Alternate Scenarios:  

•The game category does not have any games to display for the selected category  


View Library:  

Success:  

•The games will be displayed from the user’s game library


Alternate Scenarios:

•Game does not exist in the user’s library


Download Game:  

Success:  

•Game will be downloaded to the user’s library


Alternate Scenarios:

•Insufficient space on user’s hard drive

•Download has been interrupted


Amend Account:  

Success:  

•Account details will be amended


Alternate Scenarios:

•Password is incorrect

•Mandatory details are not completed


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

4.System checks the time played by the user of the selected game 
    4.1 If the game is not eligible for refund the system will display an error

5.System checks the users details
    5.1 The user has not been a member for 6 months the system will display an error message

6.The system will ask for a confirmation from user.
    6.1 The user selects cancel, user is returned to main menu

7.The system checks the authenticity of the game 
    7.1 The system finds that the game has not been purchased from this store
    7.2The system shows an error message

8.The system removes the game from the users account

9.The user will be refunded  

10.System returns to main screen


Alternate Flows:

•The user is not eligible for refund

•The user has played the game for more than the minimum play time

•The game is not authentic  

•The user cancels the refund

•The user exits the refund screen

