package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Motivation theMotivation = (Motivation)findAncestorWithClass(this, Motivation.class);
			if (!theMotivation.commitNeeded) {
				pageContext.getOut().print(theMotivation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Motivation theMotivation = (Motivation)findAncestorWithClass(this, Motivation.class);
			return theMotivation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Motivation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Motivation theMotivation = (Motivation)findAncestorWithClass(this, Motivation.class);
			theMotivation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for subjectURI tag ");
		}
	}
}

