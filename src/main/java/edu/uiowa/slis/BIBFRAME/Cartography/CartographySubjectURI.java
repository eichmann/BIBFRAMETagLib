package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			if (!theCartography.commitNeeded) {
				pageContext.getOut().print(theCartography.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			return theCartography.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cartography for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			theCartography.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for subjectURI tag ");
		}
	}
}

