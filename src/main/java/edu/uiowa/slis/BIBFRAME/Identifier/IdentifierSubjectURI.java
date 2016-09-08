package edu.uiowa.slis.BIBFRAME.Identifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentifierSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IdentifierSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentifierSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Identifier theIdentifier = (Identifier)findAncestorWithClass(this, Identifier.class);
			if (!theIdentifier.commitNeeded) {
				pageContext.getOut().print(theIdentifier.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Identifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identifier for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Identifier theIdentifier = (Identifier)findAncestorWithClass(this, Identifier.class);
			return theIdentifier.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Identifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identifier for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Identifier theIdentifier = (Identifier)findAncestorWithClass(this, Identifier.class);
			theIdentifier.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Identifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identifier for subjectURI tag ");
		}
	}
}

