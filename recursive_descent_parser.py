def main():
    global buffer,l
    l=0
    buffer = ['+','i','$']
    E()
    if(l<len(buffer)):
        if(buffer[l]=='$'):
            print("Parsing successful")
        else:
            print("Not successful")
def E():
    global buffer,l
    if(l<len(buffer)):
        if(buffer[l]=='i'):
            match('i')
            E1()

def E1():
    global buffer,l
    if(l<len(buffer)):
        if(buffer[l]=='+'):
            match('+')
            match('i')
            E1()
        else:
            return ()

def match(t):
    global buffer,l
    if(l<len(buffer)):
        if(buffer[l]==t):
            l = l+1
        else:
            print("Error")

if __name__=='__main__':
    main()
