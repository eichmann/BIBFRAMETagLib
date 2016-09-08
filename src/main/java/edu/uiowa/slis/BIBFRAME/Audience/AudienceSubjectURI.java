package edu.uiowa.slis.BIBFRAME.Audience;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudienceSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudienceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AudienceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Audience theAudience = (Audience)findAncestorWithClass(this, Audience.class);
			if (!theAudience.commitNeeded) {
				pageContext.getOut().print(theAudience.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Audience for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audience for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Audience theAudience = (Audience)findAncestorWithClass(this, Audience.class);
			return theAudience.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Audience for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audience for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Audience theAudience = (Audience)findAncestorWithClass(this, Audience.class);
			theAudience.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Audience for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audience for subjectURI tag ");
		}
	}
}

