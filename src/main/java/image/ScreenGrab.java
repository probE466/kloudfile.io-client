package image;

import components.ScreenShotComponent;
import components.container.ComponentContainer;
import components.container.input.InputManagerManager;
import components.container.input.InputType;
import components.container.scene.SceneManager;
import config.Config;
import helper.ScreenHelper;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import java.awt.geom.Rectangle2D;

public class ScreenGrab {

    private static final Logger LOGGER = Logger.getLogger(ScreenGrab.class.getName());
    private final Config config;
    private final Stage stage;
    private final SceneManager sceneManager;
    private final InputManagerManager inputManager;
    private final ComponentContainer componentContainer;

    public ScreenGrab(final Config config, final Stage stage) {
        this.config = config;
        this.stage = stage;
        componentContainer = new ComponentContainer();
        inputManager = new InputManagerManager();
        sceneManager = new SceneManager(config, stage);
        componentContainer.add(new ScreenShotComponent(stage, config, ScreenHelper.getScreens(), sceneManager), new InputType[]{InputType.KEY_PRESSED});
    }

    public void start() {
    }


    private void setUpDragDropScene() {
    }

    private void showError(final String error) {
        LOGGER.fatal(error);
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText(error);

        alert.showAndWait();
    }










}