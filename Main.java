import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class Main{

    public static void main(String[]args){
        AyandaShanny app = new AyandaShanny();

    }
    public static class AyandaShanny extends JFrame implements ActionListener{
        JLabel eLibrarylabel = new JLabel("eLibrary");
        JLabel AdminLoginlabel = new JLabel("AdminLogin");
        JLabel LibrarianLoginlabel = new JLabel("LibrarianLogin");
        JLabel Emaillabel = new JLabel("Email");
        JLabel Passwordlabel = new JLabel("Password");
        JLabel Emaillabel1 = new JLabel("Email");
        JLabel Passwordlabel1 = new JLabel("Password");
        JTextField emailtextfield = new JTextField();
        JPasswordField passwordfield = new JPasswordField();
        JTextField emailtextfield1 = new JTextField();
        JPasswordField passwordfield1 = new JPasswordField();
        JButton loginbutton = new JButton("login-Admin");
        JButton loginbutton1= new JButton("login-Librarian");

        public AyandaShanny(){
            String adminemail="admin123456@gmail.com";
            String adminpassword="admin123456";
            String librarianemail ="librarian123456@gmail.com";
            String Librarianemail ="librarian123456";
;            eLibrarylabel.setBounds(300,0,120,90);
            this.add(eLibrarylabel);
            AdminLoginlabel.setBounds(60,30,120,90);
            this.add(AdminLoginlabel);
            Emaillabel.setBounds(60,80,120,90);
            this.add(Emaillabel);
            emailtextfield.setBounds(120,120,90,20);
            this.add(emailtextfield);
            Passwordlabel.setBounds(60,130,120,90);
            this.add(Passwordlabel);
            passwordfield.setBounds(120,170,90,20);
            this.add(passwordfield);
            LibrarianLoginlabel.setBounds(350,30,120,90);
            this.add(LibrarianLoginlabel);
            Emaillabel1.setBounds(350,80,120,90);
            this.add(Emaillabel1);
            emailtextfield1.setBounds(400,120,90,20);
            this.add(emailtextfield1);
            Passwordlabel1.setBounds(350,130,120,90);
            this.add(Passwordlabel1);
            passwordfield1.setBounds(410,170,90,20);
            this.add(passwordfield1);
            loginbutton.setBounds(60,250,120,30);
            this.add(loginbutton);
            loginbutton1.setBounds(350,250,120,30);
            this.add(loginbutton1);
            loginbutton.addActionListener(this);
            loginbutton1.addActionListener(this);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Library Management");
            this.setSize(530,320);
            this.setLayout(null);
            this.setVisible(true);
    
        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==loginbutton1){
               
                String librarianemail = emailtextfield1.getText();
                char[] librarianpassword = passwordfield1.getPassword();
                String librarianpasswordStr = String.valueOf(librarianpassword);

               
                if (librarianemail.equals("librarian123456@gmail.com")&&librarianpasswordStr.equals("librarian123456")){
                    JOptionPane.showMessageDialog(null,"login-Successfull","Welcome_Back" ,JOptionPane.PLAIN_MESSAGE);
                    this.dispose();
                    Library librarypage = new Library(); 
                }
               else {
              
                JOptionPane.showMessageDialog(null, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
               }
               
            }
            
            
            
        }
    }
   public static class Library extends JFrame implements ActionListener{
    JButton homebutton = new JButton("Home");
    JButton addbookbutton= new JButton("Add Book");
    JButton viewbookbutton= new JButton("ViewBook");
    JButton issuebookbutton = new JButton("Issuebook");
    JButton viewbookissuedbutton = new JButton("ViewBookIssued");
    JButton returnbookbutton = new JButton("ReturnBook");
    JButton logoutbutton = new JButton("Logout");
    public Library(){
        homebutton.setBounds(0,60,80,30);
        this.add(homebutton);
        addbookbutton.setBounds(110,60,90,30);
        this.add(addbookbutton);
        viewbookbutton.setBounds(220,60,90,30);
        this.add(viewbookbutton);
        issuebookbutton.setBounds(330,60,120,30);
        this.add(issuebookbutton);
        viewbookissuedbutton.setBounds(480,60,130,30);
        this.add(viewbookissuedbutton);
        returnbookbutton.setBounds(620,60,120,30);
        this.add(returnbookbutton);
        logoutbutton.setBounds(750,60,120,30);
        this.add(logoutbutton);
        homebutton.addActionListener(this);
        addbookbutton.addActionListener(this);
        viewbookbutton.addActionListener(this);
        issuebookbutton.addActionListener(this);
        viewbookissuedbutton.addActionListener(this);
        returnbookbutton.addActionListener(this);
        logoutbutton.addActionListener(this);
        this.setTitle("Libraruy");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,200);
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addbookbutton){
            this.dispose();
            Book addbook = new Book();

    }
    if(e.getSource()==logoutbutton){
        this.dispose();
        AyandaShanny app = new AyandaShanny();
    }
    if(e.getSource()==viewbookbutton){
        this.dispose();
        ViewBook viewBook = new ViewBook();
    }
    if(e.getSource()==issuebookbutton){
        this.dispose();
        IssueBook issuebook = new IssueBook();
    }
    if(e.getSource()==returnbookbutton){
        this.dispose();
        ReturnBook returnBook = new ReturnBook();
    }
    
    }
    
   }
   public static class Book extends JFrame implements ActionListener{
    JLabel booknamelabel = new JLabel("Title");
    JTextField booknametextfield = new JTextField();
    JLabel bookauthorlabel = new JLabel("Author");
    JTextField bookauthortextfield= new JTextField();
    JLabel bookisbnlabel = new JLabel("Isbn");
    JTextField bookisbntextfield = new JTextField();
    JLabel yearbooklabel = new JLabel("Year");
    JTextField yearbooktextfield = new JTextField();
    JButton submitbutton = new JButton("Submit");
    JButton backbutton = new JButton("Previous ");
    ArrayList<Book>bookList= new ArrayList<>();
    public Book(){
        
        booknamelabel.setBounds(10,30,90,30);
        this.add(booknamelabel);
        booknametextfield.setBounds(50,30,90,30);
        this.add(booknametextfield);
        bookauthorlabel.setBounds(10,100,90,30);
        this.add(bookauthorlabel);
        bookauthortextfield.setBounds(50,100,90,30);
        this.add(bookauthortextfield);
        bookisbnlabel.setBounds(10,150,90,30);
        this.add(bookisbnlabel);
        bookisbntextfield.setBounds(50,150,90,30);
        this.add(bookisbntextfield);
        yearbooklabel.setBounds(10,200,90,30);
        this.add(yearbooklabel);
        yearbooktextfield.setBounds(50,200,90,30);
        this.add(yearbooktextfield);
        submitbutton.setBounds(10,250,90,30);
        this.add(submitbutton);
        backbutton.setBounds(150,250,90,30);
        this.add(backbutton);
        backbutton.addActionListener(this);
        submitbutton.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,400);
        this.setLayout(null);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource()==submitbutton){
            String Title = booknametextfield.getText();
            String Author = bookauthortextfield.getText();
            String Isbn = bookisbntextfield.getText();
            int Year = Integer.parseInt(yearbooktextfield.getText()); 
            
            JOptionPane.showMessageDialog(null, "Submitted Successfully","null",JOptionPane.PLAIN_MESSAGE);
            
            
            bookList.add(new Book());
            booknametextfield.setText("");
            bookauthortextfield.setText("");
            bookisbntextfield.setText("");
            yearbooktextfield.setText("");

        }
        if(e.getSource()==backbutton){
            this.dispose();
            Library libtrarypage = new Library();
                }
    }
   }
   public static class ViewBook extends JFrame{
    public ViewBook(){
        this.setSize(700,700);
        this.setTitle("ViewBook");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
   }
   public static class IssueBook extends JFrame implements ActionListener{
    JLabel booknamelabel = new JLabel("Title");
    JTextField booknametextfield = new JTextField();
    JLabel bookauthorlabel = new JLabel("Author");
    JTextField bookauthortextfield= new JTextField();
    JLabel bookisbnlabel = new JLabel("Isbn");
    JTextField bookisbntextfield = new JTextField();
    JLabel yearbooklabel = new JLabel("Year");
    JTextField yearbooktextfield = new JTextField();
    JLabel studentnamelabel = new JLabel("Student-name");
    JTextField studentnametextfield = new JTextField();
    JLabel studentidlabel= new JLabel("Student-ID");
    JTextField studentidtextfield = new JTextField();
    JLabel studentphonelabel = new JLabel("Student-Phone");
    JTextField studentphonetextfield = new JTextField();
    JLabel datelabel = new JLabel("Issued-Date");
    JTextField datetextfield= new JTextField();
    JButton submitbutton = new JButton("IssueBook");
    JButton backbutton = new JButton("Previous ");

    public IssueBook(){
        booknamelabel.setBounds(10,30,90,30);
        this.add(booknamelabel);
        booknametextfield.setBounds(50,30,90,30);
        this.add(booknametextfield);
        bookauthorlabel.setBounds(10,100,90,30);
        this.add(bookauthorlabel);
        bookauthortextfield.setBounds(50,100,90,30);
        this.add(bookauthortextfield);
        bookisbnlabel.setBounds(10,150,90,30);
        this.add(bookisbnlabel);
        bookisbntextfield.setBounds(50,150,90,30);
        this.add(bookisbntextfield);
        yearbooklabel.setBounds(10,200,90,30);
        this.add(yearbooklabel);
        yearbooktextfield.setBounds(50,200,90,30);
        this.add(yearbooktextfield);
        studentnamelabel.setBounds(10,250,120,30);
        this.add(studentnamelabel);
        studentnametextfield.setBounds(100,250,90,30);
        this.add(studentnametextfield);
        studentidlabel.setBounds(10,300,120,30);
        this.add(studentidlabel);
        studentidtextfield.setBounds(80,300,90,30);
        this.add(studentidtextfield);
        studentphonelabel.setBounds(10,350 ,120,30);
        this.add(studentphonelabel);
        studentphonetextfield.setBounds(120,350,90,30);
        this.add(studentphonetextfield);
        datelabel.setBounds(10,400,90,30);
        this.add(datelabel);
        datetextfield.setBounds(90,400,120,30);
        this.add(datetextfield);
        submitbutton.setBounds(10,500,120,30);
        this.add(submitbutton);
        backbutton.setBounds(150,500,90,30);
        this.add(backbutton);
        backbutton.addActionListener(this);
        submitbutton.addActionListener(this);
        this.setSize(600,600);
        this.setTitle("IssuedBook");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e ){
        if(e.getSource()==submitbutton){
            JOptionPane.showMessageDialog(null,"Book Issued Successfully","jOB done",JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource()==backbutton){
            this.dispose();
            Library libtrarypage = new Library();
        }
    }
   }
   public static class ReturnBook extends JFrame implements ActionListener{
    JLabel Isbnlabel = new JLabel("Book-Isbn");
    JTextField Isbntextfield = new JTextField();
    JLabel studentidlabel = new JLabel("Student-ID");
    JTextField studentidtextfield = new JTextField();
    JLabel datelabel = new JLabel("Return-Date");
    JTextField datetextfield= new JTextField();
    JButton returnbookbutton = new JButton("Return-Book");
    JButton backbutton = new JButton("Previous ");


    public ReturnBook(){
        Isbnlabel.setBounds(10,50,90,30);
        this.add(Isbnlabel);
        Isbntextfield.setBounds(80,50,120,30);
        this.add(Isbntextfield);
        studentidlabel.setBounds(10,80,90,30);
        this.add(studentidlabel);
        studentidtextfield.setBounds(80,80,120,30);
        this.add(studentidtextfield);
        datelabel.setBounds(10,120,90,30);
        this.add(datelabel);
        datetextfield.setBounds(80,120,90,30);
        this.add(datetextfield);
        returnbookbutton.setBounds(10,150,120,30);
        this.add(returnbookbutton);
        backbutton.setBounds(200,150,120,30);
        this.add(backbutton);
        returnbookbutton.addActionListener(this);
        backbutton.addActionListener(this);
        this.setTitle("Return book");
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==returnbookbutton){
            JOptionPane.showMessageDialog(null,"Book return successfully","JOD Done",JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource()==backbutton){
            this.dispose();
            Library libtrarypage = new Library();

        }
    }
   }
}