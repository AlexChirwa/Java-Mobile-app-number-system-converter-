# Java Mobile app number system converter

1. Introduction
Reason for Selecting the Application:

The Binary to Decimal and Decimal to Binary Converter is designed to help users convert numbers between binary and decimal systems. This app serves as both an educational tool and a practical utility, allowing users to easily perform these conversions on their Android devices.

Motivation for Selecting the Application:

The concept of binary and decimal conversions is fundamental in computing and digital electronics. By choosing to develop this application, the goal was to:

•	Create a simple yet useful tool.

•	Provide an educational resource for users learning about number systems.

•	Implement an app that allows beginners to grasp the basic of Android development and Java programming.




2. Rationale of the Chosen Method and Basic Steps to implement it:

The chosen method for converting binary to decimal and vice versa is straightforward and efficient.

The app uses Java’s built-in methods to perform the conversions:

•	‘Integer.parseInt(binaryStr, 2)’ for converting binary to decimal.

•	‘Integer.toBinaryString(int)’ for converting decimal to binary.

These methods are efficient and straightforward, allowing for quick and accurate conversions.

Basic Steps to Implement the App


1. UI Design:

•	Create an intuitive user interface with input fields, buttons, and output fields.

•	Use ‘EditText’ for user inputs and outputs.

•	Use ‘Button’ to trigger the conversion and reset actions.



2. Logic Implementation:

•	Capture user input from ‘EditText’ fields.

•	Implement the conversion logic in java using the appropriate methods.

•	Display the conversion results in the output ‘EditText’ fields.

•	Handle user interactions through ‘OnClickListener’ for buttons.



3. Testing and Debugging:

•	Test the app to ensure it correctly handles valid and invalid inputs.

•	Debug any issues to ensure smooth functionality.



3. Specific Operation of the Implementation:

The implementation involves the following key components and operations:

•	User Interface (UI): The UI is designed using a RelativeLayout with two EditText widgets for input and output, and two buttons for submission and one button for resetting.

•	Input Validation: The input EditText widget is configured to accept only binary digits (0 and 1).

•	Conversion Logic: The conversion from binary to decimal is handled in the onClick event of the submit button.

•	Event Handling: Event listeners are set up for the submit and reset buttons to handle user interactions.



UI Layout after design and Emulator display:
 
![Screenshot (28)](https://github.com/AlexChirwa/Java-Mobile-app-number-system-converter-/assets/153588378/4e26c368-7741-44ac-a0db-4d96a8107541)
![Screenshot (27)](https://github.com/AlexChirwa/Java-Mobile-app-number-system-converter-/assets/153588378/5c691a0f-21a2-4e45-ba30-cab030fea238)


User interaction with Input and Output Display:

![Screenshot (30)](https://github.com/AlexChirwa/Java-Mobile-app-number-system-converter-/assets/153588378/bfa8e49a-e42d-41a5-aed0-a90cd1dde405)
![Screenshot (29)](https://github.com/AlexChirwa/Java-Mobile-app-number-system-converter-/assets/153588378/266ea728-4efd-4c44-8179-a30418370f54)


4. Outlook and Future Improvements:

Enhanced User Interface

To improve the user experience, the following UI enhancements could be considered:

•	Better visual design with more engaging colors and styles.

•	Improved layout to accommodate various screen sizes and orientations.


Error Handling

Enhanced error handling can be implemented to provide more detailed feedback for invalid inputs, such as:

•	Highlighting incorrect input fields.

•	Displaying pop-up messages to guide users.

Additional Features

To expand the app’s functionality, the following features can be added:

•	Conversion History: Store and display a history of past conversions.

•	Educational Content: Include information and tutorials about binary and decimal number systems.

•	Additional Number Systems: Add support for other conversions, such as hexadecimal to decimal and vice versa.


Charts and Diagrams
Flowchart for Conversion Process:

![Screenshot (26)](https://github.com/AlexChirwa/Java-Mobile-app-number-system-converter-/assets/153588378/a0b221c4-1fa5-4106-a128-6491769c51e7)
![Screenshot (25)](https://github.com/AlexChirwa/Java-Mobile-app-number-system-converter-/assets/153588378/638f7616-e523-4296-883d-be917101b966)
