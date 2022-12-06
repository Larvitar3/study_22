package Lotto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class LottoFrame extends JFrame implements ActionListener {

	final int FRAME_WIDTH = 500;
	final int FRAME_HEIGTH = 750;

	JLabel lottoTitle;
	JPanel lottoWrap;
	JLabel lottoSubTitle;
	JPanel lottoNumberWrap;
	JLabel lottoNum;
	JButton lottoButton;
	int[] numbers;

	LottoNumber lottoNumber = new LottoNumber();
	JLabel jLabel1 = new JLabel();

	public void setupLottoNumber() {
		numbers = lottoNumber.lottonNumSelected();
		jLabel1.setText(numbers[0] + "");
	}

	public LottoFrame() {
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
		lottoTitle.setFont(new Font("sanSerif", Font.BOLD, 50));
		lottoTitle.setForeground(Color.WHITE);
		lottoTitle.setHorizontalAlignment(JLabel.CENTER);
		lottoTitle.setOpaque(true);
		lottoTitle.setBackground(Color.BLACK);
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
		lottoSubTitle.setBackground(Color.darkGray);
		lottoSubTitle.setBorder(new TitledBorder(new LineBorder(Color.black)));
		// end of lottoSubTitle

		lottoNumberWrap.setSize(400, 350);
		lottoNumberWrap.setLocation(48, 130);
		lottoNumberWrap.setBackground(Color.LIGHT_GRAY);
		lottoNumberWrap.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY)));
		lottoNumberWrap.setLayout(null);
		// end of lottoNumberWrap

		lottoNumberWrap.add(lottoNum);
		lottoNum.setSize(300, 150);
		lottoNum.setLocation(50, 60);
		lottoNum.setHorizontalAlignment(JLabel.CENTER);
		lottoNum.setFont(new Font("sanSerif", Font.BOLD, 20));
		lottoNum.setForeground(Color.black);
		lottoNum.setOpaque(true);
		lottoNum.setBackground(Color.WHITE);
		lottoNum.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY)));

		lottoButton.setSize(400, 50);
		lottoButton.setLocation(48, 620);
		lottoButton.setFont(new Font("sanSerif", Font.BOLD, 20));
	}

	private void addEventListener() {
		lottoButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		numbers = lottoNumber.lottonNumSelected();

		lottoNum.setText("   ");
		for (int i = 0; i < numbers.length; i++) {

			lottoNum.setText(lottoNum.getText() + numbers[i] + "    ");
			System.out.println("실행");

		}
	}
}
