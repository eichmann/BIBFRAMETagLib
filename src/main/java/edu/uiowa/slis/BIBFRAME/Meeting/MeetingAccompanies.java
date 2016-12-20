package edu.uiowa.slis.BIBFRAME.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MeetingAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingAccompaniesIterator theMeetingAccompaniesIterator = (MeetingAccompaniesIterator)findAncestorWithClass(this, MeetingAccompaniesIterator.class);
			pageContext.getOut().print(theMeetingAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

