package org.mg.javalib.gui.property;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import weka.core.DistanceFunction;
import weka.gui.GenericObjectEditor;

public class WekaPropertyComponent extends JPanel implements PropertyComponent
{
	WekaProperty property;
	GenericObjectEditor editor;

	public WekaPropertyComponent(WekaProperty property)
	{
		this.property = property;
		editor = new GenericObjectEditor();
		if (property.getValue() instanceof DistanceFunction)
			editor.setClassType(DistanceFunction.class);
		else
			throw new IllegalStateException(
					"superclass unkonwn: " + property.getValue().getClass());
		editor.setValue(property.getValue());

		setLayout(new BorderLayout());
		add(editor.getCustomPanel());

		addPropertyChangeListener(new PropertyChangeListener()
		{
			@Override
			public void propertyChange(PropertyChangeEvent evt)
			{

			}
		});

	}
}
