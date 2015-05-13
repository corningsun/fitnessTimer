/** Created on 2015年5月5日 下午12:54:52
 *
 * @author sunkn
 *
 * Copyright (C) 2015, KOAL SOFTWARE.
 */
package com.corning.fitnesstimer;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

/**
 * Servlet配置
 *
 * @author sunkn
 *
 */
@WebServlet(urlPatterns = "/*")
@VaadinServletConfiguration(ui = HelloUI.class, productionMode = false)
public class HelloServlet extends VaadinServlet {
	private static final long serialVersionUID = 1L;
}
