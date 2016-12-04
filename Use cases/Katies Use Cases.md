Katie Griffiths T00175748

Vision Statement 

Project is an E-Game Application system.  This is an application in which e games can be downloaded or ordered and the eGames can also be managed. This system also enables the user to view their activities in downloading or ordering eGames.  the application will also allow the user to view worldwide leader boards on each games and view their achievements.  The user can leave a comment/review of the game which in turn can be viewed by all users that use the application.

 Use Case
 
 |--------|----------------|------|---------------|
 |Usecase | Description    | Risk | Business Value|
 |--------|----------------|------|---------------|
 |  1     | Login          |  2   |      4        |
 |  2     | Register       |  2   |      4        |
 |  3     | View Account   |  1   |      2        |
 |  4     | Purchase       |  4   |      4        |
 |  5     | Refund         |  4   |      4        |
 |  6     | Review         |  3   |      2        |
 |  7     | Top Sales      |  1   |      2        |
 |  8     | Top Scores     |  1   |      1        |
 |  9     | View Catagories|  2   |      3        |
 |  10    | View Purch Logs|  2   |      4        |
 |  11    | View Libaray   |  3   |      3        |
 |  12    | Download Game  |  4   |      4        |
 |  13    | Amend Account  |  3   |      3        |
 |  14    | Add Discount   |  2   |      3        |
 |  15    | Add Game-Store |  4   |      4        |
 |--------|----------------|------|---------------|
 
 (Brief: LogIn,Register,View Account,Top Scores, Add Discount)
 (Casual: Register, View Account)
 (fully Case: Register)
 
 Brief UseCases
 
 LoginIn
 1.User will open up application
 2.User will enter in Username and Password
 3.System will take the information entered
 4.User finalizes by clicking on enter
 
 
 Register
 1.User will open up application
 2.User will select register for an account
 3.System will take request and display the register page
 4.User will enter there name, email address, password.
 5.User selects confirm button
 6.system retrieves users details and saves them
 7.System ends the registration process.
 
 View Account
 1.User selects account
 2.System retrieves users account details
 3.User checks there account
 4.User ends process by clicking on a different link
 5.System ends process
 
 Top Scores
 1.User selects Leader Board
 2.System retrieves the details
 3.Sytem loads Top user scores
 4.Users views the selected scores
 5.User selects another application
 6.System ends process
 
 Add Discount
 1.User is in checkout
 2.User selects discount option
 3.User enters discount code into field
 4.User slects the submit option
 5.System retrieves details
    5.1 If discount is valid system aplies discount to game
    5.2 if disocunt is in-valid system sends error messsage


Casusal UseCases

Register
1. User selects registration field
2. System retrieves registeration information
3. User fills in details
    3.1 System checks that all fields are filled in correctly
    3.2 If field/fields are empty, Ststem sends message
4. User selects confirm
    4.1 System checks if user is all ready registered 
    4.2 If user is registered the system sends an error    message
5. System processes details and adds user to the application
6. User quits registration


View Account
1. User selects there account to be viewd
    1.1 System checks to see if user is valid
    1.2 System retrieves users details
    1.3 System displays details on screen
2. User views details
3. System checks for any modifications
    3.1 If any changes are made system checks if valid
    3.2 System makes changes
4. User quits apllication
5. System ends process


Fully Dressed UseCase

Register

Primary Actor: User

Interests:
    <> User wishes to register with the EGame application with no eligibity problems and wants confimation of registration and for the process to be clear and simple.
    <> EGame wants the system to accuratly register and record users details and to check for eligibillity to be correct for the user to be satisfied.
    
Preconditions:
    <> User is identified and suthenticated by the system
    
Postconditions:
    <> User is aware of registeration process. The list of users registered within the system is updated and the usre has confirmation of registration. 
    
Main Scenario with Alternatives:
1. The user selects registration for the application.
    1.1 System is unable to retrieve registration details.
    1.2 System informs user of error.
    1.3 Process is ended.
2. System retrieves the registration form and displays it to the user.
3. The system provides the user with the choice of selecting a username or exiting the process
    3.1 User selects the exit
    3.2 System ends registration process
4. The user fills in username field.
5. System retrieves username details and checks system for eligillibity.
    5.1 If username is already taken, system displays error message and gets user to choose another username.
    5.2 User must complete username field for valid registration
    5.3 If user declines and quits the system ends process.
6. User fills in the registration form. 
7. System retrieves information and validates that the user is not pre registered in the system.
    7.1 If user is already registered the system sends back an error message stating user is already registered.
8. System checks that all fields are filled in correctly
    8.1 If user has not filled in the registration form completely, the system sends an error message with the registration form incomplete.
    8.2 User must complete all fields for a qualified registration.
9. System records users details for registration and updates the list of registered users in the system
10. The system informs the member they are sucessfully registered.
11. The system sends proof of confirmation to the user they are registered with the application.
12. The system quits the registration process.

Exceptions:
    <>If at any time the system is unable to retrieve or process any details then the system will inform the user of the problem and the process will end.

Special Requirements:
    <>Confimation of registration or faliure to register must be provided to the user.
    <>Responsive design (colours/fonts and font sizes) must be taken into account for users with a disability eg. Colour blindness.