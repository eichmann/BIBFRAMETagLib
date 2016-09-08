package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMovement theNotatedMovement = (NotatedMovement)findAncestorWithClass(this, NotatedMovement.class);
			if (!theNotatedMovement.commitNeeded) {
				pageContext.getOut().print(theNotatedMovement.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NotatedMovement theNotatedMovement = (NotatedMovement)findAncestorWithClass(this, NotatedMovement.class);
			return theNotatedMovement.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NotatedMovement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NotatedMovement theNotatedMovement = (NotatedMovement)findAncestorWithClass(this, NotatedMovement.class);
			theNotatedMovement.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for subjectURI tag ");
		}
	}
}

