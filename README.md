# Android-app-in-MVC-Architecture-
Best practices using MVC architecture(explained) in a Android development app build with Java

Understanding MVC Architecture as Model-View-Controller.
The MODEL represents the data and business logic, the VIEW handles the user interface, and the CONTROLLER acts as the intermediary between the two, handling user input and data operations.
In the app below theres a User request using a click buttom for display a text.(View as ViexText)
The text is build by "appName" + "appDownloads" + "appRating" datas (Model as MyModel class)
Controller as MainActivity listen the event(click buttom) and convert event to request 
Model as MyModel class run the request and get data for Controller
Controller pass the data to View who display the data
