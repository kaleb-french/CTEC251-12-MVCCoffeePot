# Journal
Write your Journal questions and notes here.

Phase 0-
When I think of the MVC I think of the Controller as how we interact like the coffee maker where we push the make coffee button, the Model as what is the object holding data ie the Pot holding the coffee, and last as the View being the output the user sees ie a coffee mug the gets filled from the pot. The Pot should keep track of coffee level and refuse to got negative eithr throw execption or return 0 or -1 to show it can no longer return any coffee. The Controller should act like the coffee maker and brew and fill the coffee pot to supple more coffee. The View should be the users mug that receives the coffee asking the coffee maker to receive coffee and the pot pours it into the mug.

Phase 1-
Created the coffee pot model and set basic functionality through the fields and getter and the brew and pour methods, also added error checking for invalid values. The model is the data container for the MVC is holds the state information, it's important because its keeping the data seperate from the logic or the user presentation.

Phase 2-
We created the View and adding some methods for intaking input and outputing to user. Keeping the IO away from the data in the model allows for less errors and mutation.

Phase 3-
The View captures the input and returns it to controller, the controller parses the command and calls the method on the model to brew by the amount entered, and the model runs its brew method to increase the volume by the amount.

Phase 4-
Keeping the responsiblities seperate and not breaking that was the only "hard" part and that really wasnt that hard to be honest. I think it made it easy to add error handling because I was able to wrap the entiring parsing block in a try block to catch any bad input.
