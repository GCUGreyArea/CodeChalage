
NAME = sum2

TARGET  = test_$(NAME)
SRC		= test_main.cpp \
		  test_$(NAME).cpp

LIBDIR  = ../lib
LIBNAME = $(NAME)
LIB 	= $(LIBDIR)/lib$(NAME).a

LIBOBJ := $(patsubst %.c,%.o,$(LIBSRC))
LIBHDR := $(patsubst %.c,%.h,$(LIBSRC))
OBJ    := $(patsubst %.c,%.o,$(SRC))
HDR    := $(patsubst %.c,%.h,$(SRC))

CC     = gcc
CPP    = g++
CFLAGS = -g -std=c11 -Wall -ggdb3 -I$(LIBDIR) -L$(LIBDIR)
GFLAGS = -g -std=c++14 -Wall -ggdb3 -I$(LIBDIR) -L$(LIBDIR)

all: $(TARGET) $(OBJ)

$(TARGET) : $(OBJ) $(HDR) $(LIB)
	$(CPP) $(GFLAGS) $(OBJ) -o $(TARGET) -l$(NAME) -lgtest -lgtest_main -lpthread  -L$(LIBDIR) -I$(LIBDIR)
	./$(TARGET)

%.o: %.c
	$(CC) -c $(CFLAGS) $< -o $@

%.o: %.cpp
	$(CPP) -c $(GFLAGS) -c $< -o $@

clean:
	rm -rf *.a *.o $(TARGET)