package DI.JavaFX;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import Dao.*;
import Copiao.*;

import Copiao.TipoEmergencia;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class Cumtroller implements Initializable {

	Controller ventana;
	@FXML
	private Button BtonLlamar;

	@FXML
	private TextArea AreaTexto;

	@FXML
	private RadioButton RadioTrafico;

	@FXML
	private ToggleGroup accidente;

	@FXML
	private RadioButton RadioIncendio;

	@FXML
	private RadioButton RadioCasero;

	@FXML
	private RadioButton RadioZaragoza;

	@FXML
	private ToggleGroup Localidad;

	@FXML
	private RadioButton RadioHuesca;

	@FXML
	private RadioButton RadioTeruel;

	@FXML
	void llamar(ActionEvent event) {
		if (RadioTrafico.isSelected()) {

			if (RadioZaragoza.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.AccidenteTrafico,
						RadioZaragoza.getText()));

			}
			if (RadioHuesca.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.AccidenteTrafico,
						RadioHuesca.getText()));

			}
			if (RadioTeruel.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.AccidenteTrafico,
						RadioTeruel.getText()));

			}

		}

		if (RadioIncendio.isSelected()) {

			if (RadioZaragoza.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.IncendioInundacion,
						RadioZaragoza.getText()));

			}
			if (RadioHuesca.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.IncendioInundacion,
						RadioHuesca.getText()));

			}
			if (RadioTeruel.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.IncendioInundacion,
						RadioTeruel.getText()));

			}

		}

		if (RadioCasero.isSelected()) {

			if (RadioZaragoza.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.AccidenteCasero,
						RadioZaragoza.getText()));

			}
			if (RadioHuesca.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.AccidenteCasero,
						RadioHuesca.getText()));

			}
			if (RadioTeruel.isSelected()) {

				AreaTexto.setText(ventana.UnidadesActivas.enviarEmergencia(TipoEmergencia.AccidenteCasero,
						RadioTeruel.getText()));

			}

		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
