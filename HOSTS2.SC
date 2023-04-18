
;PROC HostFind() ; LISTS HOSTS OF CHALCIDOID PARASITOIDS, WITH REFERENCES

;PRIVATE ButtonValue,
;        ParGenus,
;        ParSpecies

ECHO NORMAL

CLEARALL
 
ParGenus = ""
ParSpecies = ""

SHOWDIALOG "Listing Hosts of a Known Chalcid" @ 6,7 HEIGHT 13 WIDTH 56
 @2,13 ??"Use 'Tab' key to move"
 @3,17 ??"between boxes"
 @5,3 ?? "Enter generic name: "
 @7,3 ?? "Enter species name:"

 ACCEPT @5,24
  WIDTH 23 "A23"
  TAG "ParGenusName"
  TO ParGenus
  
 ACCEPT @7,24
  WIDTH 23 "A23"
  TAG "ParSpeciesName"
  TO ParSpecies

 PUSHBUTTON @9,9 WIDTH 10
   "~O~K"
   OK
   DEFAULT
   VALUE "OK"
   TAG "OK"
   TO ButtonValue

 PUSHBUTTON @ 9,29 WIDTH 10
  "~C~ancel"
  CANCEL
  VALUE "Cancel"
  TAG "Cancel"
  TO ButtonValue

ENDDIALOG

IF (Retval = False) THEN RETURN 
ENDIF

;Play "Hostpar1"

IF (ISBLANK(ParSpecies)) 
   THEN Play  "HostRef1"; same as Par1()
   ELSE Play  "HostRef2"; same as Par2()
ENDIF

 