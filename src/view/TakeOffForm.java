package view;

import java.time.LocalDateTime;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

import models.*;
import app.Control;

public class TakeOffForm extends Form {
    private Control control;
    public TakeOffForm(Control control) {
        super();
        this.control = control;
    }

    protected void buildForm() {
        addRequiredField("Código avión");
        addRequiredField("Destino");
    }

    void onSubmit(ActionEvent e) {
        var planeCode   = inputs.get("Código avión").getText();
        var destination = inputs.get("Destino").getText();

        control.requestTakeOff(new TakeOff(planeCode, LocalDateTime.now(), destination));
    }
}
