package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicCopyrightDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicCopyrightDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicCopyrightDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicCopyrightDateIterator theElectronic = (ElectronicCopyrightDateIterator)findAncestorWithClass(this, ElectronicCopyrightDateIterator.class);
			pageContext.getOut().print(theElectronic.getCopyrightDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for copyrightDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for copyrightDate tag ");
		}
		return SKIP_BODY;
	}
}

