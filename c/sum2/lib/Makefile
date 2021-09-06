LIBSRC = libsum2.c

LIB = libsum2.a
LIBDIR =  .

LIBOBJ := $(patsubst %.c,%.o,$(LIBSRC))
LIBHDR := $(patsubst %.c,%.h,$(LIBSRC))
OBJ    := $(patsubst %.c,%.o,$(SRC))
HDR    := $(patsubst %.c,%.h,$(SRC))

CC     = gcc
CFLAGS = -g -std=c11 -Wall -ggdb3 -I$(LIBDIR) -L$(LIBDIR)

all: $(LIB)

$(TARGET) : $(LIB)
	gcc $(CFLAGS) $(OBJ) $(LIB) -o $(TARGET) -lpthread -l$(LIB) -I$(LIBDIR)

$(LIB) : $(LIBOBJ) $(LIBHDR)
	ar rcs $(LIB) $(LIBOBJ)
	ranlib $(LIB)

%.o: %.c
	$(CC) -c $(CFLAGS) $< -o $@

clean:
	rm -rf *.a *.o
