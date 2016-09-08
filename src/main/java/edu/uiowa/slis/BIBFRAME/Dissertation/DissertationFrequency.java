package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DissertationFrequencyIterator theDissertation = (DissertationFrequencyIterator)findAncestorWithClass(this, DissertationFrequencyIterator.class);
			pageContext.getOut().print(theDissertation.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for frequency tag ");
		}
		return SKIP_BODY;
	}
}

