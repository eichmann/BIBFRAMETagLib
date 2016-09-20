package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceAtLocationIterator theConferenceAtLocationIterator = (ConferenceAtLocationIterator)findAncestorWithClass(this, ConferenceAtLocationIterator.class);
			pageContext.getOut().print(theConferenceAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

