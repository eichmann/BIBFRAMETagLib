package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IntegratingResource theIntegratingResource = (IntegratingResource)findAncestorWithClass(this, IntegratingResource.class);
			if (!theIntegratingResource.commitNeeded) {
				pageContext.getOut().print(theIntegratingResource.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			IntegratingResource theIntegratingResource = (IntegratingResource)findAncestorWithClass(this, IntegratingResource.class);
			return theIntegratingResource.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing IntegratingResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			IntegratingResource theIntegratingResource = (IntegratingResource)findAncestorWithClass(this, IntegratingResource.class);
			theIntegratingResource.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for subjectURI tag ");
		}
	}
}

