package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicIdentifiedByIterator theElectronicIdentifiedByIterator = (ElectronicIdentifiedByIterator)findAncestorWithClass(this, ElectronicIdentifiedByIterator.class);
			pageContext.getOut().print(theElectronicIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

