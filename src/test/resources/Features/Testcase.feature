Feature: to Test the API DEmo app

Background:
     Given Launch the app
Scenario: To Navigate to View Page

When Click the view Link
Then Take Screenshot
Then Close the app

Scenario: To Validate the Drag and Drop functionality

When Click the View
Then Scroll down and Click Drag and drop link
And Drag from source to desitination
Then Take  the screen shot

Scenario: To validate the drop down Functionality

When Click view
Then Click Animation
Then Click Interplorators
And Handle Drop Down
And Take Screen shot


Scenario: To validate the zoom Functionality

When Click Graphics
Then Click Bitmapmesh
And Zoom the picture
Then Take screenshot

Scenario: To Validate the swipe Functionality
When Perform Horizontal Swipe
Then Take Screen_shot
When Perform Vertical Swipe
Then Capture Screen_shot




