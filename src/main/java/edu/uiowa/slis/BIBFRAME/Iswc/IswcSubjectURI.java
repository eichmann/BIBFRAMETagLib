package edu.uiowa.slis.BIBFRAME.Iswc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IswcSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IswcSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IswcSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Iswc theIswc = (Iswc)findAncestorWithClass(this, Iswc.class);
			if (!theIswc.commitNeeded) {
				pageContext.getOut().print(theIswc.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Iswc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iswc for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Iswc theIswc = (Iswc)findAncestorWithClass(this, Iswc.class);
			return theIswc.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Iswc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iswc for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Iswc theIswc = (Iswc)findAncestorWithClass(this, Iswc.class);
			theIswc.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Iswc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iswc for subjectURI tag ");
		}
	}
}

