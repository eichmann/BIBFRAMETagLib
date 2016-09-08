package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicNotationSystem extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicNotationSystem currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicNotationSystem.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicNotationSystemIterator theElectronic = (ElectronicNotationSystemIterator)findAncestorWithClass(this, ElectronicNotationSystemIterator.class);
			pageContext.getOut().print(theElectronic.getNotationSystem());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for notationSystem tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for notationSystem tag ");
		}
		return SKIP_BODY;
	}
}

