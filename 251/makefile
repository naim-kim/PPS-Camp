# Set default Java compiler and classpath
JAVAC = javac
JAVA = java
SRC_DIR = .
BIN_DIR = bin

$(BIN_DIR):
	mkdir -p $(BIN_DIR)

# Compile all Main.java files under week folders
compile: $(BIN_DIR)
	find $(SRC_DIR) -name Main.java | xargs $(JAVAC) -d $(BIN_DIR)

# Run a specific problem, e.g., make run WEEK=week1 PROB=3
run:
	$(JAVA) -cp $(BIN_DIR) week$(WEEK).$(PROB).Main

# Clean all compiled class files
clean:
	rm -rf $(BIN_DIR)
