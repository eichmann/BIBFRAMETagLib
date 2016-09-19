package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasPreferredTitleIterator theElectronicHasPreferredTitleIterator = (ElectronicHasPreferredTitleIterator)findAncestorWithClass(this, ElectronicHasPreferredTitleIterator.class);
			pageContext.getOut().print(theElectronicHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

