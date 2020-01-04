package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWin extends JFrame implements ActionListener {
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	ConfigurableApplicationContext boot;
	JTextField port = new JTextField("8080");
	String[] args;

	public mainWin(String[] args) throws HeadlessException {
		this.args = args;
		setSize(300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		////////////////////////////
		// 元件分布区域
		setLayout(new BorderLayout());
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel l = new JLabel("端口号：");
		l.setPreferredSize(new Dimension(60, 25));
		p2.add(l);
		port.setPreferredSize(new Dimension(60, 25));
		p2.add(port);
		add(p2, BorderLayout.NORTH);

		JPanel p1 = new JPanel(new GridLayout(1, 2));
		btn1.setText("开启");
		btn2.setText("关闭");
		p1.add(btn1);
		p1.add(btn2);
		add(p1, BorderLayout.CENTER);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn1.setEnabled(true);
		btn2.setEnabled(false);
		////////////////////////////
		setTitle("demo");
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 开启
		if (e.getSource().equals(btn1)) {
			btn1.setEnabled(false);
			btn2.setEnabled(true);
			args = new String[] { "--server.port=" + port.getText() };
			boot = SpringApplication.run(DemoApplication.class, args);
		}
		// 关闭
		else if (e.getSource().equals(btn2)) {
			btn1.setEnabled(true);
			btn2.setEnabled(false);
			SpringApplication.exit(boot);
		}
	}
}
