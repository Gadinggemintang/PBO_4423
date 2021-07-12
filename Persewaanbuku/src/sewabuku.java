import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalTime;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sewabuku {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sewabuku window = new sewabuku();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public sewabuku() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel 	toko = new JLabel("SEWA BUKU GADINGSHOP");
		toko.setFont(new Font("Tahoma", Font.BOLD, 18));
		toko.setBounds(400, 11, 404, 123);
		frame.getContentPane().add(toko);
		
		JLabel tanggal = new JLabel("TANGGAL :");
		tanggal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tanggal.setBounds(113, 120, 72, 45);
		frame.getContentPane().add(tanggal);
		
		JLabel jam = new JLabel("JAM :");
		jam.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jam.setBounds(757, 120, 72, 45);
		frame.getContentPane().add(jam);
		
		JLabel valuetanggal = new JLabel("");
		valuetanggal.setBounds(191, 136, 46, 14);
		frame.getContentPane().add(valuetanggal);
		String Waaktutanggal = LocalTime.now(valuetanggal);
		
		JLabel valuejam = new JLabel("");
		valuejam.setBounds(803, 136, 46, 14);
		frame.getContentPane().add(valuejam);
		frame.setBounds(100, 100, 964, 533);
		String waktujam = LocalTime.now(valuejam);
		valuejam.setText(waktujam);
		
		JLabel JudulBuku = new JLabel("Judul Buku :");
		JudulBuku.setBounds(113, 197, 72, 14);
		frame.getContentPane().add(JudulBuku);
		
		textField = new JTextField();
		textField.setBounds(183, 194, 125, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Biaya = new JLabel("Biaya :");
		Biaya.setBounds(559, 197, 46, 14);
		frame.getContentPane().add(Biaya);
		
		JLabel Total = new JLabel("Rp.");
		Total.setBounds(559, 227, 46, 14);
		frame.getContentPane().add(Total);
		
		table = new JTable();
		table.setBounds(23, 297, 900, 197);
		frame.getContentPane().add(table);
		
		JButton BtnSimpan = new JButton("Simpan");
		BtnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BtnSimpan.setBounds(96, 263, 89, 23);
		frame.getContentPane().add(BtnSimpan);
		
		JButton btnKembaliBuku = new JButton("Kembalikan Buku");
		btnKembaliBuku.setBounds(281, 263, 118, 23);
		frame.getContentPane().add(btnKembaliBuku);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(518, 263, 89, 23);
		frame.getContentPane().add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(740, 263, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		table_1 = new JTable();
		table_1.setBounds(23, 309, 204, 174);
		frame.getContentPane().add(table_1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
