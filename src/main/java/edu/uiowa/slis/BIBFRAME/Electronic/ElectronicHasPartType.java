package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasPartIterator theElectronicHasPartIterator = (ElectronicHasPartIterator)findAncestorWithClass(this, ElectronicHasPartIterator.class);
			pageContext.getOut().print(theElectronicHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

