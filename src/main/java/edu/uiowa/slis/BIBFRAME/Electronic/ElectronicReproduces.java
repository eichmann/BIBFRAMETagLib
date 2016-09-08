package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicReproduces extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicReproducesIterator theElectronicReproducesIterator = (ElectronicReproducesIterator)findAncestorWithClass(this, ElectronicReproducesIterator.class);
			pageContext.getOut().print(theElectronicReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

