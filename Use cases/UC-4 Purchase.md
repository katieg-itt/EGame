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