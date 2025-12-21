import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import java.applet.*;

/*
<applet code="SimpleApplet" width=400 height=750>
</applet>
*/

public class Registration extends Applet implements ItemListener,ActionListener{

    Label nameLabel, uniRollNoLabel, genderLabel, streamLabel, favSubLabel, feedBackLabel;
    TextField nameField, uniRollField;
    CheckboxGroup genderCheckboxGroup;
    Checkbox javaCheckbox, cCheckbox, pythonCheckbox,male,female,other;
    Choice streamChoice;
    TextArea feedbackArea;
    Button submitButton;





    public void init() {
        setBackground(Color.WHITE);

        setLayout(null);

        nameLabel=new Label("Name: ");
        uniRollNoLabel=new Label("University Roll Number: ");
        genderLabel=new Label("Gender: ");
        streamLabel=new Label("Stream: ");
        favSubLabel=new Label("Favorite Subject: ");
        feedBackLabel=new Label("Feedback: ");

        nameField=new TextField();
        uniRollField=new TextField();

        genderCheckboxGroup=new CheckboxGroup();
        male=new Checkbox("Male",genderCheckboxGroup,false);
        female=new Checkbox("Female",genderCheckboxGroup,false);
        other=new Checkbox("Other",genderCheckboxGroup,false);

        streamChoice = new Choice();
        streamChoice.add("Select Stream");
        streamChoice.add("CSE");
        streamChoice.add("AIML");
        streamChoice.add("BCA");



    }

        public void start() {
    }

    public void run(){

    }

    public void stop() {
    }

    public void destroy() {
    }


    public void paint(Graphics g) {
        
    }
}