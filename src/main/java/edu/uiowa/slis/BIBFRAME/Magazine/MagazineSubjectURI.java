package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Magazine theMagazine = (Magazine)findAncestorWithClass(this, Magazine.class);
			if (!theMagazine.commitNeeded) {
				pageContext.getOut().print(theMagazine.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Magazine theMagazine = (Magazine)findAncestorWithClass(this, Magazine.class);
			return theMagazine.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Magazine for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Magazine theMagazine = (Magazine)findAncestorWithClass(this, Magazine.class);
			theMagazine.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for subjectURI tag ");
		}
	}
}

