; WSSTART.SC - Start the Paradox Application Workshop
; Copyright 1992 - Borland International - All Rights Reserved
;
; Setup AUTOLIB
   Autolib = SDir()+"WORKSHOP\\WORKSHOP"
           + IIf(IsAssigned(PPO_App["Autolib"]) And (PPO_App["Autolib"]<>""),
                 ","+PPO_App["Autolib"],"")

PPP_Startup_U() ; Start the System

If IsAssigned(Retval) and Type(Retval) <> "L" and Not Isblank(Retval) Then
   Return Retval  ; Display Error Message!
EndIf
