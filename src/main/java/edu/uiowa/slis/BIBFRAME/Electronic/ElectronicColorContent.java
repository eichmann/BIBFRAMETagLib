package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicColorContent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicColorContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicColorContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicColorContentIterator theElectronic = (ElectronicColorContentIterator)findAncestorWithClass(this, ElectronicColorContentIterator.class);
			pageContext.getOut().print(theElectronic.getColorContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for colorContent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for colorContent tag ");
		}
		return SKIP_BODY;
	}
}

