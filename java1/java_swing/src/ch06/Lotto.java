package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Lotto extends JFrame implements ActionListener {

	final int FRAME_WIDTH = 500;
	final int FRAME_HEIGTH = 800;
	int[] lottoNumber = new int[6];

	JLabel lottoTitle;
	JPanel lottoWrap;
	JLabel lottoSubTitle;
	JPanel lottoNumberWrap;
	JLabel lottoNum;
	JButton lottoButton;

	public Lotto() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(FRAME_WIDTH, FRAME_HEIGTH);
		setTitle("로또 번호 추첨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lottoTitle = new JLabel("★ LOTTO ★");
		lottoWrap = new JPanel();
		lottoSubTitle = new JLabel("▼ LOTTO 번호 추천받기 ▼");
		lottoNumberWrap = new JPanel();
		lottoButton = new JButton("번호 확인하기");
		lottoNum = new JLabel();

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(null);

		add(lottoTitle);
		add(lottoWrap);
		lottoWrap.add(lottoSubTitle);
		lottoWrap.add(lottoNumberWrap);
		lottoWrap.setLayout(null);
		lottoNumberWrap.setLayout(null);
		add(lottoButton);

		lottoTitle.setSize(FRAME_WIDTH, 200);
		lottoTitle.setLocation(0, 0);
		lottoTitle.setFont(new Font("Serif", Font.BOLD, 50));
		lottoTitle.setForeground(Color.WHITE);
		lottoTitle.setHorizontalAlignment(JLabel.CENTER);
		lottoTitle.setOpaque(true);
		lottoTitle.setBackground(Color.PINK);
		// end of lottoTitle

		lottoWrap.setSize(FRAME_WIDTH, 400);
		lottoWrap.setLocation(0, 200);
		// end of lottoWrap

		lottoSubTitle.setSize(400, 60);
		lottoSubTitle.setLocation(48, 50);
		lottoSubTitle.setFont(new Font("sanSerif", Font.BOLD, 20));
		lottoSubTitle.setForeground(Color.WHITE);
		lottoSubTitle.setHorizontalAlignment(JLabel.CENTER);
		lottoSubTitle.setOpaque(true);
		lottoSubTitle.setBackground(Color.ORANGE);
		lottoSubTitle.setBorder(new TitledBorder(new LineBorder(Color.pink)));
		// end of lottoSubTitle

		lottoNumberWrap.setSize(400, 350);
		lottoNumberWrap.setLocation(48, 130);
		lottoNumberWrap.setBackground(Color.ORANGE);
		lottoNumberWrap.setLayout(null);
		// end of lottoNumberWrap

		lottoNumberWrap.add(lottoNum);
		lottoNum.setSize(300, 150);
		lottoNum.setLocation(50, 60);
		lottoNum.setHorizontalAlignment(JLabel.CENTER);
		lottoNum.setFont(new Font("sanSerif", Font.BOLD, 20));
		lottoNum.setForeground(Color.WHITE);
		lottoNum.setOpaque(true);
		lottoNum.setBackground(Color.PINK);

		lottoButton.setSize(400, 50);
		lottoButton.setLocation(48, 620);
		lottoButton.setFont(new Font("sanSerif", Font.BOLD, 20));
		
	}

	private void addEventListener() {
		lottoButton.addActionListener(this);
	}

	public int[] getLotto() {

		Random random = new Random();

		for (int i = 0; i < lottoNumber.length; i++) {
			int j = random.nextInt(45) + 1;
			lottoNumber[i] = j;
			for (int e = 0; e < i; e++) {
				if (lottoNumber[i] == lottoNumber[e]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lottoNumber);
		// 오름차순 정렬 ▲

		return lottoNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		lottoNumber = getLotto();

		lottoNum.setText("   ");
		for (int i = 0; i < lottoNumber.length; i++) {

			lottoNum.setText(lottoNum.getText() + lottoNumber[i] + "    ");
			System.out.println("실행");

		}
	}
}