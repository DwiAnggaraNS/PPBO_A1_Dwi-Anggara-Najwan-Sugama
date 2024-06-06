import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HRISGUI extends JFrame {
    private JFrame frame;

    private JComboBox<String> departmentComboBox;
    private JTextField nameField;
    private JTextField birthDateField;
    private JComboBox<String> positionComboBox;
    private JButton addEmployeeButton;
    private JButton cancelButton;

    private JTextArea displayArea;
    private JTextField findIdField;

    private JButton addButton;
    private JButton showAllButton;

    private ArrayList<Employee> employees;

    public HRISGUI() {
        employees = new ArrayList<>();

        frame = new JFrame("HRIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        showMainPanel();
        frame.add(showMainPanel(), BorderLayout.CENTER);
        frame.pack();
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    private JPanel showMainPanel() {
        addButton = new JButton("Add Data");
        showAllButton = new JButton("Show Data");

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
        buttonPanel.add(addButton);
        buttonPanel.add(showAllButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaintPanel(showInputPanel());
            }
        });

        showAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaintPanel(showAllDataPanel());
            }
        });

        return buttonPanel;
    }

    //Complete show all data employee panel
    private JPanel showAllDataPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new GridLayout(1, 1));

        findIdField = new JTextField(15);
        topPanel.add(findIdField);

        cancelButton = new JButton("Cancel");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(cancelButton);


        StringBuilder strBuilder = new StringBuilder();
        for (Employee employee: employees){
            strBuilder.append("Data Employee:"+ "\n");
            strBuilder.append("ID employee: "+employee.getId() + "\n");
            strBuilder.append("Nama employee: "+employee.getName() + "\n");
            strBuilder.append("Tanggal Lahir employee: "+employee.getBirthDate() + "\n");
            strBuilder.append("Posisi employee: "+employee.getPosition() + "\n");
            strBuilder.append("Gaji employee: "+employee.getSalary() + "\n");
            strBuilder.append("----------------------"+ "\n");
        }


        displayArea = new JTextArea(strBuilder.toString());
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);


        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.SOUTH);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaintPanel(showMainPanel());
            }
        });

        return panel;
    }

    // method refresh panel
    private void repaintPanel(JPanel newPanel) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(newPanel);
        frame.revalidate();
        frame.repaint();
    }

    //Complete show employee input panel
    private JPanel showInputPanel() {
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(15);

        JLabel birthDateLabel = new JLabel("Birth Date (DDMMYYYY):");
        birthDateField = new JTextField(15);

        JLabel departmentLabel = new JLabel("Department:");
        String[] departments = Employee.getDepartment();
        departmentComboBox = new JComboBox<>(departments);

        JLabel positionLabel = new JLabel("Position:");
        String[] positions = {"Manager", "Developer", "HR Staff"};
        positionComboBox = new JComboBox<>(positions);

        addEmployeeButton = new JButton("Add Data");

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaintPanel(showMainPanel());
            }
        });
//        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        buttonPanel.add(cancelButton);

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(birthDateLabel);
        inputPanel.add(birthDateField);
        inputPanel.add(departmentLabel);
        inputPanel.add(departmentComboBox);
        inputPanel.add(positionLabel);
        inputPanel.add(positionComboBox);
        inputPanel.add(addEmployeeButton);
        inputPanel.add(cancelButton);

        //complete add employee logic
        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String birthDate = birthDateField.getText();
                String department = departmentComboBox.getSelectedItem().toString();
                String position = positionComboBox.getSelectedItem().toString();

                Employee employee;
                switch (position) {
                    case "Manager":
                        employee = new Manager(name, birthDate, department, 20000000);
                        break;
                    case "Developer":
                        employee = new Developer(name, birthDate, department, 10000000);
                        break;
                    case "HR Staff":
                        employee = new HRStaff(name, birthDate, department, 5000000);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid position: " + position);
                }

                employees.add(employee);
                JOptionPane.showMessageDialog(HRISGUI.this, "Employee added: " + employee.toString());
            }
        });

        return inputPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HRISGUI();
            }
        });
    }
}
