from tkinter import *
from time import strftime

root = Tk()
root.title("DIGITAL CLOCK by Azhar Ahmed")
root.geometry("450x150")
root.configure(bg="white")
root.resizable(False, False)

label = Label(
    root,
    font=("elephant", 45, "bold"),
    bg="white",
    fg="red",
    justify="center",
    pady=50
    )

is_24hr = True

def time():
    if is_24hr:
        string = strftime("%H:%M:%S")
    else:
        string = strftime("%I:%M:%S %p")
    label.config(text=string)
    label.after(1000, time)

def twelve_to_twentyfour_toggle():
    global is_24hr
    is_24hr = not is_24hr
    toggle_btn.config(text="12hr" if is_24hr else "24hr")

toggle_btn = Button(
    root,
    text="12hr",
    font=("elephant", 12, "bold"),
    command=twelve_to_twentyfour_toggle,
    bg="white",
    fg="red",
    activebackground="white",
    activeforeground="black",
    cursor="hand2",
    bd=0
)
toggle_btn.place(relx=1.0, x=-10, y=10, anchor="ne") 
label.pack(anchor="center")

time()
root.mainloop() 