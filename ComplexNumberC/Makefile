#target: dependencies of that  
#	system command to build that  of that target                                                                                         #   system command to build that target
#   another command to build that target
#   etc 
#   -g DEBUG
#   -O Optimized
#   -s Produce and leave around assembly   
#	another command to build that target
#	etc 
#	-g DEBUG
#	-O Optimized
#	-s Produce and leave around assembly 


#to run use make -f (filename of makefile)
#or, if simply called makefile just enter make

all: complexNumberTester

complexNumber: complexNumber.o complexNumberTester.o 
	clang -o complexNumber complexNumberTester.o complexNumber.o -lstdc++
complexNumber.o: complexNumber.cc complexNumber.h
	clang -c complexNumber.cc

complexNumberTester.o: complexNumberTester.cc
	clang -c complexNumberTester.cc complexNumber.cc
clean:
	rm -f *.o complexNumberTester
