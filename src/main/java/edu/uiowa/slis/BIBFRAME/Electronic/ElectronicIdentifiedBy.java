package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicIdentifiedByIterator theElectronicIdentifiedByIterator = (ElectronicIdentifiedByIterator)findAncestorWithClass(this, ElectronicIdentifiedByIterator.class);
			pageContext.getOut().print(theElectronicIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

