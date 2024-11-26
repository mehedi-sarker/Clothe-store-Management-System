
package GUI;
import Entity.Clothe;
import EntityList.*;
import File.FileIO;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClothesApp extends JFrame implements ActionListener{
	Font titleFont = new Font("cambria",Font.BOLD,30);
	Font font15 = new Font("cambria",Font.BOLD,15);
	Font font20 = new Font("cambria",Font.BOLD,20);
	
	JTextField idTextField,nameTextField,sizeTextField,fabricTextField,colorTextField,priceTextField,quantityTextField,clotheTypeTextField;
	JTextField searchTextField,deleteTextField;
	JTextArea display;
	JButton addButton,updateButton,searchButton,deleteButton,clearButton,showAllButton,summerCollection,winterButton;
	JButton logoutButton;
	ClothesList clotheList = new ClothesList(100);
	
	
	public ClothesApp(){
		
		super("MY Store Management ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1040,850); 
		this.setLocation(250,0);
		this.getContentPane().setBackground(Color.orange);
		this.setLayout(null);


		FileIO.loadClothesFromFile(clotheList);


		
		JLabel title = new JLabel("Clothe Store Management System");
		title.setBounds(500,10,500,50); 
		title.setFont(titleFont);
		
		JLabel subTitle = new JLabel("Clothe Inventory");
		subTitle.setBounds(600,60,320,50); 
		subTitle.setFont(new Font("Cambria",Font.BOLD,25));
		
		
		
		int top = 85;
		int gap = 40;
		
		JLabel idLabel = new JLabel("Clothe ID");
		idLabel.setBounds(20,top,200,30); 
		idLabel.setFont(font15);
		
		idTextField = new JTextField();
		idTextField.setBounds(20,top+=gap,200,30); 
		idTextField.setFont(font15);
		
		
		JLabel nameLabel = new JLabel("Clothe Name");
		nameLabel.setBounds(20,top+=gap,200,30); 
		nameLabel.setFont(font15);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(20,top+=gap,200,30); 
		nameTextField.setFont(font15);
		
		
		JLabel sizeLabel = new JLabel("clothes Size ");
		sizeLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		sizeLabel.setFont(font15);
		
		sizeTextField = new JTextField();
		sizeTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		sizeTextField.setFont(font15);
		
		
		JLabel fabricLabel = new JLabel("Clothes Fabric");
		fabricLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		fabricLabel.setFont(font15);
		
		fabricTextField = new JTextField();
		fabricTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		fabricTextField.setFont(font15);
		
		
		JLabel quantityLabel = new JLabel("Clothes Qauntity");
		quantityLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		quantityLabel.setFont(font15);
		
		quantityTextField = new JTextField();
		quantityTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		quantityTextField.setFont(font15);
		
		
		JLabel colorLabel = new JLabel("clothes color ");
		colorLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		colorLabel.setFont(font15);
		
		colorTextField = new JTextField();
		colorTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		colorTextField.setFont(font15);
		
		
		JLabel clotheTypeLabel = new JLabel("Clothe Type");
		clotheTypeLabel.setBounds(20,top+=gap,200,30); 
		clotheTypeLabel.setFont(font15);
		
		clotheTypeTextField = new JTextField();
		clotheTypeTextField.setBounds(20,top+=gap,200,30); 
		clotheTypeTextField.setFont(font15);
		
		
		JLabel priceLabel = new JLabel("clothes price ");
		priceLabel.setBounds(20,top+=gap,200,30); //X,Y,W,H
		priceLabel.setFont(font15);
		
		priceTextField = new JTextField();
		priceTextField.setBounds(20,top+=gap,200,30); //X,Y,W,H
		priceTextField.setFont(font15);
		
		addButton = new JButton("ADD");
		addButton.setBounds(1000,350,200,30); //X,Y,W,H
		addButton.setBackground(Color.GREEN);
		addButton.setFont(font15);
		addButton.addActionListener(this);
		
	
		updateButton = new JButton("UPDATE");
		updateButton.setBounds(1000,400,200,30); //X,Y,W,H
		updateButton.setBackground(Color.BLUE);
		updateButton.setForeground(Color.WHITE);
		updateButton.setFont(font15);
		updateButton.addActionListener(this);
		
		
	
		top = 100;
		gap = 40;
		
		JLabel searchLabel = new JLabel("Search By Clothe ID");
		searchLabel.setBounds(1000,top,200,30); 
		searchLabel.setFont(font15);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(1000,top+=gap,200,30); 
		searchTextField.setFont(font15);
		
		searchButton = new JButton("SEARCH");
		searchButton.setBounds(1000,top+=gap,200,30); //X,Y,W,H
		searchButton.setBackground(Color.YELLOW);
		searchButton.setFont(font15);
		searchButton.addActionListener(this);
		
		
		
		JLabel deleteLabel = new JLabel("Delete By Clothe ID");
		deleteLabel.setBounds(1000,top+=gap,200,30); //X,Y,W,H
		deleteLabel.setFont(font15);
		
		deleteTextField = new JTextField();
		deleteTextField.setBounds(1000,top+=gap,200,30); //X,Y,W,H
		deleteTextField.setFont(font15);
		
		deleteButton = new JButton("DELETE");
		deleteButton.setBounds(1000,300,200,30); //X,Y,W,H
		deleteButton.setBackground(Color.RED);
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setFont(font15);
		deleteButton.addActionListener(this);
		
		
		summerCollection = new JButton("Summer Collection");
		summerCollection.setBounds(1000,500,200,30); 
		summerCollection.setBackground(new Color (0xdb6320));
		summerCollection.setForeground(Color.WHITE);
		summerCollection.setFont(font15);
		summerCollection.addActionListener(this);
		
		winterButton = new JButton("Winter Collection");
		winterButton.setBounds(1000,550,200,30); 
		winterButton.setBackground(Color.BLUE);
		winterButton.setForeground(Color.WHITE);
		winterButton.setFont(font15);
		winterButton.addActionListener(this);
		
		
		showAllButton = new JButton("SHOW ALL");
		showAllButton.setBounds(1000,600,200,30); 
		showAllButton.setBackground(Color.PINK);
		showAllButton.setForeground(Color.WHITE);
		showAllButton.setFont(font15);
		showAllButton.addActionListener(this);
		
	
		
		clearButton = new JButton("CLEAR SCREEN");
		clearButton.setBounds(1000,650,200,30); //X,Y,W,H
		clearButton.setBackground(Color.DARK_GRAY);
		clearButton.setForeground(Color.WHITE);
		clearButton.setFont(font15);
		clearButton.addActionListener(this);
		
		//////////logout////////
		logoutButton = new JButton("Logout");
		logoutButton.setBounds(1000,700,200,30);
		logoutButton.setBackground(Color.RED);
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setFont(font15);
		logoutButton.addActionListener(this);
		
		
		display = new JTextArea();
		display.setFont(font20);
		JScrollPane jsp = new JScrollPane(display);
		jsp.setBounds(450,200,400,500);
		this.add(jsp);
		
		reloadData();
		
		
		
		
		
		this.add(title);
		this.add(subTitle);
		this.add(idLabel);
		this.add(idTextField);
		this.add(nameLabel);
		this.add(nameTextField);
		this.add(sizeLabel);
		this.add(sizeTextField);
		this.add(fabricLabel);
		this.add(fabricTextField);
		this.add(quantityLabel);
		this.add(quantityTextField);
		this.add(colorLabel);
		this.add(colorTextField);
		this.add(priceLabel);
		this.add(priceTextField);
		this.add(clotheTypeLabel);
		this.add(clotheTypeTextField);
		this.add(addButton);
		this.add(updateButton);
		this.add(searchLabel);
		this.add(searchTextField);
		this.add(searchButton);
		this.add(summerCollection);
		this.add(winterButton);
		this.add(deleteLabel);
		this.add(deleteTextField);
		this.add(deleteButton);
		this.add(clearButton);
		this.add(showAllButton);
		this.add(logoutButton);
		
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(addButton == e.getSource()){
			System.out.println("ADD CLICKED");
			if(clotheList.getById(idTextField.getText())==null){
				if(!idTextField.getText().isEmpty() && 
				!nameTextField.getText().isEmpty() && 
				!sizeTextField.getText().isEmpty() && 
				!fabricTextField.getText().isEmpty() && 
				!priceTextField.getText().isEmpty() && 
				!colorTextField.getText().isEmpty() && 
				!quantityTextField.getText().isEmpty() ){
					Clothe c = new Clothe(nameTextField.getText(),
										sizeTextField.getText(),
										 colorTextField.getText(),
										fabricTextField.getText(),
									     idTextField.getText(),
										 clotheTypeTextField.getText(),
										Integer.parseInt(priceTextField.getText()),
										Integer.parseInt( quantityTextField.getText()));
					                    clotheList.insert(c);
                                   FileIO.writeClothesInFile(c);
					reloadData();
				}
				else{
					JOptionPane.showMessageDialog(this,"Please Provide All Information","Missing Data",JOptionPane.ERROR_MESSAGE);
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Id Already Used","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			
			
			clearTextFields();
			
			
		}
		else if(updateButton == e.getSource()){
			System.out.println("UPDATE CLICKED");
			
			
			Clothe c = clotheList.getById(idTextField.getText());
			if (c != null) {
				if (!nameTextField.getText().isEmpty()) {
					c.setName(nameTextField.getText());
				}
				if (!sizeTextField.getText().isEmpty()) {
					c.setSize(sizeTextField.getText());
				}
				if (!fabricTextField.getText().isEmpty()) {
					c.setFabric(fabricTextField.getText());
				}
				if (!colorTextField.getText().isEmpty()) {
					c.setColor(colorTextField.getText());
				}
				if (!priceTextField.getText().isEmpty()) {
					c.setPrice(Integer.parseInt(priceTextField.getText()));
				}
				if (!quantityTextField.getText().isEmpty()) {
					c.setQuantity(Integer.parseInt(quantityTextField.getText()));
				}
				if (!clotheTypeTextField.getText().isEmpty()) {
					c.setClotheType(clotheTypeTextField.getText());
				}

        reloadData();
        JOptionPane.showMessageDialog(this, "Clothe information updated successfully.");
		}
		else {
        JOptionPane.showMessageDialog(this, "No clothe found with this ID.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		clearTextFields();
		
	
	}
		
			
		
		else if(searchButton == e.getSource()){
			System.out.println("SEARCH CLICKED");	
			Clothe c = clotheList.getById( searchTextField.getText());
			if( c!= null){
				display.setText(c.getClotheAsString());
			}
			else{
				JOptionPane.showMessageDialog(this,"No clothe Found with this ID");
			}
			
			clearTextFields();
			
		}
		else if(deleteButton == e.getSource()){
			System.out.println("DELETE CLICKED");
			Clothe c = clotheList.getById( deleteTextField.getText());
			if(c!=null){
				clotheList.removeById(deleteTextField.getText());
				reloadData();
			}
			else{
				JOptionPane.showMessageDialog(this,"No cLOTHE Found with this ID","Error",JOptionPane.WARNING_MESSAGE);
			}	
              clearTextFields();
		}


		else if (winterButton == e.getSource()) {
			System.out.println("WINTER COLLECTION CLICKED");
			String winterCollection = clotheList.getClotheTypeAsString("winter");
			if (!winterCollection.isEmpty()) {
				display.setText(winterCollection);
			} else {
				JOptionPane.showMessageDialog(this, "No Winter Collection Found", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		}
				else if (summerCollection == e.getSource()) {
			System.out.println("SUMMER COLLECTION CLICKED");
			String summerCo = clotheList.getClotheTypeAsString("summer");
			if (!summerCo.isEmpty()) {
				display.setText(summerCo);
			} else {
				JOptionPane.showMessageDialog(this, "No Summer Collection Found", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		}

		
		else if(showAllButton == e.getSource()){
			System.out.println("SHOW ALL CLICKED");
			reloadData();
		}
		else if(clearButton == e.getSource()){
			System.out.println("CLEAR CLICKED");
			reloadData();
			
			clearTextFields();
			
			
		}
		else if(logoutButton == e.getSource()){
			System.out.println("Logout CLICKED");
			
			
			this.dispose();
		}
	}
	
	public void reloadData(){
		display.setText(clotheList.getAllClotheAsString());
	}
	
	
	
	public void clearTextFields() {
    idTextField.setText("");
    nameTextField.setText("");
    sizeTextField.setText("");
    fabricTextField.setText("");
    colorTextField.setText("");
    priceTextField.setText("");
    quantityTextField.setText("");
    clotheTypeTextField.setText("");
    searchTextField.setText("");
    deleteTextField.setText("");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}