/*TutilOS2.CMD     */
/* CMD File to create a desktop object for Tutility */


/* Load REXXUTIL */
call rxfuncadd 'sysloadfuncs', 'rexxutil', 'sysloadfuncs'
call sysloadfuncs

/* Clear screen and prompt user for drive and path */

call SysCls

SAY "***************************************************************************"
SAY "*             Tutility 4.0 OS/2 INSTALLATION PROGRAM            *"
SAY "***************************************************************************"
SAY ""
SAY "Enter complete path for Tutilty system files"
PULL pdoxpath

IF (pdoxpath="")
	THEN pdoxpath=DIRECTORY()

x=length(pdoxpath)

IF \ (SUBSTR(pdoxpath, x, 1) = "\" )
	THEN pdoxpath = pdoxpath"\"

filespec = pdoxpath"tutility.exe"	
call SysFileTree filespec, 'file', 'F'
IF file.0 = 0
	THEN
		DO
		SAY pdoxpath"TUTILITY.EXE NOT FOUND"
		EXIT
		END
title = "Tutility"
classname = 'WPProgram'
location = '<WP_DESKTOP>'
setup = 'PROGTYPE=WINDOWEDVDM;EXENAME='pdoxpath'tutility.exe;STARTUPDIR='pdoxpath';SET DPMI_DOS_API=ENABLED;SET DPMI_MEMORY_LIMIT=4;ICONFILE 'pdoxpath'tutilos2.ico;'

BldObj:
call charout , 'Building : 'title
result = SysCreateObject(classname, title, location, setup)

If result = 1 then call charout ,'...  Object created! '
Else                      call charout ,'...  Not created! Return code = 'result
SAY ' '

		
