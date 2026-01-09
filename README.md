InsertStudentRecord
📌 Objective
This program inserts a new student’s details (id, name, age) into a database table called students using JDBC.

⚙️ Concepts Used
JDBC (Java Database Connectivity) → API for communication between Java applications and databases.

Driver Loading → Loads Oracle JDBC driver so Java can talk to Oracle DB.

Database Connection → Establishes connection using database URL, username, and password.

User Input → Collects student details from the console.

SQL Query Execution → Executes an INSERT statement to add the record.

Result Handling → Prints success or error message based on execution result.

Resource Management → Closes connections and statements to free resources.

🔄 Flow of Work
Load JDBC driver

Connect to Oracle database

Take student details from user

Form an SQL INSERT query

Execute the query

Show success or error message

Close all resources

▶️ How to Run
Ensure Oracle DB is installed and running.

Create a table students with columns (id, name, age).

Compile the program:

bash
javac InsertStudentRecord.java
Run the program:

bash
java InsertStudentRecord
Enter student details when prompted.
