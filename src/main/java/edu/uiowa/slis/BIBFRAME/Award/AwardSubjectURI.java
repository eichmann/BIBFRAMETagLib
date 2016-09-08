package edu.uiowa.slis.BIBFRAME.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Award theAward = (Award)findAncestorWithClass(this, Award.class);
			if (!theAward.commitNeeded) {
				pageContext.getOut().print(theAward.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Award for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Award theAward = (Award)findAncestorWithClass(this, Award.class);
			return theAward.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Award for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Award theAward = (Award)findAncestorWithClass(this, Award.class);
			theAward.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Award for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for subjectURI tag ");
		}
	}
}

