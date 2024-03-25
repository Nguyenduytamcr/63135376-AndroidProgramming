package CoCaRo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Caro extends JFrame implements ActionListener{
	// đưa màu
	Color background_cl = Color.white;
	Color x_cl = Color.red;
	Color y_cl = Color.blue;
	int column = 20, row = 30, count = 0;
	//hỗ trợ phần đánh lại
	int xUndo[] = new int[column * row];
	int yUndo[] = new int[column * row];
	boolean tick[][] = new boolean[column + 2][row + 2]; //kiểm soát các ô đã đánh dấu
	// khai báo
	int Size = 0;
	Container cn;
	JPanel pn, pn2;
	JLabel lb;
	JButton newGame_bt, undo_bt, exit_bt;
	private JButton b[][] = new JButton[column + 2][row + 2];// tạo mảng chứa các button
	public Caro(String s) {
		super(s);
		cn =this.getContentPane();
		pn = new JPanel();
		pn.setLayout(new GridLayout(column,row));
		for (int i = 0; i <= column + 1; i++)
			for (int j = 0; j <= row + 1; j++) {
				b[i][j] = new JButton(" ");
				b[i][j].setActionCommand(i + " " + j);
				b[i][j].setBackground(background_cl);
				b[i][j].addActionListener(this);
				tick[i][j] = true;
			}
		for (int i = 1; i <= column; i++)
			for (int j = 1; j <= row; j++)
				pn.add(b[i][j]);
		lb = new JLabel("X Đánh Trước");
		newGame_bt = new JButton("New Game");
		undo_bt = new JButton("Undo");
		exit_bt = new JButton("Exit");
		newGame_bt.addActionListener(this);
		undo_bt.addActionListener(this);
		exit_bt.addActionListener(this);
		exit_bt.setForeground(x_cl);
		cn.add(pn);
		pn2 = new JPanel();
		pn2.setLayout(new FlowLayout());
		pn2.add(lb);
		pn2.add(newGame_bt);
		pn2.add(undo_bt);
		pn2.add(exit_bt);
		cn.add(pn2,"North");
		this.setVisible(true);
		this.setSize(1400, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		undo_bt.setEnabled(false);
	}
	// hàm kiểm tra chiến thắng
	public boolean checkWin(int i, int j) {
		int d = 0, k = i, h;
		// kiểm tra hàng
		while (b[k][j].getText() == b[i][j].getText()) {
			d++;
			k++;
		}
		k = i - 1;
		while (b[k][j].getText() == b[i][j].getText()) {
			d++;
			k--;
		}
		if (d > 4) return true;
		d = 0; h = j;
		// kiểm tra cột
		while(b[i][h].getText() == b[i][j].getText()) {
			d++;
			h++;
		}
		h = j - 1;
		while(b[i][h].getText() == b[i][j].getText()) {
			d++;
			h--;
		}
		if (d > 4) return true;
		// kiểm tra đường chéo 1
		h = i; k = j; d = 0;
		while (b[i][j].getText() == b[h][k].getText()) {
			d++;
			h++;
			k++;
		}
		h = i - 1; k = j - 1;
		while (b[i][j].getText() == b[h][k].getText()) {
			d++;
			h--;
			k--;
		}
		if (d > 4) return true;
		// kiểm tra đường chéo 2
		h = i; k = j; d = 0;
		while (b[i][j].getText() == b[h][k].getText()) {
			d++;
			h++;
			k--;
		}
		h = i - 1; k = j + 1;
		while (b[i][j].getText() == b[h][k].getText()) {
			d++;
			h--;
			k++;
		}
		if (d > 4) return true;
		// nếu không đương chéo nào thỏa mãn thì trả về false.
		return false;
	}
	// đánh thêm 1 bước vào bàn cờ caro
	public void addPoint(int i, int j) {
		if (Size > 0)
			b[xUndo[Size - 1]][yUndo[Size - 1]].setBackground(background_cl);
		xUndo[Size] = i;
		yUndo[Size] = j;
		Size++;
		if (count % 2 == 0) {
			b[i][j].setText("X");
			b[i][j].setForeground(x_cl);
			lb.setText("Lượt Của O");
		}
		else{
			b[i][j].setText("O");
			b[i][j].setForeground(y_cl);
			lb.setText("Lượt Của X");
		}
	}
	
	

}
