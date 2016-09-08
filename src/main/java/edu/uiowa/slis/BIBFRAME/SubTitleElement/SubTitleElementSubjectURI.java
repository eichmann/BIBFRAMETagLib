package edu.uiowa.slis.BIBFRAME.SubTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubTitleElementSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SubTitleElementSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SubTitleElementSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SubTitleElement theSubTitleElement = (SubTitleElement)findAncestorWithClass(this, SubTitleElement.class);
			if (!theSubTitleElement.commitNeeded) {
				pageContext.getOut().print(theSubTitleElement.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SubTitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubTitleElement for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			SubTitleElement theSubTitleElement = (SubTitleElement)findAncestorWithClass(this, SubTitleElement.class);
			return theSubTitleElement.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing SubTitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubTitleElement for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			SubTitleElement theSubTitleElement = (SubTitleElement)findAncestorWithClass(this, SubTitleElement.class);
			theSubTitleElement.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing SubTitleElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubTitleElement for subjectURI tag ");
		}
	}
}

