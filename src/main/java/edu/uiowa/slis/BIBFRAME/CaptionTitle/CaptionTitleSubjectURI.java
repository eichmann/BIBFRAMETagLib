package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CaptionTitle theCaptionTitle = (CaptionTitle)findAncestorWithClass(this, CaptionTitle.class);
			if (!theCaptionTitle.commitNeeded) {
				pageContext.getOut().print(theCaptionTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CaptionTitle theCaptionTitle = (CaptionTitle)findAncestorWithClass(this, CaptionTitle.class);
			return theCaptionTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CaptionTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CaptionTitle theCaptionTitle = (CaptionTitle)findAncestorWithClass(this, CaptionTitle.class);
			theCaptionTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for subjectURI tag ");
		}
	}
}

