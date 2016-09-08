package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Title theTitle = (Title)findAncestorWithClass(this, Title.class);
			if (!theTitle.commitNeeded) {
				pageContext.getOut().print(theTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Title for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Title theTitle = (Title)findAncestorWithClass(this, Title.class);
			return theTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Title for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Title theTitle = (Title)findAncestorWithClass(this, Title.class);
			theTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Title for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for subjectURI tag ");
		}
	}
}

