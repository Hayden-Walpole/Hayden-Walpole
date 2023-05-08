
from turtle import *
def draw_square(square_turtle,side_length):
    for side in range(4):
        square_turtle.forward(side_length)
        square_turtle.left(90)
window = Screen()
alex = Turtle()
grace= Turtle()
alex.penup()
alex.goto(-100,-100)
alex.pendown()
def spirial(turtlename,size):
    for num_square in range(18):
        turtlename.pensize(2+(num_square*.1))
        turtlename.pencolor((.8-.05),.1,(.1+.05))
        draw_square(turtlename,size)
        turtlename.left(20)
        turtlename.pencolor((.8-.05),.1,(.1+.05))
spirial(alex,100)
spirial(grace, 200)
window.exitonclick()