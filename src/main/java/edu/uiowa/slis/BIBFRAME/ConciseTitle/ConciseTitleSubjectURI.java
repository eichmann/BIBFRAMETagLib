package edu.uiowa.slis.BIBFRAME.ConciseTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConciseTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConciseTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConciseTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConciseTitle theConciseTitle = (ConciseTitle)findAncestorWithClass(this, ConciseTitle.class);
			if (!theConciseTitle.commitNeeded) {
				pageContext.getOut().print(theConciseTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ConciseTitle theConciseTitle = (ConciseTitle)findAncestorWithClass(this, ConciseTitle.class);
			return theConciseTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConciseTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ConciseTitle theConciseTitle = (ConciseTitle)findAncestorWithClass(this, ConciseTitle.class);
			theConciseTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for subjectURI tag ");
		}
	}
}

