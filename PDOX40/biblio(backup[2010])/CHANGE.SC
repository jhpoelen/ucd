ALTSPACE {Desktop} {Empty} 
ECHO OFF
VIEW "Refs"
VIEW "Refext"
VIEW "Famtrib"
VIEW "Genus"
VIEW "Species"
VIEW "Tstat"
VIEW "Hknew"
VIEW "Hosts"
VIEW "Dist"
COEDITKEY

ref1 = x
newref = y

MOVETO "Refs"
MOVETO [RefCode]
 LOCATE ref1
 WHILE Retval
  REPLACEFIELDS [RefCode] WITH newref
  LOCATE NEXT ref1
 ENDWHILE

MOVETO "Refext"
MOVETO [RefCode]
 LOCATE ref1
 WHILE Retval
  REPLACEFIELDS [RefCode] WITH newref
  LOCATE NEXT ref1
 ENDWHILE

MOVETO "Famtrib"
 MOVETO [RefCode]
 ORDERTABLE 
 LOCATE ref1
  WHILE Retval
   REPLACEFIELDS [RefCode] WITH newref
   LOCATE NEXT ref1
  ENDWHILE

MOVETO "Genus"
 MOVETO [RefCode]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
   REPLACEFIELDS [RefCode] WITH newref
   LOCATE NEXT ref1
  ENDWHILE
 MOVETO [Designator]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
  REPLACEFIELDS [Designator] WITH newref
  LOCATE NEXT ref1
 ENDWHILE
 
MOVETO "Species"
 MOVETO [RefCode]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
   REPLACEFIELDS [RefCode] WITH newref
   LOCATE NEXT ref1
  ENDWHILE
 MOVETO [Designator]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
  REPLACEFIELDS [Designator] WITH newref
  LOCATE NEXT ref1
 ENDWHILE

MOVETO "Tstat"
 MOVETO [RefCode]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
   REPLACEFIELDS [RefCode] WITH newref
   LOCATE NEXT ref1
  ENDWHILE
 MOVETO [RefCodeB]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
  REPLACEFIELDS [RefCodeB] WITH newref
  LOCATE NEXT ref1
 ENDWHILE

MOVETO "Hknew"
 MOVETO [RefCode]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
   REPLACEFIELDS [RefCode] WITH newref
   LOCATE NEXT ref1
  ENDWHILE

MOVETO "Hosts"
 MOVETO [RefCode]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
   REPLACEFIELDS [RefCode] WITH newref
   LOCATE NEXT ref1
  ENDWHILE

MOVETO "Dist"
 MOVETO [RefCode]
 ORDERTABLE
 LOCATE ref1
  WHILE Retval
   REPLACEFIELDS [RefCode] WITH newref
   LOCATE NEXT ref1
  ENDWHILE

Do_It!

MOVETO "Refs"
MOVETO [RefCode]
LOCATE newref
FORMKEY