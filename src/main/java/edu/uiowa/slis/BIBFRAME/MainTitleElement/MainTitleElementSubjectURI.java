package edu.uiowa.slis.BIBFRAME.MainTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MainTitleElementSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MainTitleElementSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MainTitleElementSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MainTitleElement theMainTitleElement = (MainTitleElement)findAncestorWithClass(this, MainTitleElement.class);
			if (!theMainTitleElement.commitNeeded) {
				pageContext.getOut().print(theMainTitleElement.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MainTitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MainTitleElement theMainTitleElement = (MainTitleElement)findAncestorWithClass(this, MainTitleElement.class);
			return theMainTitleElement.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MainTitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MainTitleElement theMainTitleElement = (MainTitleElement)findAncestorWithClass(this, MainTitleElement.class);
			theMainTitleElement.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MainTitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for subjectURI tag ");
		}
	}
}

