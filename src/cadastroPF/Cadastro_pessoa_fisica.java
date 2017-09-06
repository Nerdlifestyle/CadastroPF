package cadastroPF;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
	public class Cadastro_pessoa_fisica extends JFrame {
			JTextField v1 = new JTextField();
			JTextField v2 = new JTextField();
			JTextField v3 = new JTextField();
			JTextField v4 = new JTextField();
			JTextField v5 = new JTextField();
			JTextField v6 = new JTextField();
			JTextField v7 = new JTextField();
			JTextField v8 = new JTextField();
			JTextField v9 = new JTextField();
			JTextField v10 = new JTextField();
			JLabel t1 = new JLabel("name:");
			JLabel t2 = new JLabel("Endereço:");
			JLabel t3 = new JLabel("Bairro:");
			JLabel t4 = new JLabel("CEP:");
			JLabel t5 = new JLabel("Cidade:");
			JLabel t6 = new JLabel("Estado:");
			JLabel t7 = new JLabel("Telefone:");
			JLabel t8 = new JLabel("Celular:");
			JLabel t9 = new JLabel("RG:");
			JLabel t10 = new JLabel("CPF:");
			JButton b1 = new JButton("Limpar");
			JButton b2 = new JButton("Enviar");
				public Cadastro_pessoa_fisica(){
					super("Cadastro"); 
						this.setSize(390,600); 
						this.setVisible(true); 
						this.setDefaultCloseOperation(EXIT_ON_CLOSE);
						Container paine = this.getContentPane();
						paine.setLayout(null);
						paine.add(v1);
						v1.setBounds(160, 20, 200, 30);
						paine.add(v2);
						v2.setBounds(160, 70, 200, 30);
						paine.add(v3);
						v3.setBounds(160, 120, 200, 30);
						paine.add(v4);
						v4.setBounds(160, 170, 200, 30);
						paine.add(v5);
						v5.setBounds(160, 220, 200, 30);
						paine.add(v6);
						v6.setBounds(160, 270, 200, 30);
						paine.add(v7);
						v7.setBounds(160, 320, 200, 30);
						paine.add(v8);
						v8.setBounds(160, 370, 200, 30);
						paine.add(v9);
						v9.setBounds(160, 420, 200, 30);
						paine.add(v10);
						v10.setBounds(160, 470, 200, 30);
						paine.add(t1);
						t1.setBounds(100 ,20 ,200 , 30);
						paine.add(t2);
						t2.setBounds(100, 70, 200, 30);
						paine.add(t3);
						t3.setBounds(100 ,120 ,200 , 30);
						paine.add(t4);
						t4.setBounds(100 ,170 ,200 , 30);
						paine.add(t5);
						t5.setBounds(100 ,220 ,200 , 30);
						paine.add(t6);
						t6.setBounds(100 ,270 ,200 , 30);
						paine.add(t7);
						t7.setBounds(100 ,320 ,200 , 30);
						paine.add(t8);
						t8.setBounds(100 ,370 ,200 , 30);
						paine.add(t9);
						t9.setBounds(100 ,420 ,200 , 30);
						paine.add(t10);
						t10.setBounds(100 ,470 ,200 , 30);
						paine.add(b1);
						b1.setBounds(120, 520, 100, 30);
						b1.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								v1.setText("");
								v2.setText("");
								v3.setText("");
								v4.setText("");
								v5.setText("");
								v6.setText("");
								v7.setText("");
								v8.setText("");
								v9.setText("");
								v10.setText("");
							}
						});
						paine.add(b2);
						b2.setBounds(250, 520, 100, 30);
					}
				public static void main(String args[]){
					Cadastro_pessoa_fisica b = new Cadastro_pessoa_fisica();
				}
			
	}


