import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

// ===== MAIN JAVA CODE: CONSTANTS =====
public class SmartAttendanceSystemUI {
    private static final String STUDENT_FILE = "students.dat";
    private static final String TEACHER_FILE = "teachers.dat";
    private static final String COURSE_FILE = "courses.dat";
    
    // ===== MAIN JAVA CODE: COLOR SCHEME =====
    private static final Color BACKGROUND_COLOR = new Color(15, 23, 42);
    private static final Color CARD_COLOR = new Color(30, 41, 59);
    private static final Color ACCENT_COLOR = new Color(99, 102, 241);
    private static final Color SUCCESS_COLOR = new Color(16, 185, 129);
    private static final Color WARNING_COLOR = new Color(245, 158, 11);
    private static final Color DANGER_COLOR = new Color(239, 68, 68);
    private static final Color TEXT_COLOR = new Color(248, 250, 252);
    private static final Color SECONDARY_TEXT_COLOR = new Color(148, 163, 184);
    private static final Color TEXT_FIELD_BG = new Color(51, 65, 85);
    private static final Color BORDER_COLOR = new Color(99, 102, 241);
    
    // ===== MAIN JAVA CODE: DATA STORAGE =====
    private static java.util.List<Student> students = new ArrayList<>();
    private static java.util.List<Teacher> teachers = new ArrayList<>();
    private static java.util.List<Course> courses = new ArrayList<>();
    
    // ===== MAIN JAVA CODE: ENTITY CLASSES =====
    static class AttendanceDay implements Serializable {
        Map<String, String> studentStatus = new HashMap<>();
    }
    
    static class Course implements Serializable {
        String courseId;
        String courseName;
        String teacherId;
        int semester;
        Map<String, AttendanceDay> attendanceByDate = new HashMap<>();
        
        Course(String id, String name, String tId, int sem) {
            this.courseId = id; this.courseName = name; this.teacherId = tId; this.semester = sem;
        }
    }
    
    static class Student implements Serializable {
        String studentId; String name; int semester;
        Student(String id, String name, int sem) { this.studentId = id; this.name = name; this.semester = sem; }
    }
    
    static class Teacher implements Serializable {
        String teacherId; String name; java.util.List<String> assignedCourses = new ArrayList<>();
        Teacher(String id, String name) { this.teacherId = id; this.name = name; }
    }
    
    // ===== MAIN JAVA CODE: MAIN ENTRY POINT =====
    public static void main(String[] args) {
        loadData();
        if (students.isEmpty() && teachers.isEmpty() && courses.isEmpty()) {
            loadSampleData();
            saveData();
        }
        setupLookAndFeel();
        SwingUtilities.invokeLater(SmartAttendanceSystemUI::showMainMenu);
    }
    
    // ===== MAIN JAVA CODE: DATA MANAGEMENT =====
    private static void loadData() {
        students = loadFromFile(STUDENT_FILE);
        teachers = loadFromFile(TEACHER_FILE);
        courses = loadFromFile(COURSE_FILE);
    }
    
    private static void saveData() {
        saveToFile(STUDENT_FILE, students);
        saveToFile(TEACHER_FILE, teachers);
        saveToFile(COURSE_FILE, courses);
    }
    
    @SuppressWarnings("unchecked")
    private static <T> java.util.List<T> loadFromFile(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (java.util.List<T>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
    private static void saveToFile(String file, Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(obj);
        } catch (Exception ignored) {}
    }
    
    private static void loadSampleData() {
        Teacher t1 = new Teacher("T1", "Dr. Smith");
        teachers.add(t1);
        
        Course c1 = new Course("C1", "Mathematics", "T1", 1);
        t1.assignedCourses.add(c1.courseId);
        courses.add(c1);
        
        Course c2 = new Course("C2", "Physics", "T1", 1);
        t1.assignedCourses.add(c2.courseId);
        courses.add(c2);
        
        students.add(new Student("S1", "Alice Johnson", 1));
        students.add(new Student("S2", "Bob Smith", 1));
        students.add(new Student("S3", "Charlie Brown", 1));
    }
    
    // ===== UI CODE: UI SETUP =====
    private static void setupLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // ===== UI CODE: UI COMPONENT FACTORIES =====
    private static JButton createButton(String text, Color bgColor) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                if (!isOpaque()) {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2d.setColor(getModel().isPressed() ? bgColor.darker() : bgColor);
                    g2d.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
                    g2d.dispose();
                }
                super.paintComponent(g);
            }
            
            @Override
            public void setContentAreaFilled(boolean b) {
                super.setContentAreaFilled(false);
            }
        };
        
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setPreferredSize(new Dimension(200, 45));
        button.setBorder(BorderFactory.createEmptyBorder(12, 25, 12, 25));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(bgColor.brighter());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(bgColor);
            }
        });
        
        return button;
    }
    
    private static JLabel createLabel(String text, int size, Color color) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, size));
        label.setForeground(color);
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return label;
    }
    
    private static JTextField createTextField() {
        JTextField textField = new JTextField();
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        textField.setBackground(TEXT_FIELD_BG);
        textField.setForeground(TEXT_COLOR);
        textField.setCaretColor(TEXT_COLOR);
        textField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 2),
            BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));
        return textField;
    }
    
    private static JPanel createCardPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(CARD_COLOR);
        
        panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10),
            BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER_COLOR, 2, true),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
            )
        ));
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        return panel;
    }
    
    private static JFrame createFrame(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(BACKGROUND_COLOR);
        return frame;
    }
    
    // ===== UI CODE: MAIN SCREENS =====
    private static void showMainMenu() {
        JFrame frame = createFrame("Smart Attendance System");
        JPanel mainPanel = createMainPanel();
        
        // Title section with centered layout
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setBackground(BACKGROUND_COLOR);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));
        titlePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        ImageIcon icon = createIcon(80, 80);
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel titleLabel = createLabel("SMART UNIVERSITY ATTENDANCE", 28, ACCENT_COLOR);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        titlePanel.add(iconLabel);
        titlePanel.add(titleLabel);
        
        // Center the title panel
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(BACKGROUND_COLOR);
        centerPanel.add(titlePanel);
        
        // Buttons section
        JPanel buttonsPanel = new JPanel(new GridLayout(2, 2, 20, 20));
        buttonsPanel.setBackground(BACKGROUND_COLOR);
        
        buttonsPanel.add(createButton("Admin Login", ACCENT_COLOR));
        buttonsPanel.add(createButton("Teacher Login", new Color(79, 70, 229)));
        buttonsPanel.add(createButton("Student Login", new Color(16, 185, 129)));
        buttonsPanel.add(createButton("Exit", DANGER_COLOR));
        
        // Status bar
        JPanel statusPanel = new JPanel(new BorderLayout());
        statusPanel.setBackground(BACKGROUND_COLOR);
        statusPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        
        JLabel statusLabel = new JLabel(
            "Students: " + students.size() + " | Teachers: " + teachers.size() + " | Courses: " + courses.size(), 
            SwingConstants.CENTER
        );
        statusLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        statusLabel.setForeground(SECONDARY_TEXT_COLOR);
        statusPanel.add(statusLabel, BorderLayout.CENTER);
        
        // Add action listeners
        ((JButton)buttonsPanel.getComponent(0)).addActionListener(e -> { frame.dispose(); showAdminMenu(); });
        ((JButton)buttonsPanel.getComponent(1)).addActionListener(e -> { frame.dispose(); teacherLogin(); });
        ((JButton)buttonsPanel.getComponent(2)).addActionListener(e -> { frame.dispose(); studentLogin(); });
        ((JButton)buttonsPanel.getComponent(3)).addActionListener(e -> System.exit(0));
        
        mainPanel.add(centerPanel);
        mainPanel.add(buttonsPanel);
        mainPanel.add(statusPanel);
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    private static JPanel createMainPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(BACKGROUND_COLOR);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        return panel;
    }
    
    // ===== UI CODE: ADMIN SCREEN =====
    private static void showAdminMenu() {
        JFrame frame = createFrame("Admin Panel");
        JPanel mainPanel = createMainPanel();
        
        // Centered title
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBackground(BACKGROUND_COLOR);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));
        titlePanel.add(createLabel("ADMIN PANEL", 24, ACCENT_COLOR), BorderLayout.CENTER);
        
        // Category panels
        JPanel studentPanel = createCategoryPanel("Students", 
            new String[]{"Add Student", "Edit Student", "Delete Student"},
            new Color(16, 185, 129), new Color(5, 150, 105), new Color(239, 68, 68));
        
        JPanel teacherPanel = createCategoryPanel("Teachers", 
            new String[]{"Add Teacher", "Edit Teacher", "Delete Teacher"},
            new Color(79, 70, 229), new Color(5, 150, 105), new Color(239, 68, 68));
        
        JPanel coursePanel = createCategoryPanel("Courses", 
            new String[]{"Add Course", "Edit Course", "Delete Course"},
            new Color(245, 158, 11), new Color(5, 150, 105), new Color(239, 68, 68));
        
        // Bottom buttons
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2, 20, 20));
        bottomPanel.setBackground(BACKGROUND_COLOR);
        
        JButton viewBtn = createButton("View All Data", ACCENT_COLOR);
        JButton backBtn = createButton("Back", DANGER_COLOR);
        
        viewBtn.addActionListener(e -> viewAllDataUI());
        backBtn.addActionListener(e -> { frame.dispose(); showMainMenu(); });
        
        bottomPanel.add(viewBtn);
        bottomPanel.add(backBtn);
        
        mainPanel.add(titlePanel);
        mainPanel.add(studentPanel);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(teacherPanel);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(coursePanel);
        mainPanel.add(Box.createVerticalStrut(30));
        mainPanel.add(bottomPanel);
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    private static JPanel createCategoryPanel(String title, String[] buttons, Color addColor, Color editColor, Color deleteColor) {
        JPanel panel = createCardPanel();
        
        JLabel titleLabel = createLabel(title, 18, ACCENT_COLOR);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3, 15, 0));
        buttonsPanel.setBackground(CARD_COLOR);
        
        JButton addBtn = createButton(buttons[0], addColor);
        JButton editBtn = createButton(buttons[1], editColor);
        JButton deleteBtn = createButton(buttons[2], deleteColor);
        
        // Add action listeners
        switch (title) {
            case "Students":
                addBtn.addActionListener(e -> addStudentUI());
                editBtn.addActionListener(e -> editStudentUI());
                deleteBtn.addActionListener(e -> deleteStudentUI());
                break;
            case "Teachers":
                addBtn.addActionListener(e -> addTeacherUI());
                editBtn.addActionListener(e -> editTeacherUI());
                deleteBtn.addActionListener(e -> deleteTeacherUI());
                break;
            case "Courses":
                addBtn.addActionListener(e -> addCourseUI());
                editBtn.addActionListener(e -> editCourseUI());
                deleteBtn.addActionListener(e -> deleteCourseUI());
                break;
        }
        
        buttonsPanel.add(addBtn);
        buttonsPanel.add(editBtn);
        buttonsPanel.add(deleteBtn);
        
        panel.add(titleLabel);
        panel.add(Box.createVerticalStrut(15));
        panel.add(buttonsPanel);
        
        return panel;
    }
    
    // ===== UI CODE: LOGIN SCREENS =====
    private static void teacherLogin() {
        JFrame frame = createFrame("Teacher Login");
        JPanel mainPanel = createMainPanel();
        
        JLabel title = createLabel("TEACHER LOGIN", 24, ACCENT_COLOR);
        title.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));
        
        // Centered form panel
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(BACKGROUND_COLOR);
        
        JPanel formPanel = createCardPanel();
        formPanel.setMaximumSize(new Dimension(400, 150));
        
        // Create a panel for the label to center it
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel.setBackground(CARD_COLOR);
        
        JLabel idLabel = new JLabel("Teacher ID:");
        idLabel.setForeground(TEXT_COLOR);
        idLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        labelPanel.add(idLabel);
        
        JTextField idField = createTextField();
        
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2, 15, 0));
        buttonsPanel.setBackground(CARD_COLOR);
        
        JButton loginBtn = createButton("Login", ACCENT_COLOR);
        JButton cancelBtn = createButton("Cancel", DANGER_COLOR);
        
        loginBtn.addActionListener(e -> handleLogin(frame, idField, true));
        cancelBtn.addActionListener(e -> { frame.dispose(); showMainMenu(); });
        
        buttonsPanel.add(loginBtn);
        buttonsPanel.add(cancelBtn);
        
        formPanel.add(labelPanel);
        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(idField);
        formPanel.add(Box.createVerticalStrut(20));
        formPanel.add(buttonsPanel);
        
        // Center the form
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        centerPanel.add(formPanel, gbc);
        
        mainPanel.add(title);
        mainPanel.add(centerPanel);
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    private static void studentLogin() {
        JFrame frame = createFrame("Student Login");
        JPanel mainPanel = createMainPanel();
        
        JLabel title = createLabel("STUDENT LOGIN", 24, ACCENT_COLOR);
        title.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));
        
        // Centered form panel
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(BACKGROUND_COLOR);
        
        JPanel formPanel = createCardPanel();
        formPanel.setMaximumSize(new Dimension(400, 150));
        
        // Create a panel for the label to center it
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel.setBackground(CARD_COLOR);
        
        JLabel idLabel = new JLabel("Student ID:");
        idLabel.setForeground(TEXT_COLOR);
        idLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        labelPanel.add(idLabel);
        
        JTextField idField = createTextField();
        
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2, 15, 0));
        buttonsPanel.setBackground(CARD_COLOR);
        
        JButton loginBtn = createButton("Login", ACCENT_COLOR);
        JButton cancelBtn = createButton("Cancel", DANGER_COLOR);
        
        loginBtn.addActionListener(e -> handleLogin(frame, idField, false));
        cancelBtn.addActionListener(e -> { frame.dispose(); showMainMenu(); });
        
        buttonsPanel.add(loginBtn);
        buttonsPanel.add(cancelBtn);
        
        formPanel.add(labelPanel);
        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(idField);
        formPanel.add(Box.createVerticalStrut(20));
        formPanel.add(buttonsPanel);
        
        // Center the form
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        centerPanel.add(formPanel, gbc);
        
        mainPanel.add(title);
        mainPanel.add(centerPanel);
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    // ===== MAIN JAVA CODE: LOGIN HANDLER =====
    private static void handleLogin(JFrame frame, JTextField idField, boolean isTeacher) {
        String id = idField.getText().trim();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter an ID!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (isTeacher) {
            Teacher t = findTeacher(id);
            if (t != null) {
                frame.dispose();
                showTeacherMenu(t);
            } else {
                JOptionPane.showMessageDialog(frame, "Teacher not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Student s = findStudent(id);
            if (s != null) {
                frame.dispose();
                showStudentMenu(s);
            } else {
                JOptionPane.showMessageDialog(frame, "Student not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // ===== UI CODE: MENU SCREENS =====
    private static void showTeacherMenu(Teacher t) {
        JFrame frame = createFrame("Teacher Menu - " + t.name);
        JPanel mainPanel = createMainPanel();
        
        JLabel title = createLabel("WELCOME, " + t.name.toUpperCase(), 24, ACCENT_COLOR);
        title.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));
        
        JPanel buttonsPanel = new JPanel(new GridLayout(0, 1, 15, 15));
        buttonsPanel.setBackground(BACKGROUND_COLOR);
        
        JButton markBtn = createButton("Mark Attendance", new Color(16, 185, 129));
        JButton viewBtn = createButton("View Attendance", new Color(79, 70, 229));
        JButton percentBtn = createButton("Attendance Percentage", new Color(245, 158, 11));
        JButton backBtn = createButton("Back", DANGER_COLOR);
        
        markBtn.addActionListener(e -> markAttendanceUI(t, frame));
        viewBtn.addActionListener(e -> viewAttendanceByDateUI(t, frame));
        percentBtn.addActionListener(e -> viewTotalAttendancePercentageUI(t, frame));
        backBtn.addActionListener(e -> { frame.dispose(); showMainMenu(); });
        
        buttonsPanel.add(markBtn);
        buttonsPanel.add(viewBtn);
        buttonsPanel.add(percentBtn);
        buttonsPanel.add(backBtn);
        
        mainPanel.add(title);
        mainPanel.add(buttonsPanel);
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    private static void showStudentMenu(Student s) {
        JFrame frame = createFrame("Student Menu - " + s.name);
        JPanel mainPanel = createMainPanel();
        
        JLabel title = createLabel("WELCOME, " + s.name.toUpperCase(), 24, ACCENT_COLOR);
        title.setBorder(BorderFactory.createEmptyBorder(0, 0, 40, 0));
        
        JPanel buttonsPanel = new JPanel(new GridLayout(0, 1, 15, 15));
        buttonsPanel.setBackground(BACKGROUND_COLOR);
        
        JButton viewBtn = createButton("View My Attendance", new Color(79, 70, 229));
        JButton backBtn = createButton("Back", DANGER_COLOR);
        
        viewBtn.addActionListener(e -> viewStudentAttendanceUI(s, frame));
        backBtn.addActionListener(e -> { frame.dispose(); showMainMenu(); });
        
        buttonsPanel.add(viewBtn);
        buttonsPanel.add(backBtn);
        
        mainPanel.add(title);
        mainPanel.add(buttonsPanel);
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    // ===== UI CODE: TEACHER FUNCTIONS =====
    private static void markAttendanceUI(Teacher t, JFrame parentFrame) {
        String cId = JOptionPane.showInputDialog(parentFrame, "Enter Course ID:");
        if (cId == null || cId.trim().isEmpty()) return;
        
        Course c = findCourse(cId);
        if (c == null || !t.assignedCourses.contains(cId)) {
            JOptionPane.showMessageDialog(parentFrame, "Invalid course!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String date = JOptionPane.showInputDialog(parentFrame, "Enter Date (YYYY-MM-DD):");
        if (date == null || date.trim().isEmpty()) return;
        
        AttendanceDay ad = new AttendanceDay();
        for (Student s : students) {
            String status = JOptionPane.showInputDialog(
                parentFrame, 
                "Mark " + s.name + " (P/A):",
                "Mark Attendance",
                JOptionPane.QUESTION_MESSAGE
            );
            if (status == null) return;
            ad.studentStatus.put(s.studentId, status.toUpperCase());
        }
        
        c.attendanceByDate.put(date, ad);
        saveData();
        JOptionPane.showMessageDialog(parentFrame, "Attendance saved for " + date, "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void viewAttendanceByDateUI(Teacher t, JFrame parentFrame) {
        String cId = JOptionPane.showInputDialog(parentFrame, "Enter Course ID:");
        if (cId == null || cId.trim().isEmpty()) return;
        
        Course c = findCourse(cId);
        if (c == null || !t.assignedCourses.contains(cId)) {
            JOptionPane.showMessageDialog(parentFrame, "Invalid course!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String date = JOptionPane.showInputDialog(parentFrame, "Enter Date (YYYY-MM-DD):");
        if (date == null || date.trim().isEmpty()) return;
        
        AttendanceDay ad = c.attendanceByDate.get(date);
        if (ad == null) {
            JOptionPane.showMessageDialog(parentFrame, "No attendance on that date!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String html = createAttendanceReportHTML(c.courseName, date, ad);
        showHTMLDialog(parentFrame, html, "Attendance Report");
    }
    
    private static void viewTotalAttendancePercentageUI(Teacher t, JFrame parentFrame) {
        String cId = JOptionPane.showInputDialog(parentFrame, "Enter Course ID:");
        if (cId == null || cId.trim().isEmpty()) return;
        
        Course c = findCourse(cId);
        if (c == null || !t.assignedCourses.contains(cId)) {
            JOptionPane.showMessageDialog(parentFrame, "Invalid course!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String html = createAttendancePercentageHTML(c);
        showHTMLDialog(parentFrame, html, "Attendance Percentage");
    }
    
    // ===== UI CODE: STUDENT FUNCTIONS =====
    private static void viewStudentAttendanceUI(Student s, JFrame parentFrame) {
        String html = createStudentAttendanceHTML(s);
        showHTMLDialog(parentFrame, html, "Your Attendance Report");
    }
    
    // ===== UI CODE: ADMIN FUNCTIONS =====
    private static void addStudentUI() {
        JPanel panel = createFormPanel("Add Student", new String[]{"Student ID:", "Name:", "Semester:"});
        
        if (JOptionPane.showConfirmDialog(null, panel, "Add Student", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                String id = ((JTextField)panel.getComponent(1)).getText().trim();
                String name = ((JTextField)panel.getComponent(3)).getText().trim();
                int sem = Integer.parseInt(((JTextField)panel.getComponent(5)).getText().trim());
                
                if (id.isEmpty() || name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ID and Name are required!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (studentIdExists(id)) {
                    JOptionPane.showMessageDialog(null, "Student ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (studentNameExists(name)) {
                    JOptionPane.showMessageDialog(null, "Student name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                students.add(new Student(id, name, sem));
                saveData();
                JOptionPane.showMessageDialog(null, "Student added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid semester number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void editStudentUI() {
        if (students.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No students to edit!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String id = JOptionPane.showInputDialog("Enter Student ID to edit:");
        if (id == null || id.trim().isEmpty()) return;
        
        Student student = findStudent(id);
        if (student == null) {
            JOptionPane.showMessageDialog(null, "Student not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JPanel panel = createFormPanel("Edit Student", new String[]{"Student ID:", "Name:", "Semester:"});
        ((JTextField)panel.getComponent(1)).setText(student.studentId);
        ((JTextField)panel.getComponent(3)).setText(student.name);
        ((JTextField)panel.getComponent(5)).setText(String.valueOf(student.semester));
        
        if (JOptionPane.showConfirmDialog(null, panel, "Edit Student", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                String newId = ((JTextField)panel.getComponent(1)).getText().trim();
                String newName = ((JTextField)panel.getComponent(3)).getText().trim();
                int newSem = Integer.parseInt(((JTextField)panel.getComponent(5)).getText().trim());
                
                if (newId.isEmpty() || newName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ID and Name are required!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (!newId.equals(student.studentId) && studentIdExists(newId)) {
                    JOptionPane.showMessageDialog(null, "Student ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (!newName.equalsIgnoreCase(student.name) && studentNameExists(newName)) {
                    JOptionPane.showMessageDialog(null, "Student name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Update student
                student.studentId = newId;
                student.name = newName;
                student.semester = newSem;
                
                // Update attendance records if ID changed
                if (!newId.equals(student.studentId)) {
                    updateStudentAttendanceId(student.studentId, newId);
                }
                
                saveData();
                JOptionPane.showMessageDialog(null, "Student updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid semester number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void deleteStudentUI() {
        if (students.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No students to delete!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String id = JOptionPane.showInputDialog("Enter Student ID to delete:");
        if (id == null || id.trim().isEmpty()) return;
        
        Student student = findStudent(id);
        if (student == null) {
            JOptionPane.showMessageDialog(null, "Student not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(
            null, 
            "Are you sure you want to delete " + student.name + "?\n" +
            "This will also remove all attendance records for this student.",
            "Confirm Deletion", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE
        );
        
        if (confirm == JOptionPane.YES_OPTION) {
            students.remove(student);
            removeStudentFromAttendance(student.studentId);
            saveData();
            JOptionPane.showMessageDialog(null, "Student deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private static void addTeacherUI() {
        JPanel panel = createFormPanel("Add Teacher", new String[]{"Teacher ID:", "Name:"});
        
        if (JOptionPane.showConfirmDialog(null, panel, "Add Teacher", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            String id = ((JTextField)panel.getComponent(1)).getText().trim();
            String name = ((JTextField)panel.getComponent(3)).getText().trim();
            
            if (id.isEmpty() || name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ID and Name are required!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (teacherIdExists(id)) {
                JOptionPane.showMessageDialog(null, "Teacher ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (teacherNameExists(name)) {
                JOptionPane.showMessageDialog(null, "Teacher name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            teachers.add(new Teacher(id, name));
            saveData();
            JOptionPane.showMessageDialog(null, "Teacher added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private static void editTeacherUI() {
        if (teachers.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No teachers to edit!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String id = JOptionPane.showInputDialog("Enter Teacher ID to edit:");
        if (id == null || id.trim().isEmpty()) return;
        
        Teacher teacher = findTeacher(id);
        if (teacher == null) {
            JOptionPane.showMessageDialog(null, "Teacher not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JPanel panel = createFormPanel("Edit Teacher", new String[]{"Teacher ID:", "Name:"});
        ((JTextField)panel.getComponent(1)).setText(teacher.teacherId);
        ((JTextField)panel.getComponent(3)).setText(teacher.name);
        
        if (JOptionPane.showConfirmDialog(null, panel, "Edit Teacher", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            String newId = ((JTextField)panel.getComponent(1)).getText().trim();
            String newName = ((JTextField)panel.getComponent(3)).getText().trim();
            
            if (newId.isEmpty() || newName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ID and Name are required!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!newId.equals(teacher.teacherId) && teacherIdExists(newId)) {
                JOptionPane.showMessageDialog(null, "Teacher ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!newName.equalsIgnoreCase(teacher.name) && teacherNameExists(newName)) {
                JOptionPane.showMessageDialog(null, "Teacher name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Update teacher
            teacher.teacherId = newId;
            teacher.name = newName;
            
            // Update courses if ID changed
            if (!newId.equals(teacher.teacherId)) {
                updateTeacherCourseIds(teacher.teacherId, newId);
            }
            
            saveData();
            JOptionPane.showMessageDialog(null, "Teacher updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private static void deleteTeacherUI() {
        if (teachers.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No teachers to delete!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String id = JOptionPane.showInputDialog("Enter Teacher ID to delete:");
        if (id == null || id.trim().isEmpty()) return;
        
        Teacher teacher = findTeacher(id);
        if (teacher == null) {
            JOptionPane.showMessageDialog(null, "Teacher not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(
            null, 
            "Are you sure you want to delete " + teacher.name + "?\n" +
            "This will unassign them from all courses.",
            "Confirm Deletion", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE
        );
        
        if (confirm == JOptionPane.YES_OPTION) {
            teachers.remove(teacher);
            unassignTeacherFromCourses(teacher.teacherId);
            saveData();
            JOptionPane.showMessageDialog(null, "Teacher deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private static void addCourseUI() {
        JPanel panel = createFormPanel("Add Course", new String[]{"Course ID:", "Course Name:", "Semester:"});
        
        if (JOptionPane.showConfirmDialog(null, panel, "Add Course", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                String id = ((JTextField)panel.getComponent(1)).getText().trim();
                String name = ((JTextField)panel.getComponent(3)).getText().trim();
                int sem = Integer.parseInt(((JTextField)panel.getComponent(5)).getText().trim());
                
                if (id.isEmpty() || name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ID and Name are required!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (courseIdExists(id)) {
                    JOptionPane.showMessageDialog(null, "Course ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (courseNameExists(name)) {
                    JOptionPane.showMessageDialog(null, "Course name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                courses.add(new Course(id, name, null, sem));
                saveData();
                JOptionPane.showMessageDialog(null, "Course added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid semester number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void editCourseUI() {
        if (courses.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No courses to edit!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String id = JOptionPane.showInputDialog("Enter Course ID to edit:");
        if (id == null || id.trim().isEmpty()) return;
        
        Course course = findCourse(id);
        if (course == null) {
            JOptionPane.showMessageDialog(null, "Course not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));
        panel.setBackground(CARD_COLOR);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JTextField idField = createTextField();
        idField.setText(course.courseId);
        JTextField nameField = createTextField();
        nameField.setText(course.courseName);
        JTextField semField = createTextField();
        semField.setText(String.valueOf(course.semester));
        
        JComboBox<Teacher> teacherCombo = new JComboBox<>();
        teacherCombo.addItem(null);
        for (Teacher t : teachers) {
            teacherCombo.addItem(t);
        }
        teacherCombo.setBackground(CARD_COLOR);
        teacherCombo.setForeground(TEXT_COLOR);
        teacherCombo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        
        // Set current teacher
        if (course.teacherId != null) {
            Teacher currentTeacher = findTeacher(course.teacherId);
            if (currentTeacher != null) {
                teacherCombo.setSelectedItem(currentTeacher);
            }
        }
        
        panel.add(createLabel("Course ID:"));
        panel.add(idField);
        panel.add(createLabel("Course Name:"));
        panel.add(nameField);
        panel.add(createLabel("Semester:"));
        panel.add(semField);
        panel.add(createLabel("Assigned Teacher:"));
        panel.add(teacherCombo);
        
        if (JOptionPane.showConfirmDialog(null, panel, "Edit Course", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                String newId = idField.getText().trim();
                String newName = nameField.getText().trim();
                int newSem = Integer.parseInt(semField.getText().trim());
                Teacher newTeacher = (Teacher) teacherCombo.getSelectedItem();
                String newTeacherId = (newTeacher != null) ? newTeacher.teacherId : null;
                
                if (newId.isEmpty() || newName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ID and Name are required!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (!newId.equals(course.courseId) && courseIdExists(newId)) {
                    JOptionPane.showMessageDialog(null, "Course ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (!newName.equalsIgnoreCase(course.courseName) && courseNameExists(newName)) {
                    JOptionPane.showMessageDialog(null, "Course name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Update course
                course.courseId = newId;
                course.courseName = newName;
                course.semester = newSem;
                
                // Handle teacher assignment changes
                if (!Objects.equals(course.teacherId, newTeacherId)) {
                    updateCourseTeacherAssignment(course, newTeacher, newId);
                }
                
                saveData();
                JOptionPane.showMessageDialog(null, "Course updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid semester number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void deleteCourseUI() {
        if (courses.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No courses to delete!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String id = JOptionPane.showInputDialog("Enter Course ID to delete:");
        if (id == null || id.trim().isEmpty()) return;
        
        Course course = findCourse(id);
        if (course == null) {
            JOptionPane.showMessageDialog(null, "Course not found!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(
            null, 
            "Are you sure you want to delete " + course.courseName + "?\n" +
            "This will remove all attendance records for this course.",
            "Confirm Deletion", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE
        );
        
        if (confirm == JOptionPane.YES_OPTION) {
            // Remove course from teachers
            for (Teacher t : teachers) {
                t.assignedCourses.remove(course.courseId);
            }
            
            // Remove course
            courses.remove(course);
            
            saveData();
            JOptionPane.showMessageDialog(null, "Course deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private static void viewAllDataUI() {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(BACKGROUND_COLOR);
        tabbedPane.setForeground(TEXT_COLOR);
        tabbedPane.setFont(new Font("Segoe UI", Font.BOLD, 14));
        tabbedPane.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
            @Override
            protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
                // Don't paint the content border
            }
        });
        
        // Students tab
        String studentsHTML = createStudentsListHTML();
        JEditorPane studentsPane = createHTMLEditorPane(studentsHTML);
        tabbedPane.addTab("Students", new JScrollPane(studentsPane));
        
        // Teachers tab
        String teachersHTML = createTeachersListHTML();
        JEditorPane teachersPane = createHTMLEditorPane(teachersHTML);
        tabbedPane.addTab("Teachers", new JScrollPane(teachersPane));
        
        // Courses tab
        String coursesHTML = createCoursesListHTML();
        JEditorPane coursesPane = createHTMLEditorPane(coursesHTML);
        tabbedPane.addTab("Courses", new JScrollPane(coursesPane));
        
        JOptionPane.showMessageDialog(null, tabbedPane, "All Data", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // ===== UI CODE: UTILITY METHODS =====
    private static JPanel createFormPanel(String title, String[] labels) {
        JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));
        panel.setBackground(CARD_COLOR);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        for (String label : labels) {
            JLabel jLabel = new JLabel(label);
            jLabel.setForeground(TEXT_COLOR);
            jLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            panel.add(jLabel);
            panel.add(createTextField());
        }
        
        return panel;
    }
    
    private static JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setForeground(TEXT_COLOR);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        return label;
    }
    
    private static JEditorPane createHTMLEditorPane(String html) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText(html);
        editorPane.setEditable(false);
        editorPane.setBackground(new Color(30, 41, 59));
        return editorPane;
    }
    
    private static void showHTMLDialog(JFrame parentFrame, String html, String title) {
        JEditorPane editorPane = createHTMLEditorPane(html);
        editorPane.setPreferredSize(new Dimension(500, 300));
        
        JScrollPane scrollPane = new JScrollPane(editorPane);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setBackground(new Color(30, 41, 59));
        
        JOptionPane.showMessageDialog(parentFrame, scrollPane, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    // ===== UI CODE: HTML GENERATORS =====
    private static String createAttendanceReportHTML(String courseName, String date, AttendanceDay ad) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; font-size: 16px; background-color: #1e293b; color: #f8fafc;'>");
        sb.append("<h2 style='color: #6366f1; text-align: center;'>Attendance for ").append(courseName).append(" on ").append(date).append("</h2>");
        sb.append("<table style='width: 100%; border-collapse: collapse;'>");
        sb.append("<tr style='background-color: #334155;'><th style='padding: 8px; text-align: left;'>Student Name</th><th style='padding: 8px; text-align: left;'>Status</th></tr>");
        
        for (Map.Entry<String, String> e : ad.studentStatus.entrySet()) {
            Student s = findStudent(e.getKey());
            String status = e.getValue();
            String statusText = status.equals("P") ? "Present" : "Absent";
            String statusColor = status.equals("P") ? "#10b981" : "#ef4444";
            
            sb.append("<tr>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(s.name).append("</td>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155; color: ").append(statusColor).append(";'>").append(statusText).append("</td>")
              .append("</tr>");
        }
        
        sb.append("</table></body></html>");
        return sb.toString();
    }
    
    private static String createAttendancePercentageHTML(Course c) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; font-size: 16px; background-color: #1e293b; color: #f8fafc;'>");
        sb.append("<h2 style='color: #6366f1; text-align: center;'>Attendance % for ").append(c.courseName).append("</h2>");
        sb.append("<table style='width: 100%; border-collapse: collapse;'>");
        sb.append("<tr style='background-color: #334155;'><th style='padding: 8px; text-align: left;'>Student Name</th><th style='padding: 8px; text-align: left;'>Percentage</th></tr>");
        
        for (Student s : students) {
            int total = 0, present = 0;
            for (AttendanceDay day : c.attendanceByDate.values()) {
                String status = day.studentStatus.get(s.studentId);
                if (status != null) {
                    total++;
                    if (status.equals("P")) present++;
                }
            }
            
            if (total > 0) {
                double percent = (present * 100.0 / total);
                String percentColor = percent >= 75 ? "#10b981" : percent >= 50 ? "#f59e0b" : "#ef4444";
                
                sb.append("<tr>")
                  .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(s.name).append("</td>")
                  .append("<td style='padding: 8px; border-bottom: 1px solid #334155; color: ").append(percentColor).append("; font-weight: bold;'>")
                  .append(String.format("%.1f", percent)).append("%</td>")
                  .append("</tr>");
            }
        }
        
        sb.append("</table></body></html>");
        return sb.toString();
    }
    
    private static String createStudentAttendanceHTML(Student s) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; font-size: 16px; background-color: #1e293b; color: #f8fafc;'>");
        sb.append("<h2 style='color: #6366f1; text-align: center;'>Attendance for ").append(s.name).append("</h2>");
        
        for (Course c : courses) {
            sb.append("<h3 style='color: #6366f1; margin-top: 20px;'>").append(c.courseName).append("</h3>");
            int total = 0, present = 0;
            
            sb.append("<table style='width: 100%; border-collapse: collapse;'>");
            sb.append("<tr style='background-color: #334155;'><th style='padding: 8px; text-align: left;'>Date</th><th style='padding: 8px; text-align: left;'>Status</th></tr>");
            
            for (Map.Entry<String, AttendanceDay> entry : c.attendanceByDate.entrySet()) {
                String date = entry.getKey();
                String status = entry.getValue().studentStatus.get(s.studentId);
                if (status != null) {
                    total++;
                    if (status.equals("P")) present++;
                    String statusText = status.equals("P") ? "Present" : "Absent";
                    String statusColor = status.equals("P") ? "#10b981" : "#ef4444";
                    
                    sb.append("<tr>")
                      .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(date).append("</td>")
                      .append("<td style='padding: 8px; border-bottom: 1px solid #334155; color: ").append(statusColor).append(";'>").append(statusText).append("</td>")
                      .append("</tr>");
                }
            }
            sb.append("</table>");
            
            if (total > 0) {
                double percent = (present * 100.0 / total);
                String percentColor = percent >= 75 ? "#10b981" : percent >= 50 ? "#f59e0b" : "#ef4444";
                sb.append("<p style='margin-top: 10px; color: ").append(percentColor).append("; font-weight: bold;'>")
                  .append("Attendance: ").append(String.format("%.1f", percent)).append("%")
                  .append("</p>");
            } else {
                sb.append("<p style='margin-top: 10px; color: #94a3b8;'>No attendance records</p>");
            }
        }
        
        sb.append("</body></html>");
        return sb.toString();
    }
    
    private static String createStudentsListHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; font-size: 16px; background-color: #1e293b; color: #f8fafc;'>");
        sb.append("<h2 style='color: #6366f1; text-align: center;'>STUDENTS LIST</h2>");
        sb.append("<table style='width: 100%; border-collapse: collapse;'>");
        sb.append("<tr style='background-color: #334155;'><th style='padding: 8px; text-align: left;'>ID</th><th style='padding: 8px; text-align: left;'>NAME</th><th style='padding: 8px; text-align: left;'>SEMESTER</th></tr>");
        
        for (Student s : students) {
            sb.append("<tr>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(s.studentId).append("</td>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(s.name).append("</td>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(s.semester).append("</td>")
              .append("</tr>");
        }
        sb.append("</table></body></html>");
        return sb.toString();
    }
    
    private static String createTeachersListHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; font-size: 16px; background-color: #1e293b; color: #f8fafc;'>");
        sb.append("<h2 style='color: #6366f1; text-align: center;'>TEACHERS LIST</h2>");
        sb.append("<table style='width: 100%; border-collapse: collapse;'>");
        sb.append("<tr style='background-color: #334155;'><th style='padding: 8px; text-align: left;'>ID</th><th style='padding: 8px; text-align: left;'>NAME</th><th style='padding: 8px; text-align: left;'>COURSES</th></tr>");
        
        for (Teacher t : teachers) {
            sb.append("<tr>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(t.teacherId).append("</td>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(t.name).append("</td>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(String.join(", ", t.assignedCourses)).append("</td>")
              .append("</tr>");
        }
        sb.append("</table></body></html>");
        return sb.toString();
    }
    
    private static String createCoursesListHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; font-size: 16px; background-color: #1e293b; color: #f8fafc;'>");
        sb.append("<h2 style='color: #6366f1; text-align: center;'>COURSES LIST</h2>");
        sb.append("<table style='width: 100%; border-collapse: collapse;'>");
        sb.append("<tr style='background-color: #334155;'><th style='padding: 8px; text-align: left;'>ID</th><th style='padding: 8px; text-align: left;'>NAME</th><th style='padding: 8px; text-align: left;'>SEMESTER</th><th style='padding: 8px; text-align: left;'>TEACHER</th></tr>");
        
        for (Course c : courses) {
            Teacher t = findTeacher(c.teacherId);
            String teacherName = (t != null) ? t.name : "Not Assigned";
            
            sb.append("<tr>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(c.courseId).append("</td>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(c.courseName).append("</td>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(c.semester).append("</td>")
              .append("<td style='padding: 8px; border-bottom: 1px solid #334155;'>").append(teacherName).append("</td>")
              .append("</tr>");
        }
        sb.append("</table></body></html>");
        return sb.toString();
    }
    
    // ===== MAIN JAVA CODE: DATA UPDATE HELPERS =====
    private static void updateStudentAttendanceId(String oldId, String newId) {
        for (Course c : courses) {
            for (AttendanceDay day : c.attendanceByDate.values()) {
                String status = day.studentStatus.remove(oldId);
                if (status != null) {
                    day.studentStatus.put(newId, status);
                }
            }
        }
    }
    
    private static void removeStudentFromAttendance(String studentId) {
        for (Course c : courses) {
            for (AttendanceDay day : c.attendanceByDate.values()) {
                day.studentStatus.remove(studentId);
            }
        }
    }
    
    private static void updateTeacherCourseIds(String oldId, String newId) {
        for (Course c : courses) {
            if (oldId.equals(c.teacherId)) {
                c.teacherId = newId;
            }
        }
    }
    
    private static void unassignTeacherFromCourses(String teacherId) {
        for (Course c : courses) {
            if (teacherId.equals(c.teacherId)) {
                c.teacherId = null;
            }
        }
    }
    
    private static void updateCourseTeacherAssignment(Course course, Teacher newTeacher, String newCourseId) {
        // Remove from old teacher's assigned courses
        if (course.teacherId != null) {
            Teacher oldTeacher = findTeacher(course.teacherId);
            if (oldTeacher != null) {
                oldTeacher.assignedCourses.remove(course.courseId);
            }
        }
        
        // Add to new teacher's assigned courses
        if (newTeacher != null) {
            newTeacher.assignedCourses.add(newCourseId);
        }
        
        course.teacherId = (newTeacher != null) ? newTeacher.teacherId : null;
    }
    
    // ===== UI CODE: ICON CREATION =====
    private static ImageIcon createIcon(int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Draw background circle with new accent color
        g2d.setColor(ACCENT_COLOR);
        g2d.fillOval(0, 0, width, height);
        
        // Draw checkmark
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawLine(width/4, height/2, width/2, height*3/4);
        g2d.drawLine(width/2, height*3/4, width*3/4, height/4);
        
        g2d.dispose();
        return new ImageIcon(image);
    }
    
    // ===== MAIN JAVA CODE: FIND METHODS =====
    private static Student findStudent(String id) {
        return students.stream().filter(s -> s.studentId.equals(id)).findFirst().orElse(null);
    }
    
    private static Teacher findTeacher(String id) {
        return teachers.stream().filter(t -> t.teacherId.equals(id)).findFirst().orElse(null);
    }
    
    private static Course findCourse(String id) {
        return courses.stream().filter(c -> c.courseId.equals(id)).findFirst().orElse(null);
    }
    
    // ===== MAIN JAVA CODE: UNIQUENESS CHECKS =====
    private static boolean studentIdExists(String id) {
        return students.stream().anyMatch(s -> s.studentId.equals(id));
    }
    
    private static boolean studentNameExists(String name) {
        return students.stream().anyMatch(s -> s.name.equalsIgnoreCase(name));
    }
    
    private static boolean teacherIdExists(String id) {
        return teachers.stream().anyMatch(t -> t.teacherId.equals(id));
    }
    
    private static boolean teacherNameExists(String name) {
        return teachers.stream().anyMatch(t -> t.name.equalsIgnoreCase(name));
    }
    
    private static boolean courseIdExists(String id) {
        return courses.stream().anyMatch(c -> c.courseId.equals(id));
    }
    
    private static boolean courseNameExists(String name) {
        return courses.stream().anyMatch(c -> c.courseName.equalsIgnoreCase(name));
    }
}