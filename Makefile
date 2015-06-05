#--------------------------------------------------------------------
# Name:	Lin, Yu-An
# CruzID:	ylin62
# Class:	CMPS12B
# Description: Macros
#	Makefile creates a Extrema jar file along with some fuctions
# Special Instructions:
#--------------------------------------------------------------------

JAVASRC		= Extrema.java
MAINCLASS	= Extrema
CLASSES		= Extrema.class
JARFILE		= Extrema
SOURCE		= Makefile README $(JAVASRC)
SUBMIT		= submit cmps012b-pt.s15 pa1 

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	echo Main-Class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest
	chmod +x $(JARFILE)

$(CLASSES): $(JAVASRC)
	javac -Xlint $(JAVASRC)

clean: 
	rm $(CLASSES) $(JARFILE)

submit: $(SOURCE)
	$(SUBMIT) $(SOURCE)
