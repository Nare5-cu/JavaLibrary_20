
Library Management System with Separate Portals for Librarian and Student………
     
ABSTRACT
This Library Management System (LMS), developed in Java with NetBeans, enhances library operations by providing efficient portals for librarians and students. Utilizing a MySQL database and JDBC, it streamlines book management and resource access, minimizing paperwork and improving user experience.

Software Design 150s.


Table of Contents
Abstract	2
1. Introduction	2
1.1 What is a Library Management System (LMS)?	2
1.2 The Problem Before Computerized Systems	3
1.3 Project Objectives	3
1.4 Background of the Project	3
2. Development Process of the LMS	4
2.1 System Objectives	4
2.2 Key Features	4
2.2.1 User Login	4
2.2.2 Register New Books, Search for Books	4
2.3 Database Management	5
3. System Components	5
3.1 System Architecture	5
4. Technologies Used	5
4.1 Software Tools	5
4.2 Database Structure	5
5. System Workflow	6
5.1 Librarian (Administrator) Workflow	6
5.2 Student Workflow	6
6. Challenges and Solutions	7
6.1 Database Connectivity	7
6.2 Authentication and Authorization	7
7. Future Enhancements	7
8. Conclusion	8
9. List of references	9
10. Appendix	10
Figure 1.	10
11. Pseudocode:	10

Abstract
This report details the development and design of a Library Management System (LMS) implemented using Java in NetBeans. The system features two distinct portals—one for the librarian and another for the student—enabling efficient library management and access to library resources. The librarian can manage books, issue/return books, and view reports, while the student can search for books, view their borrowing history, and track due dates. The system utilizes a MySQL database for backend storage, with JDBC to connect the frontend interface to the database. The goal of this LMS is to simplify library operations, reduce manual paperwork, and provide a reliable system for both administrators and users.
1. Introduction
The library is regarded as the hub of research in educational institutions such as universities. The library houses the books and scientific information required by academic staff, students, and all science enthusiasts around the world( Sarma, 2016a). These libraries need to be controlled, which is called library management, meaning controlling the library’s resources and harnessing the library’s personnel to prevent any mistakes that may arise during the issuing and reissuing of books(Ali et al., 2019)
1.1 What is a Library Management System (LMS)?
A Library Management System (LMS) is a computerized system designed to manage library activities electronically. It helps librarians and users perform various library functions, such as book transactions, registration, and record keeping, more efficiently and accurately. The LMS reduces the risks associated with manual paper-based systems, such as loss of records, file damage, and time-consuming processes(Sarma, 2016b:Fengling, 2024).
Library management systems serve both library employees and users who access library resources. They streamline operations, minimize service errors (e.g., during book borrowing, returning, and reservations), and protect library resources by preventing loss, delay, or misuse. The system also maintains an archive for all library books. In this case, the system is designed specifically for Cape Peninsula University of Technology (CPUT) students. Only CPUT-registered students are granted access to the system, using their unique student numbers to log in to their library portal along with their self-created passwords.
An LMS usually comprises a relational database, software to interact with that database, and two graphical user interfaces: one for the administrator (librarian) and another for students(Li et al., 2012).
1.2 The Problem Before Computerized Systems
Before implementing a computerized system, libraries often faced several issues:
Record Loss: Physical files were prone to getting lost due to human error or environmental factors.
Searching Difficulties: With an increasing number of records, searching for specific items became cumbersome.
Space Constraints: As more records accumulated, the space required for physical file storage grew significantly.
1.3 Project Objectives
The primary objectives of this Library Management System include:
Allow CPUT students to register and create accounts online.
Provide individual student accounts where students can access information like borrowing history and search for books.
Maintain book details, including author information, the number of available copies, reference and non-reference books.
Track book issuance, return dates, and fines for delayed returns.
Enable administrators to add or update book records.
Improve time efficiency, enhance accuracy, and increase reliability by implementing security measures.
1.4 Background of the Project
This system was developed to address the challenges associated with manual library management. The project introduces automation to simplify library operations, minimize human error, and enhance accessibility for both librarians and students.
2. Development Process of the LMS
2.1 System Objectives
The system was developed to overcome current issues faced by library administrators:
Efficient Record Keeping: The system can add and validate users and ensure accurate data storage(Ali et al., 2019).
Reduced Human Effort: By automating tasks, less manpower is required to maintain the library, reducing operational costs.
Quick Search Functionality: The system allows librarians to search for records using keywords, reducing the time spent on manual searches.
2.2 Key Features
2.2.1 User Login
The LMS provides two separate login portals:
Student Portal: Students can log in with their unique student number and password. This portal allows them to view and manage their own account.
Librarian Portal: Librarians log in using their employee credentials. They have access to administrative functions, such as managing books and issuing or returning items.
The system ensures that only registered users can log in by performing authentication and authorization checks. Access rights differ based on the user's role (student or librarian).
2.2.2 Register New Books, Search for Books
The system enables librarians to:
Register New Books: Add new books with details like title, author, and publication date.
Search for Books: Librarians and students can search for books by entering keywords such as the book ID, title, publication, or author name. The search function efficiently filters and displays results based on the input criteria(Li et al., 2012).
2.3 Database Management
The system uses MySQL as its database management system. MySQL is favoured for its ease of use, scalability, and support for complex queries. It allows easy maintenance and quick retrieval of data using simple SQL commands.
3. System Components
3.1 System Architecture
The LMS follows a client-server architecture. It is built using Java for the frontend, with MySQL serving as the backend. The following are the key components of the system:
Frontend (Client): Java Swing is used to create the graphical user interface (GUI) for both the librarian and student portals(Li et al., 2012).
Backend (Server): A MySQL database stores information related to books, users, and transactions. Communication between the frontend and backend is established using JDBC (Java Database Connectivity)(Li et al., 2012).
The system architecture can be represented as follows:
4. Technologies Used
4.1 Software Tools
NetBeans IDE: NetBeans was used to develop the entire system. It provides robust support for Java development, debugging, and database integration.
Java: The core programming language used to implement the system's logic and user interface.
MySQL: A relational database used to store and manage all data related to books, students, and transactions.
JDBC: Java Database Connectivity (JDBC) enables communication between the Java application and the MySQL database.
4.2 Database Structure
The MySQL database consists of the following key tables:
Users: Stores user credentials and roles (student or librarian).
Books: Contains information about each book, including title, author, and availability.
IssuedBooks: Records the details of issued books, including issue date, return date, and associated fines.
5. System Workflow
5.1 Librarian (Administrator) Workflow
Login: The librarian logs in using a unique username and password.
Manage Books:
Add Book: Input new book details, including title, author, ISBN, and category.
Update Book: Modify existing book details as necessary.
Remove Book: Delete records of books no longer in the library.
Monitor Book Transactions:
Issue Book: Check book availability, register student details, and issue the book.
Return Book: Record returned books, update availability, and calculate late fees if applicable.
Manage Student Accounts: View and manage student information, ensuring all records are current and valid.
Logout: Securely log out of the system.

5.2 Student Workflow
Login: Students log in using their unique CPUT student number and self-created password.
Search Books: Use filters such as book title, author, or subject to find available resources.
Reserve Book: If a book is currently unavailable, students can place a reservation to be notified when it becomes available.
View Account: Check borrowing history, view due dates, and see any outstanding fines.
Request Book Renewal: Submit a request to renew borrowed books, extending the return date if no reservations are pending.
Logout: Log out to secure personal account information.

6. Challenges and Solutions
6.1 Database Connectivity
One of the main challenges was ensuring reliable connectivity between the Java application and the MySQL database. This was addressed by implementing JDBC, which provides a secure and efficient connection.
6.2 Authentication and Authorization
Implementing a robust user authentication system that separates librarian and student access was crucial. The system verifies user credentials and restricts access based on user roles.
7. Future Enhancements
Future improvements to the Library Management System could include:
Email Notifications: Automatically send reminders to students for upcoming return dates or overdue books.
Barcode Scanning: Implementing barcode scanning for quicker book check-ins and check-outs.
E-Book Integration: Allow students to borrow and read e-books through the system.
8. Conclusion
The Library Management System has successfully automated various library operations, making it more efficient for librarians to manage books and for students to access library resources. The implementation of separate portals for librarians and students ensures that each user group has access to relevant features. The system is built using Java and MySQL, providing scalability, efficiency, and security.
















9. List of references

Ali, B., Bushra, A. L., & Zainal, A. (2019). Developing a Library Management System for Managing the Books: A Suggested Model in the Central Library of Cihan University-Erbil. International Journal of Advanced Science and Technology, 28(13), 559–578. https://www.researchgate.net/publication/337905868
Analysis and Research on Library Management Technology Based on the Integration of Virtual Reality and Management. (2024).
Li, Y., Zheng, H., Yang, T., & Liu, Z. (2012). Design and implementation of a library management system based on the web service. Proceedings - 2012 4th International Conference on Multimedia and Security, MINES 2012, 433–436. https://doi.org/10.1109/MINES.2012.94
Sarma, G. K. (2016a). OPAC module in open source library management software: A comparative study. DESIDOC Journal of Library and Information Technology, 36(1), 56–61. https://doi.org/10.14429/djlit.36.1.9223
Sarma, G. K. (2016b). OPAC module in open source library management software: A comparative study. DESIDOC Journal of Library and Information Technology, 36(1), 56–61. https://doi.org/10.14429/djlit.36.1.9223
 










10. Appendix
Figure 1.












11. Pseudocode:
IssueBook
CLASS Issue_Book
    VARIABLES
        dbconn: dbconnect
        isbnNo: TextField
        studentId: TextField
        returnDate: DateChooser
        issueButton: Button

    CONSTRUCTOR Issue_Book()
        CALL initComponents()  // Initialize GUI components
        SET window location to center
        INITIALIZE dbconn with new dbconnect instance

    FUNCTION initComponents()
        // Create GUI components
        CREATE TextField isbnNo, studentId
        CREATE DateChooser returnDate
        CREATE Button issueButton with text "issue"
        SET action of issueButton TO issueBook

    FUNCTION issueBook(event)
        DECLARE VARIABLES
            ISBN = GET text from isbnNo
            student_id = GET text from studentId
            date_issued = GET date from returnDate
            return_date = CURRENT date

        PRINT date_issued
        PRINT return_date

        TRY
            PREPARE SQL statement:
                "INSERT INTO loan_history (title, ISBN, date_issued, return_date, student_id) 
                VALUES ((SELECT title FROM books WHERE ISBN=?), ?, ?, ?, ?)"
            SET parameters in SQL statement:
                parameter 1 = ISBN
                parameter 2 = ISBN
                parameter 3 = date_issued as string
                parameter 4 = return_date as string
                parameter 5 = student_id

            EXECUTE SQL statement
            IF rows_affected > 0 THEN
                SHOW message "Book has been loaned successfully"
            ELSE
                SHOW message "Error: something happened"
        CATCH Exception e
            PRINT error message from e

    FUNCTION start()
        SET Nimbus look and feel (if available)
        INVOKE new Issue_Book instance and set it visible

END CLASS

RetrunBook
PACKAGE librarymanagementsystem

CLASS ReturnBook EXTENDS JFrame

    VARIABLES
        dbconn : dbconnect
        ISBN : STRING
        student_id : STRING

    METHOD Constructor ReturnBook()
        CALL initComponents()
        dbconn = NEW dbconnect()
        ISBN = isbnNo.getText()
        student_id = studentID.getText()
        SET location to center of screen

    METHOD initComponents()
        INITIALIZE GUI components (labels, panels, buttons)
        SET action listener for jButton1 to CALL jButton1ActionPerformed()

    METHOD jButton1ActionPerformed(evt)
        DECLARE preparedStatement : PreparedStatement
        DECLARE result : ResultSet
        
        TRY
            preparedStatement = dbconn.conn.prepareStatement("DELETE FROM loan_history WHERE ISBN=? AND student_id=?; UPDATE books SET availability='Available';")
            preparedStatement.setString(1, ISBN)
            preparedStatement.setString(2, student_id)
            
            rows_affected = preparedStatement.executeUpdate()

            IF rows_affected > 0 THEN
                SHOW message "Book has been returned"
            ELSE
                SHOW message "Error: unable to return book"
            END IF
        CATCH Exception e
            PRINT error message

    METHOD start()
        TRY
            FOR EACH lookAndFeel IN UIManager.getInstalledLookAndFeels()
                IF lookAndFeel.name == "Nimbus" THEN
                    SET Look and Feel to lookAndFeel.className
                    BREAK
                END IF
            END FOR
        CATCH Exception ex
            LOG error message

        INVOKE EventQueue to RUN a new instance of ReturnBook

END CLASS

StudentInterface
PACKAGE librarymanagementsystem

CLASS StudentInterface EXTENDS JFrame

    VARIABLES
        bookCatalogue : BookCatalogue
        pendingReturns : PendingReturns
        studentID : STRING

    METHOD Constructor StudentInterface(student_id : STRING, name : STRING)
        CALL initComponents()
        SET location to center of screen
        this.studentID = student_id
        this.bookCatalogue = NEW BookCatalogue()
        this.pendingReturns = NEW PendingReturns(studentID, UserType.ADMIN_USER)
        displayName.setText(name)

    METHOD initComponents()
        INITIALIZE GUI components (panels, buttons, labels)
        SET action listener for jButton1 to CALL jButton1ActionPerformed()
        SET action listener for jButton2 to CALL jButton2ActionPerformed()
        SET action listener for logoutBtn to CALL logoutBtnActionPerformed()

    METHOD logoutBtnActionPerformed(evt)
        CLOSE the window

    METHOD jButton1ActionPerformed(evt)
        CALL pendingReturns.start()

    METHOD jButton2ActionPerformed(evt)
        CALL bookCatalogue.start()

    METHOD start()
        TRY
            FOR EACH lookAndFeel IN UIManager.getInstalledLookAndFeels()
                IF lookAndFeel.name == "Nimbus" THEN
                    SET Look and Feel to lookAndFeel.className
                    BREAK
                END IF
            END FOR
        CATCH Exception ex
            LOG error message

        INVOKE EventQueue to RUN a new instance of StudentInterface with empty parameters

END CLASS

LoginInterface
PACKAGE librarymanagementsystem

CLASS LoginInterface EXTENDS JFrame

    VARIABLES
        dbconn : dbconnect
        user_type : UserType
        _username : STRING
        passcode : STRING

    METHOD Constructor LoginInterface()
        CALL initComponents()
        SET location to center of screen
        dbconn = NEW dbconnect()

    METHOD initComponents()
        INITIALIZE GUI components (panels, buttons, labels)
        SET action listener for loginButton to CALL loginButtonActionPerformed()
        SET item listener for librarian radio button to CALL librarianItemStateChanged()
        SET action listener for librarian radio button to CALL librarianActionPerformed()
        SET action listener for student radio button to CALL studentActionPerformed()

    METHOD usernameActionPerformed(evt)
        // TODO: Handle username action

    METHOD passwordActionPerformed(evt)
        // TODO: Handle password action

    METHOD librarianActionPerformed(evt)
        // TODO: Handle librarian action

    METHOD studentActionPerformed(evt)
        // TODO: Handle student action

    METHOD loginButtonActionPerformed(evt)
        SET _username to text from username field
        SET passcode to text from password field
        IF librarian or student is selected THEN
            PREPARE statement for user authentication
            TRY
                SET tbname based on user_type
                PREPARE SQL query to select username, password, and name from tbname
                SET parameters for the prepared statement
                EXECUTE query and get results

                IF no results found THEN
                    PRINT "Error"
                ELSE
                    IF user_type is ADMIN_USER THEN
                        CREATE AdminInterface instance with username and name
                        HIDE current window
                        CALL admin.start()
                    ELSE
                        CREATE StudentInterface instance with username and name
                        HIDE current window
                        CALL stud_int.start()
                    END IF
                END IF
            CATCH Exception e
                PRINT error message
        ELSE
            SHOW dialog to select a user type (librarian/student)

    METHOD librarianItemStateChanged(evt)
        IF radio button is selected THEN
            SET user_type to ADMIN_USER
        ELSE
            SET user_type to STUDENT_USER

    METHOD start()
        TRY
            FOR EACH lookAndFeel in UIManager.getInstalledLookAndFeels()
                IF lookAndFeel.name == "Nimbus" THEN
                    SET Look and Feel to lookAndFeel.className
                    BREAK
                END IF
            END FOR
        CATCH Exception ex
            LOG error message

        INVOKE EventQueue to RUN a new instance of LoginInterface

END CLASS

AdminInterface
CLASS AdminInterface
    VARIABLES
        String gUsername
        String gName
        IssueBook issueBook
        ReturnBook returnBook
        BookCatalogue bookCatalogue
        PendingReturns pendingReturns
        ManageBooks manageBooks

    METHOD constructor(username, name)
        SET gUsername to username
        SET gName to name
        CALL initComponents()      // Initialize GUI components
        CENTER the window on the screen
        INITIALIZE issueBook, returnBook, bookCatalogue, pendingReturns, manageBooks
        SET displayName label to gName

    METHOD initComponents()
        SETUP GUI layout and components (panels, labels, buttons)
        ADD action listeners to buttons

    METHOD logoutButtonActionPerformed()
        CLOSE the application window

    METHOD issueBookButtonActionPerformed()
        CALL issueBook.start()

    METHOD viewAllBooksButtonActionPerformed()
        CALL bookCatalogue.start()

    METHOD viewPendingReturnsButtonActionPerformed()
        CALL pendingReturns.start()
        CALL pendingReturns.getPendingBooks()

    METHOD returnBookButtonActionPerformed()
        CALL returnBook.start()

    METHOD manageBooksButtonActionPerformed()
        CALL manageBooks.start()

    METHOD start()
        TRY to set Nimbus look and feel
            FOR each installed look and feel
                IF "Nimbus" is found THEN
                    SET look and feel
                    BREAK
        CATCH exceptions and log errors

        CALL run GUI in event dispatch thread
            CREATE new AdminInterface with gUsername and gName
            SET this interface to visible

END CLASS


ManageBooks

CLASS ManageBooks EXTENDS JFrame

    VARIABLES
        String title
        String author
        String year
        String ISBN
        String genre
        dbconnect dbconn

    METHOD ManageBooks()
        CALL initComponents()
        INITIALIZE dbconn

    METHOD initComponents()
        CREATE GUI components (panels, labels, text fields, buttons)
        SET event listeners for buttons (addBtn, removeBtn)
        CONFIGURE layout of the components

    METHOD addBtnActionPerformed(evt)
        DECLARE PreparedStatement preparedStatement
        DECLARE ResultSet result

        TRY
            preparedStatement = dbconn.conn.prepareStatement("SELECT ISBN FROM books WHERE ISBN=?")
            preparedStatement.setString(1, ISBN)

            result = preparedStatement.executeQuery()
            IF result is empty THEN
                preparedStatement = dbconn.conn.prepareStatement("INSERT INTO loan_history (title, author, year, ISBN, availability, genre) VALUES(?, ?, ?, ?, ?, ?)")
                preparedStatement.setString(1, title)
                preparedStatement.setString(2, author)
                preparedStatement.setString(3, year)
                preparedStatement.setString(4, ISBN)
                preparedStatement.setString(5, "Available")
                preparedStatement.setString(6, genre)

                IF rows affected > 0 THEN
                    DISPLAY "Book has been ad


ReportMissingBook
PACKAGE librarymanagementsystem

CLASS ReportMIissingBook EXTENDS JFrame

    // Attributes
    dbconnect dbconn

    // Constructor
    FUNCTION ReportMIissingBook()
        CALL initComponents()
        dbconn = new dbconnect()

    // Method to initialize UI components
    FUNCTION initComponents()
        // Set up main window properties
        SET defaultCloseOperation to EXIT_ON_CLOSE
        SET background color to white
        SET resizable to false

        // Set up header panel
        CREATE jPanel1
        CREATE jLabel4 with text "REPORT MISSING BOOK"
        ADD jLabel4 to jPanel1

        // Set up input panel
        CREATE jPanel2
        CREATE labels for "ISBN" and "Fine"
        CREATE input fields: isbnNo and fineAmount
        CREATE button jButton1 with text "REPORT"
        ADD action listener to jButton1 that calls reportMissingBook()

        // Layout the panels
        SET layout for the main window to include jPanel1 and jPanel2

    // Method to handle button click
    FUNCTION reportMissingBook()
        STRING ISBN = isbnNo.getText()
        DOUBLE fine = PARSE_DOUBLE(fineAmount.getText())

        TRY
            // Prepare SQL statement
            PREPARE preparedStatement WITH SQL INSERT INTO missing_books (ISBN, fine, last_issued, issued_to)
                SET parameters for preparedStatement
                SET preparedStatement parameters (ISBN, fine)



BookCatelogue

CLASS BookCatalogue EXTENDS JFrame

    DECLARE dbconnect dbconn

    CONSTRUCTOR BookCatalogue()
        CALL initComponents()
        SET window location to center
        INITIALIZE dbconn = new dbconnect()
        CALL getAllBooks()

    METHOD displayBooks(ResultSet result, DefaultTableModel model)
        DECLARE String data[6]
        TRY
            WHILE result.next()
                SET data[0] = result.getString("title")
                SET data[1] = result.getString("author")
                SET data[2] = result.getString("year")
                SET data[3] = result.getString("ISBN")
                SET data[4] = result.getString("genre")
                SET data[5] = result.getString("availability")
                
                IF result.getString("availability") EQUALS "Available"
                    // Do nothing, or add any specific logic if needed

                CALL model.addRow(data)
                SET bookCount text to "Book: " + model.getRowCount()
        CATCH Exception e
            // Handle exceptions

    METHOD getAllBooks()
        DECLARE PreparedStatement preparedStatement
        DECLARE ResultSet result
        TRY
            INITIALIZE preparedStatement with SQL query to count and select books
            EXECUTE preparedStatement to get result
            
            IF result.next() IS FALSE
                PRINT "not found"
            ELSE
                PRINT "found"
                DECLARE DefaultTableModel model = (DefaultTableModel) BookTable.getModel()
                CALL model.setRowCount(0)
                CALL displayBooks(result, model)
        CATCH Exception e
            PRINT e.getMessage()

    METHOD initComponents()
        // GUI initialization code

    METHOD genreFilterActionPerformed(ActionEvent evt)
        // Handle genre filter actions

    METHOD searchBtnActionPerformed(ActionEvent evt)
        DECLARE String search_text = getTextFrom searchText
        DECLARE String s_filter = getSelectedItem from searchFilter
        DECLARE String select_statement
        DECLARE PreparedStatement preparedStatement
        DECLARE ResultSet result
        DECLARE DefaultTableModel model = (DefaultTableModel) BookTable.getModel()
        
        TRY
            SELECT appropriate SQL statement based on s_filter
            SET preparedStatement with select_statement
            SET preparedStatement parameters
            EXECUTE preparedStatement
            CALL model.setRowCount(0)
            CALL displayBooks(result, model)
        CATCH Exception e
            // Handle exceptions

    METHOD filterBtnActionPerformed(ActionEvent evt)
        DECLARE String genre = getSelectedItem from genreFilter
        DECLARE String status = getSelectedItem from availabilityFilter
        
        TRY
            INITIALIZE SQL query based on genre and status selections
            EXECUTE query and retrieve results
            CALL model.setRowCount(0)
            CALL displayBooks(result, model)
        CATCH Exception e
            // Handle exceptions

    METHOD sortBooks(String order)
        DECLARE String sortfilter = getSelectedItem from sortFilter
        
        TRY
            INITIALIZE SQL query for sorting books
            EXECUTE query
            CALL model.setRowCount(0)
            CALL displayBooks(result, model)
        CATCH Exception e
            PRINT e.getMessage()

    METHOD sortAscItemStateChanged(ItemEvent evt)
        IF evt.getStateChange() EQUALS SELECTED
            CALL sortBooks("ASC")
        ELSE IF evt.getStateChange() EQUALS DESELECTED
            CALL sortBooks("DESC")

    METHOD start()
        TRY
            SET look and feel
        CATCH Exceptions
            // Handle exceptions

        CALL EventQueue.invokeLater to create and display form

END CLASS


