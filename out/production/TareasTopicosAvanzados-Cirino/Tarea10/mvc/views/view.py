# Source - https://stackoverflow.com/q/38042632
# Posted by Kesto, modified by community. See post 'Timeline' for change history
# Retrieved 2026-09-01, License - CC BY-SA 3.0

from model import Person


def showAllView(list):
    print 'In our db we have %i users. Here they are:' % len(list)
    for item in list:
        print item.name()
def startView():
    print 'MVC - the simplest example'
    print 'Do you want to see everyone in my db?[y/n]'

def endView():
    print 'Goodbye!'    

