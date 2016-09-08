package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstancePreferredCitation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstancePreferredCitation currentInstance = null;
	private static final Log log = LogFactory.getLog(InstancePreferredCitation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstancePreferredCitationIterator theInstance = (InstancePreferredCitationIterator)findAncestorWithClass(this, InstancePreferredCitationIterator.class);
			pageContext.getOut().print(theInstance.getPreferredCitation());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for preferredCitation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for preferredCitation tag ");
		}
		return SKIP_BODY;
	}
}

