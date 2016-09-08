package edu.uiowa.slis.BIBFRAME.TitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleElementSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleElementSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleElementSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TitleElement theTitleElement = (TitleElement)findAncestorWithClass(this, TitleElement.class);
			if (!theTitleElement.commitNeeded) {
				pageContext.getOut().print(theTitleElement.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TitleElement theTitleElement = (TitleElement)findAncestorWithClass(this, TitleElement.class);
			return theTitleElement.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TitleElement theTitleElement = (TitleElement)findAncestorWithClass(this, TitleElement.class);
			theTitleElement.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for subjectURI tag ");
		}
	}
}

