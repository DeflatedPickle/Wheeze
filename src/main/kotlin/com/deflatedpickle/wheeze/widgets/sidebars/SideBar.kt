package com.deflatedpickle.wheeze.widgets.sidebars

import com.deflatedpickle.wheeze.widgets.sidebars.panels.LayersPanel
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite

class SideBar(parent: Composite) : Composite(parent, SWT.BORDER) {
    val layersPane = LayersPanel(this)
}