# Source - https://stackoverflow.com/q/38042632
# Posted by Kesto, modified by community. See post 'Timeline' for change history
# Retrieved 2026-09-01, License - CC BY-SA 3.0

from model import Person
import view

def showAll():
    #gets list of all Person objects
    people_in_db = Person.getAll()
    #calls view
    return view.showAllView(people_in_db)

def start():
    view.startView()
    input = raw_input()
    if input == 'y':
        return showAll()
    else:
        return view.endView()

if __name__ == "__main__":
    #running controller function
    start()
