; THIS IS A SCRIPT TO ADD A HOST NAME NEWLY ADDED TO THE "HOSTFAM" TABLE
; TO BOTH THE "HOSTS" and "NEWHOST" TABLES
MOVETO [Host genus]
x = STRVAL ([Host genus])
MOVETO [Host species]
y = STRVAL ([Host species])
MOVETO [Host author]
yz = STRVAL([Host author])
MOVETO [Primary host family]
z = STRVAL([Primary host family])
MOVETO [Host number]
b = STRVAL([Host number])
UPIMAGE; to hosts
UPIMAGE; to hknew
UPIMAGE; to tstat
UPIMAGE; to master
CtrlPgUp CtrlPgDn
FORMKEY
MOVETO [Newhost ->]
END
DOWN
MOVETO [Host genus]
TYPEIN x
MOVETO [Host species]
TYPEIN y
MOVETO [Host author]
TYPEIN yz
MOVETO [Primary host family]
TYPEIN z
MOVETO [Host number]
TYPEIN b
MOVETO [Master ->]
FORMKEY
DOWNIMAGE; (to "TSTAT")
DOWNIMAGE; (to "HKNEW")
DOWNIMAGE; (to "HOSTS")
MOVETO [Host genus]
TYPEIN x
MOVETO [Host species]
TYPEIN y
MOVETO [Host author]
TYPEIN yz
MOVETO [Host number]
TYPEIN b
MOVETO [Primary host family]
TYPEIN z