package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicIsInstanceOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicIsInstanceOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicIsInstanceOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicIsInstanceOfIterator theElectronicIsInstanceOfIterator = (ElectronicIsInstanceOfIterator)findAncestorWithClass(this, ElectronicIsInstanceOfIterator.class);
			pageContext.getOut().print(theElectronicIsInstanceOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for isInstanceOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for isInstanceOf tag ");
		}
		return SKIP_BODY;
	}
}

