package ca.ulaval.glo2004.GUI.Listener.Action;

import ca.ulaval.glo2004.GUI.AppMasterFrame;
import ca.ulaval.glo2004.GUI.Mouse.CursorStateModifier;
import ca.ulaval.glo2004.GUI.ToolBarPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddJunctionPointModeAction extends ModeAction{
    public AddJunctionPointModeAction(AppMasterFrame masterFrame, ToolBarPanel toolBarPanel){
        super(masterFrame, toolBarPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        CursorStateModifier.addCursorModifier(masterFrame);
        masterFrame.setMode(AppMasterFrame.ApplicationMode.ADD_JUNCTION_POINT);
        if (toolBar.entryPointButton.isSelected())
            toolBar.entryPointButton.setSelected(false);
        if (toolBar.exitPointButton.isSelected())
            toolBar.exitPointButton.setSelected(false);
    }
}