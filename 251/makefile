JAVAC = javac
JAVA = java

SRC_DIR = week1
BIN_DIR = bin

# All Java sources (without extension)
EXES = a001 a002 a003 a004 a005

# Default target: compile all
all: $(EXES)

# Pattern rule to compile each .java file
$(EXES):
	$(JAVAC) -d $(BIN_DIR) $(SRC_DIR)/$@.java

# Run a specific class: make run target=a001
run:
	$(JAVA) -cp $(BIN_DIR) week1.$(target)

# Clean compiled .class files
clean:
	rm -rf $(BIN_DIR)/*

# java -cp bin a001	
