package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceName currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameIterator theConference = (ConferenceNameIterator)findAncestorWithClass(this, ConferenceNameIterator.class);
			pageContext.getOut().print(theConference.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for name tag ");
		}
		return SKIP_BODY;
	}
}

