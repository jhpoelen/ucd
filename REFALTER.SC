ECHO OFF

x = ""
y = ""
SHOWDIALOG "Reference Code Changes" @ 6,15 HEIGHT 11 WIDTH 50
 @2,3 ?? "Enter code to be changed: "
 ACCEPT @2,30
  WIDTH 15 "A15"
  TAG "OldName"
  TO x
 @4,3 ?? "Enter new code:"
 ACCEPT @4,30
  WIDTH 15 "A15"
  TAG "NewName"
  TO y

 PUSHBUTTON @7,9 WIDTH 10
   "O~K~"
   OK
   DEFAULT
   VALUE "Say Yes"
   TAG "Yes"
   TO ButtonValue

 PUSHBUTTON @ 7,29 WIDTH 10
  "~C~ancel"
  CANCEL
  VALUE "Say No"
  TAG "No"
  TO ButtonValue



ENDDIALOG

SHOWMENU
  "Exit": "Leave Programme",
  "Continue": "Continue"

TO response

SWITCH
  CASE response = "Continue":
    PLAY "Change"
  CASE response = "Exit":
    QUIT
  OTHERWISE:
    QUIT
ENDSWITCH

