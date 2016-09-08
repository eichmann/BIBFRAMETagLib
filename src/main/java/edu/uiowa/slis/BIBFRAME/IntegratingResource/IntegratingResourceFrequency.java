package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceFrequencyIterator theIntegratingResource = (IntegratingResourceFrequencyIterator)findAncestorWithClass(this, IntegratingResourceFrequencyIterator.class);
			pageContext.getOut().print(theIntegratingResource.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for frequency tag ");
		}
		return SKIP_BODY;
	}
}

