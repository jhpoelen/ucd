/*PDOX40.CMD     */
/* CMD File to create a desktop object for Paradox 4.0 */


/* Load REXXUTIL */
call rxfuncadd 'sysloadfuncs', 'rexxutil', 'sysloadfuncs'
call sysloadfuncs

/* Clear screen and prompt user for drive and path */

call SysCls

SAY "***************************************************************************"
SAY "*             PARADOX 4.0 OS/2 INSTALLATION PROGRAM            *"
SAY "***************************************************************************"
SAY ""
SAY "Enter complete path for Paradox system files"
PULL pdoxpath

IF (pdoxpath="")
	THEN pdoxpath=DIRECTORY()

x=length(pdoxpath)

IF  \(SUBSTR(pdoxpath, x, 1) = "\" )
	THEN pdoxpath = pdoxpath"\"

filespec = pdoxpath"dpmi16bi.ovl"	
call SysFileTree filespec, 'file', 'F'
IF file.0 = 0 
	THEN
		DO
		SAY pdoxpath"PARADOX.EXE NOT FOUND"
		EXIT
		END

classname = 'WPProgram'
location = '<WP_DESKTOP>'

title = "Paradox 4.0"
xe = pdoxpath"paradox.exe"
icon = pdoxpath"pdoxos2.ico"
call BldObj

title = "Tutility"
xe = pdoxpath"tutility.exe"
icon = pdoxpath"tutilos2.ico"
call BldObj

title = "Nupdate"
xe = pdoxpath"nupdate.exe"
icon = pdoxpath"nupdtos2.ico"
call BldObj
EXIT
BldObj:
setup = 'PROGTYPE=WINDOWEDVDM;EXENAME='xe';STARTUPDIR='pdoxpath';SET DPMI_DOS_API=ENABLED;SET DPMI_MEMORY_LIMIT=4;ICONFILE 'icon';'
call charout , 'Building : 'title
result = SysCreateObject(classname, title, location, setup)

If result = 1 then call charout ,'...  Object created! '
Else                      call charout ,'...  Not created! Return code = 'result
SAY ' '
RETURN
		
