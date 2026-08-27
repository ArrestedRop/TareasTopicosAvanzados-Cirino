from tkinter import * #Import tkinter

def createGUI():
  global label, button
  
  window = Tk() # Create a root window
  label = Label(window, text = "Welcome to Python") # Create a label
  button = Button(window, text = "Click Me") # Create a button 
  return window 

def show():
  label.pack() # Display the label in the window
  button.pack() # Display the button in the window

def main():
  window = createGUI()
  show()
  window.mainloop() # Create an event loop

main()


