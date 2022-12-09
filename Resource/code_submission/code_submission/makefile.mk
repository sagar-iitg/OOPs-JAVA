all : process_mix_of_items
	process_mix_of_items

process_mix_of_items: process_mix_of_items.o stdafx.o 
	/usr/bin/g++ process_mix_of_items.o stdafx.o -o process_mix_of_items

process_mix_of_items.o: process_mix_of_items.cpp stdafx.cpp stdafx.h
	/usr/bin/g++ -g -c process_mix_of_items.cpp

stdafx.o: stdafx.cpp stdafx.h
	/usr/bin/g++ -g -c stdafx.cpp

clean :
	rm -f *.o
	rm -f process_mix_of_items

once :
