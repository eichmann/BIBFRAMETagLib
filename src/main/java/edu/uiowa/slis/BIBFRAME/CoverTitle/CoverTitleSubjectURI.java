package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoverTitle theCoverTitle = (CoverTitle)findAncestorWithClass(this, CoverTitle.class);
			if (!theCoverTitle.commitNeeded) {
				pageContext.getOut().print(theCoverTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CoverTitle theCoverTitle = (CoverTitle)findAncestorWithClass(this, CoverTitle.class);
			return theCoverTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoverTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CoverTitle theCoverTitle = (CoverTitle)findAncestorWithClass(this, CoverTitle.class);
			theCoverTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for subjectURI tag ");
		}
	}
}

