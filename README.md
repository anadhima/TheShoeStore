# TheShoeStore


Steps

    Open the starter project from the github repo in Android Studio
    Add the navigation libraries to the app build.gradle file
    Add the safe-arg plugin to the main and app build.gradle file
    Set DataBindingUtil in build.gradle
    Use DataBindingUtil to inflate every layout
    Create a new navigation xml file

    Create a new Login destination.
        Include email and password labels
        Include email and password fields
        Create buttons for creating a new login and logging in with an existing account
        Clicking either button should navigate to the Welcome Screen.

    Create a new Welcome screen destination that includes:
        A new layout
        At least 2 textviews and use any text you would like
        A navigation button with actions to navigate to the instructions screen

    Create a new Instruction destination that includes:
        A new layout
        At least 2 textviews with appropriate information
        A navigation button with actions to navigate to the shoe list screen

    Create a class that extends ViewModel
        Use a LiveData field that returns the list of shoes
    Create a new Shoe List destination that includes:
        A new layout
        A ScrollView
        A LinearLayout inside the ScrollView for Shoe Items
        A FloatingActionButton with an action to navigate to the shoe detail screen
    In MainActivity, setup the nav controller with the toolbar and an AppBarConfiguration

    In MainActivity, add a Logout menu to return to the login screen

    Create a new Shoe Detail destination that includes:
        A new layout
        A TextView label and EditView for the Shoe Name, Company, Shoe Size and Description
        A Cancel button with an action to navigate back to the shoe list screen
        A Save button with an action to navigate back to the shoe list screen and add a new Shoe to the Shoe View Model.

            Hint: In the Shoe List destination, to add a child view programmatically to a ViewGroup, such as LinearLayout, use the addView() method. 
            Refer to a sample implementation in the StackOverflow discussion here.

    Make sure you can’t go back to onboarding screens In the Shoe List screen:
        use an Activity level ViewModel to hold a list of Shoes (use by activityViewModels)
        Observe the shoes variable from the ViewModel
        Add a new layout item into the scrollview for each shoe.
        
        
        
        
        
        
        
        

