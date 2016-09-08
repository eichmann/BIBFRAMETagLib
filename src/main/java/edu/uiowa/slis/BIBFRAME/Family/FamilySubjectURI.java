package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Family theFamily = (Family)findAncestorWithClass(this, Family.class);
			if (!theFamily.commitNeeded) {
				pageContext.getOut().print(theFamily.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Family for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Family theFamily = (Family)findAncestorWithClass(this, Family.class);
			return theFamily.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Family for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Family theFamily = (Family)findAncestorWithClass(this, Family.class);
			theFamily.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Family for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for subjectURI tag ");
		}
	}
}

