import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

	private JLabel title;
	private JTextField id;
	private JPasswordField password;
	private JLabel idLabel;
	private JLabel passwordLabel;
	private JCheckBox newUser;
	private JButton ok;
	private JButton cancel;
	
	private JTextField newID;
	private JPasswordField newPassword;
	private JPasswordField newPasswordConfirm;
	private JLabel newPasswordConfirmLabel;
	private JLabel newIDLabel;
	private JLabel newPasswordLabel;
	private JButton newOk;
	private JButton newCancel;
	
	
	
	protected void setupComponents() {

		JFrame frame = new JFrame();
		
		
		
		title = new JLabel("Please Login");
		title.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel buttonsPanel = new JPanel();
				
		ok = new JButton("OK");
		buttonsPanel.add(ok);
				
		cancel = new JButton("Cancel");
		buttonsPanel.add(cancel);
		
		
		
		JPanel centerPanel = new JPanel();
		
		JPanel idPanel = new JPanel();
		JPanel passwordPanel = new JPanel();
		JPanel checkboxPanel = new JPanel();
		centerPanel.add(idPanel);
		centerPanel.add(passwordPanel);
		centerPanel.add(checkboxPanel);
		
		idLabel = new JLabel("Username: ");
		idPanel.add(idLabel);
		
		id = new JTextField(20);
		idPanel.add(id);
		
		passwordLabel = new JLabel("Password: ");
		passwordPanel.add(passwordLabel);
		
		password = new JPasswordField(20);
		passwordPanel.add(password);
		
		newUser = new JCheckBox("New here? Click to Register");
		checkboxPanel.add(newUser);
		
		
		frame.getContentPane().add(BorderLayout.NORTH, title);
		frame.getContentPane().add(BorderLayout.SOUTH, buttonsPanel);
		frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
		// Register the listeners
		ok.addActionListener(new ButtonListener1() );
		cancel.addActionListener(new ButtonListener2() );
		newUser.addActionListener(new ButtonListener3() );
		
	}
	
	private class ButtonListener1 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String tempStr = id.getText() + " " + String.copyValueOf(password.getPassword());
			System.out.print(tempStr);
		}
	}
	
	private class ButtonListener2 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	private class ButtonListener3 implements ActionListener {
		
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			JFrame f = new JFrame();
			JLabel label = new JLabel("Please Register");
			label.setHorizontalAlignment(JLabel.CENTER);
			f.getContentPane().add(BorderLayout.NORTH, label);
			
			JPanel newCenterPanel = new JPanel();
			f.getContentPane().add(BorderLayout.CENTER, newCenterPanel);
			
			
			JPanel newIDPanel = new JPanel();
			JPanel newPasswordPanel = new JPanel();
			JPanel newPasswordPanelConfirm = new JPanel();
			newCenterPanel.add(newIDPanel);
			newCenterPanel.add(newPasswordPanel);
			newCenterPanel.add(newPasswordPanelConfirm);
			
			newIDLabel = new JLabel("Username: ");
			newIDPanel.add(newIDLabel);
			
			newID = new JTextField(20);
			newIDPanel.add(newID);
			
			newPasswordLabel = new JLabel("Password: ");
			newPasswordPanel.add(newPasswordLabel);
			
			newPassword = new JPasswordField(20);
			newPasswordPanel.add(newPassword);
			
			newPasswordConfirmLabel = new JLabel("Confirm: ");
			newPasswordPanelConfirm.add(newPasswordConfirmLabel);
			
			newPasswordConfirm = new JPasswordField(20);
			newPasswordPanelConfirm.add(newPasswordConfirm);	
			
			JPanel newButtonsPanel = new JPanel();
			f.getContentPane().add(BorderLayout.SOUTH, newButtonsPanel);
			
			newOk = new JButton("OK");
			newButtonsPanel.add(newOk);
					
			newCancel = new JButton("Cancel");
			newButtonsPanel.add(newCancel);
			
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(450, 250);
			f.setVisible(true);
			f.setLocationRelativeTo(null);

			
			newOk.addActionListener(new ButtonListener4() );
			newCancel.addActionListener(new ButtonListener2() );
		}
	}
	
	private class ButtonListener4 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String tempStr = newID.getText() + " " + String.copyValueOf(newPassword.getPassword()) + " " + String.copyValueOf(newPasswordConfirm.getPassword());
			System.out.print(tempStr);
			
			System.exit(0);
		}
	}
	
}
