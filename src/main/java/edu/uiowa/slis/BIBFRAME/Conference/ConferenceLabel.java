package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			if (!theConference.commitNeeded) {
				pageContext.getOut().print(theConference.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			return theConference.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Conference for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			theConference.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for label tag ");
		}
	}
}

