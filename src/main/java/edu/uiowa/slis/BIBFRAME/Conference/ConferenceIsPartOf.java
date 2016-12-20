package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceIsPartOfIterator theConferenceIsPartOfIterator = (ConferenceIsPartOfIterator)findAncestorWithClass(this, ConferenceIsPartOfIterator.class);
			pageContext.getOut().print(theConferenceIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

