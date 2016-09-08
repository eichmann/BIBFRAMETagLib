package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicExtent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicExtent currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicExtent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicExtentIterator theElectronic = (ElectronicExtentIterator)findAncestorWithClass(this, ElectronicExtentIterator.class);
			pageContext.getOut().print(theElectronic.getExtent());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for extent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for extent tag ");
		}
		return SKIP_BODY;
	}
}

