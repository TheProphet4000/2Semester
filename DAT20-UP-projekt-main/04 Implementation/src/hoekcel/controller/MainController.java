package hoekcel.controller;

import hoekcel.Main;
import hoekcel.controller.errorHandler.InputErrorHandler;
import hoekcel.controller.export.Excel;
import hoekcel.validationHandler.InputValidation;
import hoekcel.model.IncomeStatement;
import hoekcel.model.IncomeStatementFactory;
import hoekcel.view.DisplayMode;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.math.BigInteger;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    IncomeStatementFactory incomeStatementFactory;
    IncomeStatement incomeStatement;
    InputValidation inputChecker;

    DisplayMode displayMode = DisplayMode.THOUSANDS;



    @FXML
    private Label mainLabel_Title, mainLabel_kr, mainLabel_Om, mainLabel_Vf, mainLabel_Btf, mainLabel_Mfomk,
            mainLabel_Mkbi, mainLabel_Indtbi, mainLabel_Resfr, mainLabel_Afskr, mainLabel_Ovkpomk,
            mainLabel_Rntomk, mainLabel_ResText, mainLabel_VisRes;

    @FXML
    private TextField mainText_Om, mainText_Mfomk, mainText_Mkbi, mainText_Ovkpomk, mainText_Indtbi,
            mainText_Afskr, mainText_Resfr, mainText_Rntomk, mainText_Vf, mainText_Btf;

    @FXML
    private Button mainButton_Close, mainButton_Help, mainButton_addComment, mainButton_VisBudget,
            mainButton_GenBudget, mainButton_Eksporter, mainButton_Oms, mainButton_Vareforbrug,
            mainButton_OvrigeKapOmk, mainButton_Afskrivninger;

    @FXML
    private ImageView toggleImage;

    @FXML
    private Button mainToggleButton_onAndOff;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.incomeStatementFactory = new IncomeStatementFactory();
        this.incomeStatement = incomeStatementFactory.getIncomeStatement();
        this.inputChecker = new InputValidation();



        mainText_Om.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Om.setText(oldValue);
                return;
            }

            if (checkInputNegativ(newValue)) {

                showError(InputErrorHandler.getHeaderText("negativ"), InputErrorHandler.getMessageText("negativ"));
                mainText_Om.setText(oldValue);
                return;
            }
            incomeStatement.setTurnover(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isFieldFilled(mainText_Vf)) {

                updateBtf();
            }
        });

        mainText_Vf.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Vf.setText(oldValue);
                return;
            }

            if (checkInputNegativ(newValue)) {

                showError(InputErrorHandler.getHeaderText("negativ"), InputErrorHandler.getMessageText("negativ"));
                mainText_Vf.setText(oldValue);
                return;
            }

            incomeStatement.setProductConsumption(new BigInteger((newValue.isEmpty()) ? "0" : newValue));
            if (isFieldFilled(mainText_Om)) {

                updateBtf();
            }
        });

        mainText_Btf.textProperty().addListener((observable, oldValue, newValue) -> {
            if (checkInputOnlydigits(newValue)) {

                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Btf.setText(oldValue);
                return;
            }

            incomeStatement.setGrossProfits(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isFieldFilled(mainText_Ovkpomk)) {

                updateMkbi();
            }
        });

        mainText_Mfomk.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Mfomk.setText(oldValue);
                return;
            }

            if (checkInputNegativ(newValue)) {

                showError(InputErrorHandler.getHeaderText("negativ"), InputErrorHandler.getMessageText("negativ"));
                mainText_Mfomk.setText(oldValue);
                return;
            }

            incomeStatement.setMarketingCost(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isFieldFilled(mainText_Btf)) {

                updateMkbi();
            }
        });

        mainText_Mkbi.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {

                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Mkbi.setText(oldValue);
                return;
            }

            incomeStatement.setMarketingContribution(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isFieldFilled(mainText_Ovkpomk)) {

                updateIndtbi();
            }
        });

        mainText_Ovkpomk.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {
                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Ovkpomk.setText(oldValue);
                return;
            }

            if (checkInputNegativ(newValue)) {

                showError(InputErrorHandler.getHeaderText("negativ"), InputErrorHandler.getMessageText("negativ"));
                mainText_Ovkpomk.setText(oldValue);
                return;
            }
            incomeStatement.setCapacityCost(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isFieldFilled(mainText_Mkbi)) {

                updateIndtbi();
            }
        });

        mainText_Indtbi.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {
                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Indtbi.setText(oldValue);
                return;
            }

            incomeStatement.setEarningsContribution(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isFieldFilled(mainText_Afskr)) {

                updateResfr();
            }
        });

        mainText_Afskr.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {
                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Afskr.setText(oldValue);
                return;
            }

            if (checkInputNegativ(newValue)) {

                showError(InputErrorHandler.getHeaderText("negativ"), InputErrorHandler.getMessageText("negativ"));
                mainText_Afskr.setText(oldValue);
                return;
            }

            incomeStatement.setDepreciations(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isFieldFilled(mainText_Indtbi)) {

                updateResfr();
            }
        });

        mainText_Resfr.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {
                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Resfr.setText(oldValue);
                return;
            }

            incomeStatement.setProfitBeforeInterest(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isAllFieldsFilled()) {

                updateVisRes();
            }
        });

        mainText_Rntomk.textProperty().addListener((observable, oldValue, newValue) -> {

            if (checkInputOnlydigits(newValue)) {
                showError(InputErrorHandler.getHeaderText("tegn"), InputErrorHandler.getMessageText("tegn"));
                mainText_Rntomk.setText(oldValue);
                return;
            }


            if (checkInputNegativ(newValue)) {

                showError(InputErrorHandler.getHeaderText("negativ"), InputErrorHandler.getMessageText("negativ"));
                mainText_Rntomk.setText(oldValue);
                return;
            }

            incomeStatement.setInterest(new BigInteger((newValue.isEmpty()) ? "0" : newValue));

            if (isAllFieldsFilled()) {

                updateVisRes();
            }
        });

    }

    private ArrayList<TextField> buildListOfTextFieldsExceptResultField() {
        var listOfFieldsExceptResult = new ArrayList<TextField>();
        listOfFieldsExceptResult.add(mainText_Om);
        listOfFieldsExceptResult.add(mainText_Vf);
        listOfFieldsExceptResult.add(mainText_Btf);
        listOfFieldsExceptResult.add(mainText_Mfomk);
        listOfFieldsExceptResult.add(mainText_Mkbi);
        listOfFieldsExceptResult.add(mainText_Ovkpomk);
        listOfFieldsExceptResult.add( mainText_Indtbi);
        listOfFieldsExceptResult.add(mainText_Afskr);
        listOfFieldsExceptResult.add(mainText_Resfr);
        listOfFieldsExceptResult.add(mainText_Rntomk);
        return listOfFieldsExceptResult;
    }

    public void exportToExcel() {
        var fileChooser = new FileChooser();
        fileChooser.setInitialFileName(String.format("Resultatopg??relse_%s", getDateTime()));
        var projectFile = fileChooser.showSaveDialog(Main.getScene().getWindow());
        if(projectFile != null) new Excel().export(incomeStatement.getFieldsAndValues(), projectFile.getAbsolutePath());
    }

    private String getDateTime() {
        var localDateTime = LocalDateTime.now();
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy_HHmm");
        return localDateTime.format(dateTimeFormatter);
    }

    @FXML
    private void flipDisplayMode() {
        if (displayMode.equals(DisplayMode.ONES)) {

            displayMode = DisplayMode.THOUSANDS;
            var toggleOnImage = new Image("assets/ToggleOn.png");
            mainLabel_kr.setText("Bel??b angives i 1000kr.");
            this.mainToggleButton_onAndOff.setText("Bel??b angives i 1000kr");
            toggleImage.setImage(toggleOnImage);
        } else {
            var toggleOffImage = new Image("assets/ToggleOff.png");
            toggleImage.setImage(toggleOffImage);
            mainLabel_kr.setText("Bel??b angives i 1kr.");
            mainToggleButton_onAndOff.setText("Bel??b angives i 1kr");
            displayMode = DisplayMode.ONES;
        }
    }

    private void updateBtf() {

        var turnover = incomeStatement.getTurnover();
        var productConsumption = incomeStatement.getProductConsumption();

        var grossProfit = incomeStatement.calculateGrossProfit(turnover, productConsumption);
        incomeStatement.setGrossProfits(grossProfit);

        mainText_Btf.setText(incomeStatement.getGrossProfits().toString());
    }

    private void updateVisRes() {

        var profitBeforeInterest = incomeStatement.getProfitsBeforeInterest();
        var interest = incomeStatement.getInterest();

        var result = incomeStatement.
                calculateResult(profitBeforeInterest, interest);

        incomeStatement.setResult(result);
        mainLabel_VisRes.setText(String.valueOf(incomeStatement.getResult()));
    }

    private void updateResfr() {

        var earningsContribution = incomeStatement.getEarningsContribution();
        var depreciation = incomeStatement.getDepreciations();

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);

        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);
        mainText_Resfr.setText(String.valueOf(incomeStatement.getProfitsBeforeInterest()));

    }

    private void updateIndtbi() {

        var marketingContribution = incomeStatement.getMarketingContribution();
        var capacityCost = incomeStatement.getCapacityCost();

        var earningsContribution = incomeStatement.calculateEarningsContribution(marketingContribution,
                capacityCost);

        incomeStatement.setEarningsContribution(earningsContribution);
        mainText_Indtbi.setText(String.valueOf(incomeStatement.getEarningsContribution()));
    }

    private void updateMkbi() {

        var grossProfits = incomeStatement.getGrossProfits();
        var marketingCosts = incomeStatement.getMarketingCost();

        var marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfits, marketingCosts);

        incomeStatement.setMarketingContribution(marketingContribution);
        mainText_Mkbi.setText(String.valueOf(incomeStatement.getMarketingContribution()));
    }

    private void showError(String headerText, String errorMessage) {

        var okButton = new ButtonType("Ok", ButtonBar.ButtonData.LEFT);
        Alert alert = new Alert(Alert.AlertType.NONE, errorMessage, okButton);

        alert.getDialogPane().getStylesheets().add("stylesheets/errorStyle.css");
        var dialogStage = (Stage) alert.getDialogPane().getScene().getWindow();

        dialogStage.getIcons().add(new Image("assets/whiteIconForError.png"));
        alert.setTitle(headerText);
        alert.setHeaderText(null);
        alert.setWidth(500);
        alert.setHeight(200);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.OK) {
            alert.close();
        }
    }

    private boolean checkInputOnlydigits(String input) {
        return inputChecker.onlyDigits(input);
    }

    private boolean checkInputNegativ(String input) {
        return inputChecker.isNegative(input);
    }

    private boolean isFieldFilled(TextField field) {
        return !field.getText().isEmpty();
    }

    private boolean isAllFieldsFilled() {
        var isFieldsFilled = true;

        for (TextField field : this.buildListOfTextFieldsExceptResultField()) {
            if(!isFieldFilled(field)){
                isFieldsFilled = false;
            }
        }

        return isFieldsFilled;
    }

}

