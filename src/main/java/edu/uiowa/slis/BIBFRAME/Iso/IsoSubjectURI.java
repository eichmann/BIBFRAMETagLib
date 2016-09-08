package edu.uiowa.slis.BIBFRAME.Iso;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsoSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsoSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IsoSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Iso theIso = (Iso)findAncestorWithClass(this, Iso.class);
			if (!theIso.commitNeeded) {
				pageContext.getOut().print(theIso.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Iso for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iso for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Iso theIso = (Iso)findAncestorWithClass(this, Iso.class);
			return theIso.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Iso for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iso for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Iso theIso = (Iso)findAncestorWithClass(this, Iso.class);
			theIso.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Iso for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iso for subjectURI tag ");
		}
	}
}

