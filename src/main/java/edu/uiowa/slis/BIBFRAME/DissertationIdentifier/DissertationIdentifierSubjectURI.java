package edu.uiowa.slis.BIBFRAME.DissertationIdentifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIdentifierSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIdentifierSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIdentifierSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DissertationIdentifier theDissertationIdentifier = (DissertationIdentifier)findAncestorWithClass(this, DissertationIdentifier.class);
			if (!theDissertationIdentifier.commitNeeded) {
				pageContext.getOut().print(theDissertationIdentifier.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DissertationIdentifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DissertationIdentifier for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DissertationIdentifier theDissertationIdentifier = (DissertationIdentifier)findAncestorWithClass(this, DissertationIdentifier.class);
			return theDissertationIdentifier.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DissertationIdentifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DissertationIdentifier for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DissertationIdentifier theDissertationIdentifier = (DissertationIdentifier)findAncestorWithClass(this, DissertationIdentifier.class);
			theDissertationIdentifier.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DissertationIdentifier for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DissertationIdentifier for subjectURI tag ");
		}
	}
}

