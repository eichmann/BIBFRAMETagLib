package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitle theAbbreviatedTitle = (AbbreviatedTitle)findAncestorWithClass(this, AbbreviatedTitle.class);
			if (!theAbbreviatedTitle.commitNeeded) {
				pageContext.getOut().print(theAbbreviatedTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AbbreviatedTitle theAbbreviatedTitle = (AbbreviatedTitle)findAncestorWithClass(this, AbbreviatedTitle.class);
			return theAbbreviatedTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AbbreviatedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AbbreviatedTitle theAbbreviatedTitle = (AbbreviatedTitle)findAncestorWithClass(this, AbbreviatedTitle.class);
			theAbbreviatedTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for subjectURI tag ");
		}
	}
}

