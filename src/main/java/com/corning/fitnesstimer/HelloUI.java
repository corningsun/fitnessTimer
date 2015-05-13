/** Created on 2015年5月5日 下午12:48:40
 *
 * @author sunkn
 *
 * Copyright (C) 2015, KOAL SOFTWARE.
 */
package com.corning.fitnesstimer;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * 主界面，设置标题、主题、内容
 *
 * @author sunkn
 *
 */
@Title("HelloUI")
@Theme("valo")
public class HelloUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		setContent(new Label("Hello World!"));
	}
	
}
