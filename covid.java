package covid;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class covid {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://ncov.mohw.go.kr/").get();
			Elements todayElements = doc.select(".liveNum_today_new .datalist li .data");

			Elements beforeElements = doc.select(".liveNum ul li .before");

			System.out.println("[���� Ȯ���� ��Ȳ]");
			System.out.println(todayElements.first().text());
			System.out.println(beforeElements.first().text());


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

 public void CovidAwt(String todayNum, String beforeNum) {
	setTitle("ContentPane�� JFrame ����"); // �������� Ÿ��Ʋ �ޱ�
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Container contentPane = getContentPane(); // ����Ʈ�� �˾Ƴ���
	contentPane.setBackground(Color.yellow);
	contentPane.setLayout(new BorderLayout()); // ����Ʈ�ҿ� FlowLayout
												// ��ġ������ �ޱ�
	JLabel title_Label = new JLabel("Today Korea Covid");
	title_Label.setHorizontalAlignment(JLabel.CENTER);
	title_Label.setFont(new Font("Verdana", Font.PLAIN, 25));
	title_Label.setForeground(Color.yellow);
	contentPane.add(title_Label, BorderLayout.NORTH);

	
	JLabel todayNum_Label = new JLabel(todayNum);
	todayNum_Label.setHorizontalAlignment(JLabel.CENTER);
	todayNum_Label.setFont(new Font("Verdana", Font.PLAIN, 200));
	todayNum_Label.setForeground(Color.blue);

	contentPane.add(todayNum_Label, BorderLayout.CENTER);

	
	JLabel beforeNum_Label = new JLabel(beforeNum);
	beforeNum_Label.setHorizontalAlignment(JLabel.CENTER);
	beforeNum_Label.setFont(new Font("Verdana", Font.PLAIN, 25));
	beforeNum_Label.setForeground(Color.blue);
	
	contentPane.add(beforeNum_Label, BorderLayout.SOUTH);

	setSize(300, 300);
	setVisible(true); // ȭ�鿡 ������ ���
}

private void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}

private void setSize(int i, int j) {
	// TODO Auto-generated method stub
	
}

private Container getContentPane() {
	// TODO Auto-generated method stub
	return null;
}

private void setDefaultCloseOperation(int exitOnClose) {
	// TODO Auto-generated method stub
	
}

private void setTitle(String string) {
	// TODO Auto-generated method stub
	
	}
}
