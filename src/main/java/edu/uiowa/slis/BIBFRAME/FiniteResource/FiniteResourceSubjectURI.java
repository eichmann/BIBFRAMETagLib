package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FiniteResource theFiniteResource = (FiniteResource)findAncestorWithClass(this, FiniteResource.class);
			if (!theFiniteResource.commitNeeded) {
				pageContext.getOut().print(theFiniteResource.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			FiniteResource theFiniteResource = (FiniteResource)findAncestorWithClass(this, FiniteResource.class);
			return theFiniteResource.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing FiniteResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			FiniteResource theFiniteResource = (FiniteResource)findAncestorWithClass(this, FiniteResource.class);
			theFiniteResource.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for subjectURI tag ");
		}
	}
}

