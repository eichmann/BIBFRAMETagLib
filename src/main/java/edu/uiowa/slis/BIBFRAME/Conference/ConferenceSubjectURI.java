package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			if (!theConference.commitNeeded) {
				pageContext.getOut().print(theConference.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			return theConference.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Conference for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			theConference.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for subjectURI tag ");
		}
	}
}

