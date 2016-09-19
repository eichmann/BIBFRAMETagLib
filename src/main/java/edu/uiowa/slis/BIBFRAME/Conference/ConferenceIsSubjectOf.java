package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceIsSubjectOfIterator theConferenceIsSubjectOfIterator = (ConferenceIsSubjectOfIterator)findAncestorWithClass(this, ConferenceIsSubjectOfIterator.class);
			pageContext.getOut().print(theConferenceIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

