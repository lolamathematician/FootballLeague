package FootballLeagueFrontend;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.EventQueue;

public class HomeScreen extends JFrame {

	Dimension minimumSize = new Dimension(132, 175);

	public HomeScreen() {
		initUI();
	}

	private void pressedNewGameButton() {
		System.out.println("New game");
		dispose();
		new NewGameScreen().setVisible(true);
	}

	private void initUI() {

		var newGameButton = new JButton("New game");
		var loadGameButton = new JButton("Load game");
		var settingsButton = new JButton("Settings");
		var quitButton = new JButton("Quit");

		newGameButton.addActionListener((event) -> pressedNewGameButton());
		loadGameButton.addActionListener((event) -> System.exit(0));
		settingsButton.addActionListener((event) -> System.exit(0));
		quitButton.addActionListener((event) -> System.exit(0));

		var pane = getContentPane();

		var gl = new GroupLayout(pane);
		pane.setLayout(gl);

		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addGap(5, 1000, 1000)
				.addGroup(gl.createParallelGroup()
						.addComponent(newGameButton)
						.addComponent(loadGameButton)
						.addComponent(settingsButton)
						.addComponent(quitButton))
				.addGap(5, 1000, 1000)
		);
		
		gl.setVerticalGroup(gl.createSequentialGroup()
				.addGap(10, 20, 30)
				.addComponent(newGameButton)
				.addGap(10, 20, 30)
				.addComponent(loadGameButton)
				.addGap(10, 20, 30)
				.addComponent(settingsButton)
				.addGap(10, 20, 30)
				.addComponent(quitButton)
				.addGap(10, 20, 30)
		);

		gl.linkSize(newGameButton, loadGameButton, settingsButton, quitButton);

		gl.setAutoCreateContainerGaps(true);
		// gl.setAutoCreateGaps(true);

		pack();

		setTitle("Home screen");
		setSize(250, 200);
		setMinimumSize(minimumSize);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var ex = new HomeScreen();
			ex.setVisible(true);
		});
	}
}